package com.common.model.Cards.CardTypes.WesterosEvents;

import com.common.model.Cards.CardTypes.WesterosEvent;
import com.common.model.Game;

public class RainsOfTheAutumn extends WesterosEvent {
    public RainsOfTheAutumn(){
        message = "В фазе замыслов этого райнда игроки не могут отдавать особые приказы похода +1";
        img = "";
    }

    @Override
    public void triggerCard(Game game) {

    }
}
