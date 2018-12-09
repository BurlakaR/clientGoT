package com.common.model.Orders;

public class NoOrder extends Order {
    public NoOrder() {
        super("Empty", false, 0);
    }

    @Override
    public boolean orderIsEmpty(){return true;}
}
