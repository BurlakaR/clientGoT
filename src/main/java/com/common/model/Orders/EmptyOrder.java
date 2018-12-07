package com.common.model.Orders;

import com.common.ClientController;

public class EmptyOrder extends Order {
    public EmptyOrder() {
        super("Empty", false, 0);
        this.setH(0); this.setW(0);
    }

    @Override
    public void executeOnClient(ClientController controller) {

    }

    @Override
    public void executeOnServer() {
    }
}
