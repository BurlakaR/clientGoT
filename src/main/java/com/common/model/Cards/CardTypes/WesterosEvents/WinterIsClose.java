package com.common.model.Cards.CardTypes.WesterosEvents;

import com.client.communication.SocketManager;
import com.common.ClientController;
import com.common.Message;
import com.common.model.Cards.CardTypes.WesterosEvent;
import com.common.Game;

public class WinterIsClose extends WesterosEvent {
    public WinterIsClose()
    {
        super("");
        message = "";
    }
    @Override
    public void executeOnClient(Game game, SocketManager socketManager, ClientController controller) {

    }

    @Override
    public Message executeOnServer(Game game, SocketManager socketManager) {
        return null;
    }
}
