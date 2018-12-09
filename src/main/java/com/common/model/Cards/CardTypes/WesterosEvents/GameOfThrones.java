package com.common.model.Cards.CardTypes.WesterosEvents;

import com.common.Game;
import com.common.IClientController;
import com.common.ISocketManager;
import com.common.model.Cards.CardTypes.WesterosEvent;

public class GameOfThrones extends WesterosEvent {
    public GameOfThrones(){
        super("");
        message = "Каждый Дом в порядке хода берёт из резерва власти один жетон " +
                "за каждый знак короны  вподвластных ему землях. " +
                "Также Дом берёт жетон власти за каждый свой порт с кораблём, если в смежном море нет врага.";
    }

    @Override
    public void executeOnClient(IClientController controller, Game game) {

    }

    @Override
    public void executeOnServer(Game game, ISocketManager socketManager) {
    }
}
