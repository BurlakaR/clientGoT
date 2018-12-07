package com.common.model.Cards.CardTypes.WesterosEvents;

import com.common.ClientController;
import com.common.Game;
import com.common.model.Cards.CardTypes.WesterosEvent;

public class InvasionOfWilds extends WesterosEvent {
    public InvasionOfWilds(){
        super("");
        message = "Одичалые атакую вестерос. Опасность нашествия указана на треке одичалых. " +
                "Дома применяют власть, чтобы усиить Ночной дозор и отбить вторжение";
    }

    @Override
    public void executeOnClient(ClientController controller, Game game) {

    }

    @Override
    public void executeOnServer(Game game) {
    }
}
