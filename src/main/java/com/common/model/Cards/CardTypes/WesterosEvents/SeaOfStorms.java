package com.common.model.Cards.CardTypes.WesterosEvents;

import com.common.model.Cards.CardTypes.WesterosEvent;
import com.common.model.Game;

public class SeaOfStorms extends WesterosEvent {
    public SeaOfStorms(){
        message = "В фазе замыслов этого раунда игроки не могут отдавать приказы набега";
        img = "";
    }

    @Override
    public void triggerCard(Game game) {

    }
}
