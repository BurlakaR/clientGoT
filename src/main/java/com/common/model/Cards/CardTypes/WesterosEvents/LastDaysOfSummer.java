package com.common.model.Cards.CardTypes.WesterosEvents;

import com.common.model.Cards.CardTypes.WesterosEvent;

public class LastDaysOfSummer extends WesterosEvent {
    public LastDaysOfSummer(){
        super("");
        message = "Ничего не происходит.";
    }

    @Override
    public void executeOnClient() {

    }

    @Override
    public void executeOnServer() {
    }
}
