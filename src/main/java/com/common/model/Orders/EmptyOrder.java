package com.common.model.Orders;

import com.common.ClientController;
import com.common.Game;

public class EmptyOrder extends Order {
    public EmptyOrder() {
        super("Empty", false, 0);
        this.setH(0); this.setW(0);
    }

    @Override
    public void executeOnClient(ClientController controller, Game game) {

    }

    @Override
    public void executeOnServer(Game game) {
    }
}
