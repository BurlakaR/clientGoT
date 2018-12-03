package com.common.model.Orders;

import com.client.communication.SocketManager;
import com.common.ClientController;
import com.common.Game;
import com.common.Message;

public class OrderHelp extends Order {
    public OrderHelp(boolean star, int power) {
        super("OrderHelp", star, power);
    }

    @Override
    public void executeOnClient(Game game, SocketManager socketManager, ClientController controller) {

    }

    @Override
    public Message executeOnServer(Game game, SocketManager socketManager) {
        return null;
    }
}
