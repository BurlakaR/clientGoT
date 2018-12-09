package com.common.model.GameEvents;

import com.common.Game;
import com.common.IClientController;
import com.common.ISocketManager;
import com.common.Message;

//provokes user to execute his next order
public class Turn extends Message {
    @Override
    public void executeOnClient(IClientController controller, Game game) {
        //provokes client to configure and send orders for execution
    }

    @Override
    public void executeOnServer(Game game, ISocketManager socketManager) {
    }
}
