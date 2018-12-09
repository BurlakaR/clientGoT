package com.common.model.Orders;

import com.common.ClientController;
import com.common.Game;

public class EmptyOrder extends Order {
    public EmptyOrder() {
        super("EmptyOrder", false, 0);
        this.setH(80); this.setW(80);
    }

    @Override
    public void executeOnClient(ClientController controller, Game game) {

    }

    @Override
    public void executeOnServer(Game game) {
    }
}
