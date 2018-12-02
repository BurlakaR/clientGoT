package com.common.model.Cards.CardTypes.WesterosEvents;

import com.common.model.Cards.CardTypes.WesterosEvent;
import com.common.model.Game;

public class ThroneOfBlades extends WesterosEvent {
    public ThroneOfBlades(){
        message = "Владелец железного трона выбирает один из трёх вариантов:" +
                "\nвсе Дома пересчитывают снабжение и меняют количество и соств войск" +
                "\nвсе  Доба собирают войска" +
                "\nничего не происходит";
        img = "";
    }

    @Override
    public void triggerCard(Game game) {

    }
}
