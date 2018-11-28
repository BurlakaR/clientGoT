package com.client.model.Cards.CardTypes.WesterosEvents;

import com.client.model.Cards.CardTypes.WesterosEvent;
import com.client.model.Game;

public class SeaOfStorms extends WesterosEvent {
    public SeaOfStorms(){
        message = "В фазе замыслов этого раунда игроки не могут отдавать приказы набега";
        img = "";
    }

    @Override
    public void triggerCard(Game game) {

    }
}
