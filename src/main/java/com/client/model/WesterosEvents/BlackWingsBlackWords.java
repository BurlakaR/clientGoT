package com.client.model.WesterosEvents;

public class BlackWingsBlackWords extends WesterosEvent {
    private static String message = "Владелец Посыльного ворна выбират один из трёх вариантов: " +
            "\nВсе Дома вступают в борьбу за влияние" +
            "\nВсе Дома собирают власть с подвластных земель, в которых есть знак короны" +
            "\nНичего не происходит";

    public BlackWingsBlackWords(){
        super(true, message);
    }

    @Override
    public void Trigger() {

    }
}
