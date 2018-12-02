package com.common.model.Cards.CardTypes.WesterosEvents;

import com.common.model.Cards.CardTypes.WesterosEvent;
import com.common.model.Game;

public class LoyalToTheSword extends WesterosEvent {
    public LoyalToTheSword(){
        message = "Владелец Валерийского меча выбирает один из трёх вариантов: " +
                "\nВ фазе замыслов этого раунда не отдаются приказы обороны" +
                "\nВ фазе замыслов этого раунда не отдаются приказы похода +1" +
                "\nНичего не происходит";
        img = "";
    }

    @Override
    public void triggerCard(Game game) {

    }
}
