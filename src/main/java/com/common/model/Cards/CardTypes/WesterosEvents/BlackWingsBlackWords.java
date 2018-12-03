package com.common.model.Cards.CardTypes.WesterosEvents;

import com.client.communication.SocketManager;
import com.common.ClientController;
import com.common.Message;
import com.common.model.Cards.CardTypes.WesterosEvent;
import com.common.Game;

public class BlackWingsBlackWords extends WesterosEvent {
    public BlackWingsBlackWords(){
        super("");
        message = "Владелец Посыльного ворна выбират один из трёх вариантов: " +
                "\nВсе Дома вступают в борьбу за влияние" +
                "\nВсе Дома собирают власть с подвластных земель, в которых есть знак короны" +
                "\nНичего не происходит";
    }

    @Override
    public void executeOnClient(Game game, SocketManager socketManager, ClientController controller) {

    }

    @Override
    public Message executeOnServer(Game game, SocketManager socketManager) {
        return null;
    }
}
