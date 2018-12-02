package com.common.model.Cards.CardTypes.WesterosEvents;

import com.common.model.Cards.CardTypes.WesterosEvent;
import com.common.model.Game;

public class BlackWingsBlackWords extends WesterosEvent {
    public BlackWingsBlackWords(){
        message = "Владелец Посыльного ворна выбират один из трёх вариантов: " +
                "\nВсе Дома вступают в борьбу за влияние" +
                "\nВсе Дома собирают власть с подвластных земель, в которых есть знак короны" +
                "\nНичего не происходит";
        img = "";
    }

    @Override
    public void triggerCard(Game game) {

    }
}
