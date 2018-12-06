package com.common;



import java.io.Serializable;
import java.net.Socket;

public abstract class Message implements Serializable {
    Socket sender;

    public Socket getSender() {
        return sender;
    }

    public void setSender(Socket sender) {
        this.sender = sender;
    }

    public void print(){};

    public abstract void executeOnClient(Game game, SocketManagerCommon socketManager, ClientController controller);
    public abstract Message executeOnServer(Game game, SocketManagerCommon socketManager);
}
