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

    String ip = "localhost";

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Autowired
    Bridge bridge;


    public void createGame(int numberPlayers){
        try {
            serverSocket = new Socket(ip, portCreation);
            send(new IntegerMessage(numberPlayers));
            int room=((IntegerMessage) receive()).getMessage();
            System.out.println("Number of created room:"+room);//delete this later
            System.out.println("ip: " + serverSocket.getLocalAddress() + "\nport: " + serverSocket.getLocalPort());
            connectGame(room);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean connectGame(int idGame){
        try {
            serverSocket = new Socket(ip, portConnection);
            send(new IntegerMessage(idGame));
            portPlay=((IntegerMessage) receive()).getMessage();
            if(portPlay>0) {
                serverSocket = new Socket(ip, portPlay);
                return true;
            }
            else{
                System.out.println("Failed");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void send(Message message){
        bridge.send(serverSocket, message);
    }

    public Message receive(){
        Message buf=(Message)bridge.receive(serverSocket);
        System.out.println(buf);
        return buf;
    }


}
