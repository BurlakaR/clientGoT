package com.client.model.Cards.CardTypes.WesterosEvents;

import com.client.model.Cards.CardTypes.WesterosEvent;
import com.client.model.Game;

public class SupplyRecount extends WesterosEvent {
    private static String message = "Каждый Дом в порядке хода пересчитывает снабжение и, если необходимо, " +
            "уменьшает численность войск соответственно";

    public SupplyRecount(){
        message = "Каждый Дом в порядке хода пересчитывает снабжение и, если необходимо, " +
                "уменьшает численность войск соответственно";
        img = "";
    }

    @Override
    public void triggerCard(Game game) {

    }
}
