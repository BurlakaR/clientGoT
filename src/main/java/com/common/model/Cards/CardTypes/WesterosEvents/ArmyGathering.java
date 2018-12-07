package com.common.model.Cards.CardTypes.WesterosEvents;

import com.common.ClientController;
import com.common.model.Cards.CardTypes.WesterosEvent;

public class ArmyGathering extends WesterosEvent {
    public ArmyGathering(){
        super("");
        message = "Каждый Дом в порядке хода создает новые отряды в землях с крепостями и замками";
    }

    @Override
    public void executeOnClient(ClientController controller) {

    }

    @Override
    public void executeOnServer() {
    }
}
