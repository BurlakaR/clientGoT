package com.common.model.Orders;

import com.common.ClientController;

public class OrderHelp extends Order {
    public OrderHelp(boolean star, int power) {
        super("OrderHelp", star, power);
    }

    @Override
    public void executeOnClient(ClientController controller) {

    }

    @Override
    public void executeOnServer() {
    }
}
