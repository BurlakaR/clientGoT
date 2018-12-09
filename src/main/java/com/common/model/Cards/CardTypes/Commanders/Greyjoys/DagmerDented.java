package com.common.model.Cards.CardTypes.Commanders.Greyjoys;

import com.common.Game;
import com.common.IClientController;
import com.common.ISocketManager;
import com.common.model.Cards.CardTypes.Commander;

public class DagmerDented extends Commander {
    public DagmerDented() {
        super("", 1);
    }
    @Override
    public void executeOnClient(IClientController controller, Game game) {

    }

    @Override
    public void executeOnServer(Game game, ISocketManager socketManager) {
    }
}
