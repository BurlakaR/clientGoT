package com.common.model.Orders;

import com.common.ClientController;
import com.common.Game;

public class OrderFire extends Order {
    public OrderFire(boolean star) {
        super("OrderFire", star, 0);
    }

    @Override
    public void executeOnClient(ClientController controller, Game game) {
        super.executeOnClient(controller, game);
        target.setOrder(new EmptyOrder());
    }

    @Override
    public void executeOnServer(Game game) {
        super.executeOnServer(game);
        target.setOrder(new EmptyOrder());
    }
}
