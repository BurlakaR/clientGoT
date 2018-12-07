package com.common.model.Orders;

import com.common.ClientController;

public class OrderRule extends Order {
    public OrderRule(boolean star) {
        super("OrderRule", star,0);
    }

    @Override
    public void executeOnClient(ClientController controller) {

    }

    @Override
    public void executeOnServer() {
    }
}
