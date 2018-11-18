package com.client.communication;

import com.common.IntegerMessage;
import com.common.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.*;
import java.net.Socket;

@Component
public class SocketManager {
    static int portCreation=9998;
    static int portConnection=9999;
    static int portPlay;
    Socket serverSocket;

    static String ip = "localhost";


    @Autowired
    Bridge bridge;


    public void createGame(int numberPlayers){
        try {
            serverSocket = new Socket(ip, portCreation);
            send(new IntegerMessage(numberPlayers));
            int room=((IntegerMessage) receive()).getMessage();
            System.out.println(room);
            connectGame(room);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void connectGame(int idGame){
        try {
            serverSocket = new Socket(ip, portConnection);
            send(new IntegerMessage(idGame));
            portPlay=((IntegerMessage) receive()).getMessage();
            System.out.println(portPlay);
            serverSocket = new Socket(ip, portPlay);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void send(Message message){
        bridge.send(serverSocket, message);
    }

    public Message receive(){
        return (Message)bridge.receive(serverSocket);
    }


}
