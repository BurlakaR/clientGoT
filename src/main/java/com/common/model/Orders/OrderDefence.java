package com.common.model.Orders;

import com.client.communication.SocketManager;
import com.common.ClientController;
import com.common.Game;
import com.common.Message;

public class OrderDefence extends Order {
    public OrderDefence(boolean star, int power) {
        super("OrderDefence", star, power);
    }

    @Override
    public void executeOnClient(Game game, SocketManager socketManager, ClientController controller) {

    }

    @Override
    public Message executeOnServer(Game game, SocketManager socketManager) {
        return null;
    }
}
