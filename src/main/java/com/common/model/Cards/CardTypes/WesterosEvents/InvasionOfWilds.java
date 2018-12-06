package com.common.model.Cards.CardTypes.WesterosEvents;

import com.client.communication.SocketManager;
import com.common.ClientController;
import com.common.Message;
import com.common.SocketManagerCommon;
import com.common.model.Cards.CardTypes.WesterosEvent;
import com.common.Game;

public class InvasionOfWilds extends WesterosEvent {
    public InvasionOfWilds(){
        super("");
        message = "Одичалые атакую вестерос. Опасность нашествия указана на треке одичалых. " +
                "Дома применяют власть, чтобы усиить Ночной дозор и отбить вторжение";
    }

    @Override
    public void executeOnClient(Game game, SocketManagerCommon socketManager, ClientController controller) {

    }

    @Override
    public Message executeOnServer(Game game, SocketManagerCommon socketManager) {
        return null;
    }
}
