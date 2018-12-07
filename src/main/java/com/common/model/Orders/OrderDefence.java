package com.common.model.Orders;

import com.common.ClientController;

public class OrderDefence extends Order {
    public OrderDefence(boolean star, int power) {
        super("OrderDefence", star, power);
    }

    @Override
    public void executeOnClient(ClientController controller) {

    }

    @Override
    public void executeOnServer() {
    }
}
