package com.client.model.WesterosEvents;

public class ThroneOfBlades extends WesterosEvent {
    private static String message = "Владелец железного трона выбирает один из трёх вариантов:" +
            "\nвсе Дома пересчитывают снабжение и меняют количество и соств войск" +
            "\nвсе  Доба собирают войска" +
            "\nничего не происходит";

    public ThroneOfBlades(){
        super(true, message);
    }

    @Override
    public void Trigger() {

    }
}
