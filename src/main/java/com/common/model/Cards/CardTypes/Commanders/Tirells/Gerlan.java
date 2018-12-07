package com.common.model.Cards.CardTypes.Commanders.Tirells;

import com.common.ClientController;
import com.common.Game;
import com.common.model.Cards.CardTypes.Commander;

public class Gerlan extends Commander {
    public Gerlan() {
        super("", 2);
    }

    @Override
    public void executeOnClient(ClientController controller, Game game) {

    }

    @Override
    public void executeOnServer(Game game) {
    }
}
