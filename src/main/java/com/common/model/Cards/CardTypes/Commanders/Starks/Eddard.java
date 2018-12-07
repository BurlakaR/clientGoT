package com.common.model.Cards.CardTypes.Commanders.Starks;

import com.common.ClientController;
import com.common.Game;
import com.common.model.Cards.CardTypes.Commander;

public class Eddard extends Commander {
    public Eddard() {
        super("", 4);
    }

    @Override
    public void executeOnClient(ClientController controller, Game game) {

    }

    @Override
    public void executeOnServer(Game game) {
    }
}
