package com.common.model.Cards.CardTypes.Commanders.Starks;

import com.common.Game;
import com.common.IClientController;
import com.common.ISocketManager;
import com.common.model.Cards.CardTypes.Commander;

public class Keitilin extends Commander {
    public Keitilin() {
        super("", 0);
    }

    @Override
    public void executeOnClient(IClientController controller, Game game) {

    }

    @Override
    public void executeOnServer(Game game, ISocketManager socketManager) {
    }
}
