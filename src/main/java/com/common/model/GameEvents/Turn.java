package com.common.model.GameEvents;

import com.common.ClientController;
import com.common.Game;
import com.common.Message;

//provokes user to execute his next order
public class Turn extends Message {
    @Override
    public void executeOnClient(ClientController controller, Game game) {
        //provokes client to configure and send orders for execution
    }

    @Override
    public void executeOnServer(Game game) {
    }
}
