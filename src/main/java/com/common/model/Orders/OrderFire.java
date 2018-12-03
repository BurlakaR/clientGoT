package com.common.model.Orders;

import com.client.communication.SocketManager;
import com.common.ClientController;
import com.common.Game;
import com.common.Message;

public class OrderFire extends Order {
    public OrderFire(boolean star) {
        super("OrderFire", star, 0);
    }

    @Override
    public void executeOnClient(Game game, SocketManager socketManager, ClientController controller) {

    }

    @Override
    public Message executeOnServer(Game game, SocketManager socketManager) {
        return null;
    }
}
