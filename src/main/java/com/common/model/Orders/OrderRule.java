package com.common.model.Orders;

import com.common.Game;
import com.common.IClientController;
import com.common.ISocketManager;

public class OrderRule extends Order {
    public OrderRule(boolean star) {
        super("OrderRule", star,0);
        orderType = OrderType.OrderRule;
    }

    @Override
    public void executeOnClient(IClientController controller, Game game) {

    }

    @Override
    public void executeOnServer(Game game, ISocketManager socketManager) {
    }
}
