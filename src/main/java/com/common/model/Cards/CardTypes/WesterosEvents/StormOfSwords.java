package com.common.model.Cards.CardTypes.WesterosEvents;

import com.common.model.Cards.CardTypes.WesterosEvent;
import com.common.model.Game;

public class StormOfSwords extends WesterosEvent {
    public StormOfSwords(){
        message = "В фазе замыслов этого раунда игроки не могут отдавать приказы обороны";
        img = "";
    }

    @Override
    public void triggerCard(Game game) {

    }
}
