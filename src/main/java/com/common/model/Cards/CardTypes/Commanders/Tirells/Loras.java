package com.common.model.Cards.CardTypes.Commanders.Tirells;

import com.common.ClientController;
import com.common.Game;
import com.common.model.Cards.CardTypes.Commander;

public class Loras extends Commander {
    public Loras() {
        super("", 3);
    }

    @Override
    public void executeOnClient(ClientController controller, Game game) {

    }

    @Override
    public void executeOnServer(Game game) {
    }
}
