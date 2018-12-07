package com.common.model.Cards.CardTypes.Commanders.Barateons;

import com.common.ClientController;
import com.common.Game;
import com.common.model.Cards.CardTypes.Commander;

public class Renli extends Commander {
    public Renli() {
        super("", 3);
    }

    @Override
    public void executeOnClient(ClientController controller, Game game) {

    }

    @Override
    public void executeOnServer(Game game) {
    }
}
