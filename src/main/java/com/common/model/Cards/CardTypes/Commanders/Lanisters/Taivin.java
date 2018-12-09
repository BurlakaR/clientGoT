package com.common.model.Cards.CardTypes.Commanders.Lanisters;

import com.common.Game;
import com.common.IClientController;
import com.common.ISocketManager;
import com.common.model.Cards.CardTypes.Commander;

public class Taivin extends Commander {
    public Taivin() {
        super("", 4);
    }
    @Override
    public void executeOnClient(IClientController controller, Game game) {

    }

    @Override
    public void executeOnServer(Game game, ISocketManager socketManager) {
    }
}
