package com.client.model.WesterosEvents;

public class StormOfSwords extends WesterosEvent {
    private static String message = "В фазе замыслов этого раунда игроки не могут отдавать приказы обороны";

    public StormOfSwords(){
        super(true, message);
    }

    @Override
    public void Trigger() {

    }
}
