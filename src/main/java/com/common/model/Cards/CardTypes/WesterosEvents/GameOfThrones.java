package com.common.model.Cards.CardTypes.WesterosEvents;

import com.client.communication.SocketManager;
import com.common.ClientController;
import com.common.Message;
import com.common.model.Cards.CardTypes.WesterosEvent;
import com.common.Game;

public class GameOfThrones extends WesterosEvent {
    public GameOfThrones(){
        super("");
        message = "Каждый Дом в порядке хода берёт из резерва власти один жетон " +
                "за каждый знак короны  вподвластных ему землях. " +
                "Также Дом берёт жетон власти за каждый свой порт с кораблём, если в смежном море нет врага.";
    }

    @Override
    public void executeOnClient(Game game, SocketManager socketManager, ClientController controller) {

    }

    @Override
    public Message executeOnServer(Game game, SocketManager socketManager) {
        return null;
    }
}
