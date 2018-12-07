package com.common.model.Orders;

public class OrderDefence extends Order {
    public OrderDefence(boolean star, int power) {
        super("OrderDefence", star, power);
    }

    @Override
    public void executeOnClient() {

    }

    @Override
    public void executeOnServer() {
    }
}
