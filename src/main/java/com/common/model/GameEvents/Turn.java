package com.common.model.GameEvents;

import com.common.Message;

//provokes user to execute his next order
public class Turn extends Message {
    @Override
    public void executeOnClient() {
        //provokes client to configure and send orders for execution
    }

    @Override
    public void executeOnServer() {
    }
}
