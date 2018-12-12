package com.common.model.utils;

import com.common.Game;
import com.common.IClientController;
import com.common.ISocketManager;
import com.common.Message;

public class Battle extends Message {
    @Override
    public void executeOnClient(IClientController controller, Game game) {

    }

    @Override
    public void executeOnServer(Game game, ISocketManager socketManager) {

    }
}
