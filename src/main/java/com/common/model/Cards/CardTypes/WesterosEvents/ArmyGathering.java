package com.common.model.Cards.CardTypes.WesterosEvents;

import com.common.model.Cards.CardTypes.WesterosEvent;
import com.common.model.Game;

public class ArmyGathering extends WesterosEvent {
    public ArmyGathering(){
        message = "Каждый Дом в порядке хода создает новые отряды в землях с крепостями и замками";
        img = "";
    }

    @Override
    public void triggerCard(Game game) {

    }
}
