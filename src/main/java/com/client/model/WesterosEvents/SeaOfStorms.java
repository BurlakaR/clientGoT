package com.client.model.WesterosEvents;

public class SeaOfStorms extends WesterosEvent {
    private static String message = "В фазе замыслов этого раунда игроки не могут отдавать приказы набега";

    public SeaOfStorms(){
        super(true, message);
    }

    @Override
    public void Trigger() {

    }
}
