package com.client.model.Cards.CardTypes.WesterosEvents;

import com.client.model.Cards.CardTypes.WesterosEvent;
import com.client.model.Game;

public class ArmyGathering extends WesterosEvent {
    public ArmyGathering(){
        message = "Каждый Дом в порядке хода создает новые отряды в землях с крепостями и замками";
        img = "";
    }

    @Override
    public void triggerCard(Game game) {

    }
}
