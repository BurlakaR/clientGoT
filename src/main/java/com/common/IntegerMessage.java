package com.common;


import com.client.communication.SocketManager;

public class IntegerMessage extends Message {
    int message;

    public int getMessage() {
        return message;
    }

    public void setMessage(int message) {
        this.message = message;
    }

    public IntegerMessage(int message) {
        this.message = message;
    }

    @Override
    public void executeOnClient(Game game, SocketManager socketManager, ClientController controller) {

    }

    @Override
    public Message executeOnServer(Game game, SocketManager socketManager) {
        return null;
    }
}