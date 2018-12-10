package com.common.model.Orders;

import com.common.Game;
import com.common.IClientController;
import com.common.ISocketManager;

public class OrderDefence extends Order {
    public OrderDefence(boolean star, int power) {
        super("OrderDefence", star, power);
        orderType = OrderType.OrderDefence;
    }

    @Override
    public void executeOnClient(IClientController controller, Game game) {

    }

    @Override
    public void executeOnServer(Game game, ISocketManager socketManager) {
    }
}
