package com.common.model.utils;

import com.client.communication.SocketManager;
import com.common.ClientController;
import com.common.Game;
import com.common.Message;

//this one would just help get and int stake from every player
public class Stake extends Message {
    private int stake;

    @Override
    public void executeOnClient(Game game, SocketManager socketManager, ClientController controller) {
        controller.getStake();
    }

    @Override
    public Message executeOnServer(Game game, SocketManager socketManager) {
        return null;
    }

    public int getStake() {
        return stake;
    }
}
