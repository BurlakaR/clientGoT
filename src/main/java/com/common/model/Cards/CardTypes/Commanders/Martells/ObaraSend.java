package com.common.model.Cards.CardTypes.Commanders.Martells;

import com.common.ClientController;
import com.common.Game;
import com.common.model.Cards.CardTypes.Commander;

public class ObaraSend extends Commander {
    public ObaraSend() {
        super("", 2);
    }

    @Override
    public void executeOnClient(ClientController controller, Game game) {

    }

    @Override
    public void executeOnServer(Game game) {
    }
}
