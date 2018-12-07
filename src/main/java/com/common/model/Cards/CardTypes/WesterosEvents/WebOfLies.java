package com.common.model.Cards.CardTypes.WesterosEvents;

import com.common.ClientController;
import com.common.model.Cards.CardTypes.WesterosEvent;

public class WebOfLies extends WesterosEvent {
    public WebOfLies() {
        super("");
        message = "В фазе замыслов этого раунда игроки не могут отдавать приказы подмоги";
    }
    @Override
    public void executeOnClient(ClientController controller) {

    }

    @Override
    public void executeOnServer() {
    }
}
