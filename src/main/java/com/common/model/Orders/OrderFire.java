package com.common.model.Orders;

import com.common.Game;
import com.common.IClientController;
import com.common.ISocketManager;

public class OrderFire extends Order {
    public OrderFire(boolean star) {
        super("OrderFire", star, 0);
        orderType=OrderType.OrderFire;

    }

    @Override
    public void executeOnClient(IClientController controller, Game game) {
        controller.configureFireOrder(this);
    }

    @Override
    public void executeOnServer(Game game, ISocketManager socketManager) {
        target.setOrder(new NoOrder());
        source.setOrder(new NoOrder());
    }
}
