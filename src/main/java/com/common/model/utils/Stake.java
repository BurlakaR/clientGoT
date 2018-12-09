package com.common.model.utils;

import com.common.Game;
import com.common.IClientController;
import com.common.ISocketManager;
import com.common.Message;

//this one would just help get and int stake from every player
public class Stake extends Message {
    private int stake;

    @Override

    public void executeOnClient(IClientController controller, Game game) {
        controller.getStake();
    }

    @Override
    public void executeOnServer(Game game, ISocketManager socketManager) {
    }

    public int getStake() {
        return stake;
    }

    public void setStake(int stake) {
        this.stake = stake;
    }
}
