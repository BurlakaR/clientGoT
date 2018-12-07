package com.common.model.utils;

import com.common.ClientController;
import com.common.Game;
import com.common.Message;
import com.common.SocketManagerCommon;

//this one would just help get and int stake from every player
public class Stake extends Message {
    private int stake;

    @Override
    public void executeOnClient(Game game, SocketManagerCommon socketManager, ClientController controller) {
        stake = controller.getStake();
    }

    @Override
    public Message executeOnServer(Game game, SocketManagerCommon socketManager) {
        return null;
    }

    public int getStake() {
        return stake;
    }
}
