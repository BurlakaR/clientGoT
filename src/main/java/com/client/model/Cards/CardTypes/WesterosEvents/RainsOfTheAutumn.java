package com.client.model.Cards.CardTypes.WesterosEvents;

import com.client.model.Cards.CardTypes.WesterosEvent;
import com.client.model.Game;

public class RainsOfTheAutumn extends WesterosEvent {
    public RainsOfTheAutumn(){
        message = "В фазе замыслов этого райнда игроки не могут отдавать особые приказы похода +1";
        img = "";
    }

    @Override
    public void triggerCard(Game game) {

    }
}
