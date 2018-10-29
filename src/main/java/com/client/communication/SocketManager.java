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
    Socket serverSocket;




    @Autowired
    Bridge bridge;


    public void connect() throws IOException {
        serverSocket = new Socket("localhost", port);
    }

    public void send(Message message){
        bridge.send(serverSocket, message);
    }

    public Message receive(){
        return (Message)bridge.receive(serverSocket);
    }





}
