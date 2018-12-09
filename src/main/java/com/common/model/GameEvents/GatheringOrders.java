package com.common.model.GameEvents;

import com.common.Game;
import com.common.IClientController;
import com.common.ISocketManager;
import com.common.Message;

public class GatheringOrders extends Message {

    @Override
    public void executeOnClient(IClientController controller, Game game) {
        controller.putOrders();
    }

    @Override
    public void executeOnServer(Game game, ISocketManager socketManager) {
    }
}
