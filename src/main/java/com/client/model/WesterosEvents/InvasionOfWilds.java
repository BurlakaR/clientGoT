package com.client.model.WesterosEvents;

public class InvasionOfWilds extends WesterosEvent {
    private static String message = "Одичалые атакую вестерос. Опасность нашествия указана на треке одичалых. " +
            "Дома применяют власть, чтобы усиить Ночной дозор и отбить вторжение";

    public  InvasionOfWilds(){
        super(false, message);
    }

    @Override
    public void Trigger() {

    }
}
