package com.common.model.Cards.CardTypes.WesterosEvents;

import com.common.Game;
import com.common.IClientController;
import com.common.ISocketManager;
import com.common.model.Cards.CardTypes.WesterosEvent;

public class BattleOfKings extends WesterosEvent {
    public BattleOfKings(){
        super("");
        message = "Все жетоны на треках влияния снимаются. Дома вступают в борьбу за влияние " +
                "на каждом из треков, начиная с железного трона";
    }

    @Override
    public void executeOnClient(IClientController controller, Game game) {

    }

    @Override
    public void executeOnServer(Game game, ISocketManager socketManager) {
    }
}
