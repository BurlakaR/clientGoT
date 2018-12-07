package com.common.model.Cards.CardTypes.WesterosEvents;

import com.common.ClientController;
import com.common.model.Cards.CardTypes.WesterosEvent;

public class ThroneOfBlades extends WesterosEvent {
    public ThroneOfBlades(){
        super("");
        message = "Владелец железного трона выбирает один из трёх вариантов:" +
                "\nвсе Дома пересчитывают снабжение и меняют количество и соств войск" +
                "\nвсе  Доба собирают войска" +
                "\nничего не происходит";
    }

    @Override
    public void executeOnClient(ClientController controller) {

    }

    @Override
    public void executeOnServer() {
    }
}
