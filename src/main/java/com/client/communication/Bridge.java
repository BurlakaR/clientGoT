package com.client.communication;

import org.springframework.stereotype.Component;

import java.io.*;
import java.net.Socket;

@Component
public class Bridge {

    public void send(Socket socket, Object object){
        try {
            OutputStream out = socket.getOutputStream();

        ObjectOutputStream oos = new ObjectOutputStream(out);
        oos.writeObject(object);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Object receive(Socket socket){
        try {
            InputStream in = socket.getInputStream();
            ObjectInputStream ois = new ObjectInputStream(in);
            Object toWrite = ois.readObject();
            return toWrite;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
