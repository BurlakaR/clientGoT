package com.common.model.Orders;

import com.common.Game;
import com.common.IClientController;
import com.common.ISocketManager;

public class NoOrder extends Order {
    public NoOrder() {
        super("Empty", false, 0);
        orderType = OrderType.OrderEmpty;
    }

    @Override
    public void executeOnClient(IClientController controller, Game game) {

    }

    @Override
    public void executeOnServer(Game game, ISocketManager socketManager) {

    }
}
