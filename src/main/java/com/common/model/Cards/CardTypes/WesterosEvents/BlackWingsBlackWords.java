package com.common.model.Cards.CardTypes.WesterosEvents;

import com.common.ClientController;
import com.common.Game;
import com.common.model.Cards.CardTypes.WesterosEvent;

public class BlackWingsBlackWords extends WesterosEvent {
    public BlackWingsBlackWords(){
        super("");
        message = "Владелец Посыльного ворна выбират один из трёх вариантов: " +
                "\nВсе Дома вступают в борьбу за влияние" +
                "\nВсе Дома собирают власть с подвластных земель, в которых есть знак короны" +
                "\nНичего не происходит";
    }

    @Override
    public void executeOnClient(ClientController controller, Game game) {

    }

    @Override
    public void executeOnServer(Game game) {
    }
}
