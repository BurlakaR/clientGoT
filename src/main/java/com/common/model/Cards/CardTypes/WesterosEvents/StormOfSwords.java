package com.common.model.Cards.CardTypes.WesterosEvents;

import com.common.ClientController;
import com.common.model.Cards.CardTypes.WesterosEvent;

public class StormOfSwords extends WesterosEvent {
    public StormOfSwords(){
        super("");
        message = "В фазе замыслов этого раунда игроки не могут отдавать приказы обороны";
    }

    @Override
    public void executeOnClient(ClientController controller) {

    }

    @Override
    public void executeOnServer() {
    }
}
