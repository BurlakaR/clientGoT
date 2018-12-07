package com.common.model.Orders;

public class EmptyOrder extends Order {
    public EmptyOrder() {
        super("Empty", false, 0);
        this.setH(0); this.setW(0);
    }

    @Override
    public void executeOnClient() {

    }

    @Override
    public void executeOnServer() {
    }
}
