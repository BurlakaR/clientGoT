package com.common.model.Cards.CardTypes.WesterosEvents;

import com.client.communication.SocketManager;
import com.common.ClientController;
import com.common.Message;
import com.common.model.Cards.CardTypes.WesterosEvent;
import com.common.Game;

public class SupplyRecount extends WesterosEvent {
    public SupplyRecount(){
        super("");
        message = "Каждый Дом в порядке хода пересчитывает снабжение и, если необходимо, " +
                "уменьшает численность войск соответственно";
    }
    @Override
    public void executeOnClient(Game game, SocketManager socketManager, ClientController controller) {

    }

    @Override
    public Message executeOnServer(Game game, SocketManager socketManager) {
        return null;
    }
}
