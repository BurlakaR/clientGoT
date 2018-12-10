package com.common.model.Orders;

import com.common.Game;
import com.common.IClientController;
import com.common.ISocketManager;

public class OrderHelp extends Order {
    public OrderHelp(boolean star, int power) {
        super("OrderHelp", star, power);
        orderType = OrderType.OrderHelp;
    }

    @Override
    public void executeOnClient(IClientController controller, Game game) {

    }

    @Override
    public void executeOnServer(Game game, ISocketManager socketManager) {
    }
}
