package com.client.communication;

import com.common.Message;
import com.common.Port;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.*;
import java.net.Socket;

@Component
public class SocketManager {
    static int port=10000;
    Socket clientSocket;




    @Autowired
    Bridge bridge;


    public void connect() throws IOException {
        clientSocket = new Socket("localhost", port);
        Port p=((Port)bridge.receive(clientSocket));
        port=p.getPort();
        clientSocket=new Socket("localhost", port);


    }

    public void send(Message message){
        bridge.send(clientSocket, message);
    }

    public Message receive(){
        return (Message)bridge.receive(clientSocket);
    }





}
