package com.common.model.utils;

import com.common.ClientController;
import com.common.Message;

//this one would just help get and int stake from every player
public class Stake extends Message {
    private int stake;

    @Override

    public void executeOnClient(ClientController controller) {
        controller.getStake();
    }

    @Override
    public void executeOnServer() {
    }

    public int getStake() {
        return stake;
    }

    public void setStake(int stake) {
        this.stake = stake;
    }
}
