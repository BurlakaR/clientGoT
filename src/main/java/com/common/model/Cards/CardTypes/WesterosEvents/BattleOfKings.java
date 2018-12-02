package com.common.model.Cards.CardTypes.WesterosEvents;

import com.common.model.Cards.CardTypes.WesterosEvent;
import com.common.model.Game;

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
