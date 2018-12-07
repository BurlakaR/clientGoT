package com.common.model.utils;

import com.common.ClientController;
import com.common.Game;
import com.common.Message;

//this one would just help get and int stake from every player
public class Stake extends Message {
    private int stake;

    @Override

    public void executeOnClient(ClientController controller, Game game) {
        controller.getStake();
    }

    @Override
    public void executeOnServer(Game game) {
    }

    public int getStake() {
        return stake;
    }

    public void setStake(int stake) {
        this.stake = stake;
    }
}
