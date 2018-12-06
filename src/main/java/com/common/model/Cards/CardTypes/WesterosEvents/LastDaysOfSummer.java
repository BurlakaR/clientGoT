package com.common.model.Cards.CardTypes.WesterosEvents;

import com.client.communication.SocketManager;
import com.common.ClientController;
import com.common.Message;
import com.common.SocketManagerCommon;
import com.common.model.Cards.CardTypes.WesterosEvent;
import com.common.Game;

public class LastDaysOfSummer extends WesterosEvent {
    public LastDaysOfSummer(){
        super("");
        message = "Ничего не происходит.";
    }

    @Override
    public void executeOnClient(Game game, SocketManagerCommon socketManager, ClientController controller) {

    }

    @Override
    public Message executeOnServer(Game game, SocketManagerCommon socketManager) {
        return null;
    }
}
