package com.client.model.Cards.CardTypes.WesterosEvents;

import com.client.model.Cards.CardTypes.WesterosEvent;
import com.client.model.Game;

public class BattleOfKings extends WesterosEvent {
    public BattleOfKings(){
        message = "Все жетоны на треках влияния снимаются. Дома вступают в борьбу за влияние " +
                "на каждом из треков, начиная с железного трона";
        img = "";
    }


    @Override
    public void triggerCard(Game game) {

    }
}
