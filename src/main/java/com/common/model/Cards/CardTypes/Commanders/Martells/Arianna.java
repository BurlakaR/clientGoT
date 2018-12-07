package com.common.model.Cards.CardTypes.Commanders.Martells;

import com.common.ClientController;
import com.common.Game;
import com.common.Message;
import com.common.SocketManagerCommon;
import com.common.model.Cards.CardTypes.Commander;

public class Arianna extends Commander {
    public Arianna() {
        super("", 1);
    }
    @Override
    public void executeOnClient(Game game, SocketManagerCommon socketManager, ClientController controller) {

    }

    @Override
    public Message executeOnServer(Game game, SocketManagerCommon socketManager) {
        return null;
    }
}
