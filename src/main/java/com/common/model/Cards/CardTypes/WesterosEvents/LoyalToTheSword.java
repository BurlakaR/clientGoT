package com.common.model.Cards.CardTypes.WesterosEvents;

import com.common.model.Cards.CardTypes.WesterosEvent;

public class LoyalToTheSword extends WesterosEvent {
    public LoyalToTheSword(){
        super("");
        message = "Владелец Валерийского меча выбирает один из трёх вариантов: " +
                "\nВ фазе замыслов этого раунда не отдаются приказы обороны" +
                "\nВ фазе замыслов этого раунда не отдаются приказы похода +1" +
                "\nНичего не происходит";
    }
    @Override
    public void executeOnClient() {

    }

    @Override
    public void executeOnServer() {
    }
}
