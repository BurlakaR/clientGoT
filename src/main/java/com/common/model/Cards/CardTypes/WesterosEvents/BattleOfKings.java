package com.common.model.Cards.CardTypes.WesterosEvents;

import com.common.ClientController;
import com.common.model.Cards.CardTypes.WesterosEvent;

public class BattleOfKings extends WesterosEvent {
    public BattleOfKings(){
        super("");
        message = "Все жетоны на треках влияния снимаются. Дома вступают в борьбу за влияние " +
                "на каждом из треков, начиная с железного трона";
    }

    @Override
    public void executeOnClient(ClientController controller) {

    }

    @Override
    public void executeOnServer() {
    }
}
