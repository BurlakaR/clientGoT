package com.common.model.Cards.CardTypes.WesterosEvents;

import com.common.ClientController;
import com.common.Game;
import com.common.model.Cards.CardTypes.WesterosEvent;

public class SupplyRecount extends WesterosEvent {
    public SupplyRecount(){
        super("");
        message = "Каждый Дом в порядке хода пересчитывает снабжение и, если необходимо, " +
                "уменьшает численность войск соответственно";
    }
    @Override
    public void executeOnClient(ClientController controller, Game game) {

    }

    @Override
    public void executeOnServer(Game game) {
    }
}
