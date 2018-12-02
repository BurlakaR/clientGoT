package com.common.model.Cards.CardTypes.WesterosEvents;

import com.common.model.Cards.CardTypes.WesterosEvent;
import com.common.model.Game;

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
