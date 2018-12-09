package com.common.model.Cards.CardTypes.Commanders.Tirells;

import com.common.Game;
import com.common.IClientController;
import com.common.ISocketManager;
import com.common.model.Cards.CardTypes.Commander;

public class QueenOfThorns extends Commander {
    public QueenOfThorns() {
        super("", 0);
    }

    @Override
    public void executeOnClient(IClientController controller, Game game) {

    }

    @Override
    public void executeOnServer(Game game, ISocketManager socketManager) {
    }
}
