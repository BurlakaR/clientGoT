package com.common.model.GameEvents;

import com.common.*;

public class GatheringOrders extends Message {

    @Override
    public void executeOnClient() {
        //controller.putOrders(Game.getInstance().getMap());
    }

    @Override
    public void executeOnServer() {
    }
}
