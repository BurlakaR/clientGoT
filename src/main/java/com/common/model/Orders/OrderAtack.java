package com.common.model.Orders;

import com.client.communication.SocketManager;
import com.common.ClientController;
import com.common.Game;
import com.common.Message;

public class OrderAtack extends Order {
    public OrderAtack(boolean star, int power) {
        super("OrderAtack", star, power);
        if(power<0) this.setImgName(this.getImgName()+"1");
        else if(power==0) this.setImgName(this.getImgName()+"2");
    }

    @Override
    public void executeOnClient(Game game, SocketManager socketManager, ClientController controller) {

    }

    @Override
    public Message executeOnServer(Game game, SocketManager socketManager) {
        return null;
    }
}
