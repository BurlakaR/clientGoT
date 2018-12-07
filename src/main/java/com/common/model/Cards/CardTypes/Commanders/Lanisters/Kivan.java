package com.common.model.Cards.CardTypes.Commanders.Lanisters;

import com.common.ClientController;
import com.common.Game;
import com.common.model.Cards.CardTypes.Commander;

public class Kivan extends Commander {
    public Kivan() {
        super("", 1);
    }
    @Override
    public void executeOnClient(ClientController controller, Game game) {

    }

    @Override
    public void executeOnServer(Game game) {
    }
}
