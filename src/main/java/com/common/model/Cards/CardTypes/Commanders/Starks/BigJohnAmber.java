package com.common.model.Cards.CardTypes.Commanders.Starks;

import com.common.ClientController;
import com.common.Game;
import com.common.model.Cards.CardTypes.Commander;

public class BigJohnAmber extends Commander {
    public BigJohnAmber() {
        super("", 2);
    }

    @Override
    public void executeOnClient(ClientController controller, Game game) {


    }

    @Override
    public void executeOnServer(Game game) {
    }
}
