package com.client.model.WesterosEvents;

public class FeastForRavens extends WesterosEvent{
    private static String message = "В фазе замыслов этого раунда игроки не могут отдавать приказы подмоги";

    public FeastForRavens(){
        super(true, message);
    }

    @Override
    public void Trigger() {

    }
}
