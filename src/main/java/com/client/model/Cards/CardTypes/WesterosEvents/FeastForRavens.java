package com.client.model.Cards.CardTypes.WesterosEvents;

import com.client.model.Cards.CardTypes.WesterosEvent;
import com.client.model.Game;

public class FeastForRavens extends WesterosEvent {
    public FeastForRavens(){
        message = "В фазе замыслов этого раунда игроки не могут отдавать приказы подмоги";
        img = "";
    }

    @Override
    public void triggerCard(Game game) {

    }
}
