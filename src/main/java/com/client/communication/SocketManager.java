package com.client.communication;

import com.common.Message;
import com.common.Port;
import com.common.TestCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Queue;

@Component
public class SocketManager {
    static int port=10000;
    Socket clientSocket;


    Queue<Message> messagesReceive;
    Queue<Message> messagesSend;

    @Autowired
    Bridge bridge;


    public void connect() throws IOException {
        clientSocket = new Socket("localhost", port);
        Port p=((Port)bridge.receive(clientSocket));
        port=p.getPort();
        clientSocket=new Socket("localhost", port);

        sender();
        listener();
    }

    public void setMessages(Queue<Message> messagesReceive,Queue<Message> messagesSend ) throws IOException {
        this.messagesReceive = messagesReceive;
        this.messagesSend = messagesSend;
    }

    public void sender(){
        new Thread(()->{
            System.out.println("Start to send");
           while(true){
                if(!messagesSend.isEmpty()){
                    bridge.send(clientSocket, messagesSend.poll());
                }
           }
        }).start();
    }

    public void listener(){
            new Thread(()->{
                    while(true)
                    messagesReceive.add((TestCommand)bridge.receive(clientSocket));
            }).start();
    }



}
