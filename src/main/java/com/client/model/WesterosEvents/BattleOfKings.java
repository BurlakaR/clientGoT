package com.client.model.WesterosEvents;

public class BattleOfKings extends WesterosEvent {
    private static String message = "Все жетоны на треках влияния снимаются. Дома вступают в борьбу за влияние " +
            "на каждом из треков, начиная с железного трона";

    public BattleOfKings(){
        super(false, message);
    }

    @Override
    public void Trigger() {

    }
}
