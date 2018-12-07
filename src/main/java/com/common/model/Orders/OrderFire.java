package com.common.model.Orders;

public class OrderFire extends Order {
    public OrderFire(boolean star) {
        super("OrderFire", star, 0);
    }

    @Override
    public void executeOnClient() {
        super.executeOnClient();
        target.setOrder(new EmptyOrder());
    }

    @Override
    public void executeOnServer() {
        super.executeOnServer();
        target.setOrder(new EmptyOrder());
    }
}
