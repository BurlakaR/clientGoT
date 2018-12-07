package com.common.model.Orders;

import com.common.ClientController;
import com.common.Game;
import com.common.Message;
import com.common.SocketManagerCommon;

public class EmptyOrder extends Order {
    public EmptyOrder() {
        super("Empty", false, 0);
        this.setH(0); this.setW(0);
    }

    @Override
    public void executeOnClient(Game game, SocketManagerCommon socketManager, ClientController controller) {

    }

    @Override
    public Message executeOnServer(Game game, SocketManagerCommon socketManager) {
        return null;
    }
}
