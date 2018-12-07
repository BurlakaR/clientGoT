package com.common.model.Cards.CardTypes.WesterosEvents;

import com.common.ClientController;
import com.common.model.Cards.CardTypes.WesterosEvent;

public class RainsOfTheAutumn extends WesterosEvent {
    public RainsOfTheAutumn(){
        super("");
        message = "В фазе замыслов этого райнда игроки не могут отдавать особые приказы похода +1";
    }
    @Override
    public void executeOnClient(ClientController controller) {

    }

    @Override
    public void executeOnServer() {
    }
}
