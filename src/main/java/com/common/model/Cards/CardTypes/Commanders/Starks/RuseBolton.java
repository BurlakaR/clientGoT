package com.common.model.Cards.CardTypes.Commanders.Starks;

import com.client.communication.SocketManager;
import com.common.ClientController;
import com.common.Game;
import com.common.Message;
import com.common.model.Cards.CardTypes.Commander;
import com.common.model.utils.Battle;

public class RuseBolton extends Commander {
    public RuseBolton() {
        super("", 2);
    }

    @Override
    public void executeOnClient(Game game, SocketManager socketManager, ClientController controller) {

    }

    @Override
    public Message executeOnServer(Game game, SocketManager socketManager) {
        return null;
    }
}
