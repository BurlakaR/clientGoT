package com.common.model.Cards.CardTypes.Commanders.Martells;

import com.client.communication.SocketManager;
import com.common.ClientController;
import com.common.Game;
import com.common.Message;
import com.common.model.Cards.CardTypes.Commander;
import com.common.model.utils.Battle;

public class ObermnRedSerpent extends Commander {
    public ObermnRedSerpent() {
        super("", 4);
    }

    @Override
    public void executeOnClient(Game game, SocketManager socketManager, ClientController controller) {

    }

    @Override
    public Message executeOnServer(Game game, SocketManager socketManager) {
        return null;
    }
}
