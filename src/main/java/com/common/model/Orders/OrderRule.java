package com.common.model.Orders;

public class OrderRule extends Order {
    public OrderRule(boolean star) {
        super("OrderRule", star,0);
    }

    @Override
    public void executeOnClient() {

    }

    @Override
    public void executeOnServer() {
    }
}
