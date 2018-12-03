package com.common.model.Cards.CardTypes.WesterosEvents;

import com.client.communication.SocketManager;
import com.common.ClientController;
import com.common.Message;
import com.common.model.Cards.CardTypes.WesterosEvent;
import com.common.Game;

public class StormOfSwords extends WesterosEvent {
    public StormOfSwords(){
        super("");
        message = "В фазе замыслов этого раунда игроки не могут отдавать приказы обороны";
    }

    @Override
    public void executeOnClient(Game game, SocketManager socketManager, ClientController controller) {

    }

    @Override
    public Message executeOnServer(Game game, SocketManager socketManager) {
        return null;
    }
}
