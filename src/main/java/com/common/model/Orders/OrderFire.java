package com.common.model.Orders;

import com.common.ClientController;

public class OrderFire extends Order {
    public OrderFire(boolean star) {
        super("OrderFire", star, 0);
    }

    @Override
    public void executeOnClient(ClientController controller) {
        super.executeOnClient(controller);
        target.setOrder(new EmptyOrder());
    }

    @Override
    public void executeOnServer() {
        super.executeOnServer();
        target.setOrder(new EmptyOrder());
    }
}
