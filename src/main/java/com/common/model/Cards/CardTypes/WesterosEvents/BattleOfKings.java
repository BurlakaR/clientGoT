package com.common.model.Cards.CardTypes.WesterosEvents;

import com.client.communication.SocketManager;
import com.common.ClientController;
import com.common.Message;
import com.common.model.Cards.CardTypes.WesterosEvent;
import com.common.Game;

public class BattleOfKings extends WesterosEvent {
    public BattleOfKings(){
        super("");
        message = "Все жетоны на треках влияния снимаются. Дома вступают в борьбу за влияние " +
                "на каждом из треков, начиная с железного трона";
    }

    @Override
    public void executeOnClient(Game game, SocketManager socketManager, ClientController controller) {

    }

    @Override
    public Message executeOnServer(Game game, SocketManager socketManager) {
        return null;
    }
}
