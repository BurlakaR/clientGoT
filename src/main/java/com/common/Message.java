package com.common;


import java.io.Serializable;
import java.net.Socket;

public class Message  implements Serializable {
    Socket sender;

    public Socket getSender() {
        return sender;
    }

    public void setSender(Socket sender) {
        this.sender = sender;
    }

    public void print(){};
}
