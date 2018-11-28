package com.client.model.Cards.CardTypes.WesterosEvents;

import com.client.model.Cards.CardTypes.WesterosEvent;
import com.client.model.Game;

public class InvasionOfWilds extends WesterosEvent {
    public InvasionOfWilds(){
        message = "Одичалые атакую вестерос. Опасность нашествия указана на треке одичалых. " +
                "Дома применяют власть, чтобы усиить Ночной дозор и отбить вторжение";
        img = "";
    }

    @Override
    public void triggerCard(Game game) {

    }
}
