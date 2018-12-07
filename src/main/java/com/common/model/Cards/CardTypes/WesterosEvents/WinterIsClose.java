package com.common.model.Cards.CardTypes.WesterosEvents;

import com.common.ClientController;
import com.common.model.Cards.CardTypes.WesterosEvent;

public class WinterIsClose extends WesterosEvent {
    public WinterIsClose()
    {
        super("");
        message = "";
    }
    @Override
    public void executeOnClient(ClientController controller) {

    }

    @Override
    public void executeOnServer() {
    }
}
