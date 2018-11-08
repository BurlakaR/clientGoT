package com.client.model.WesterosEvents;

public class WebOfLies extends WesterosEvent {
    private static String message = "В фазе замыслов этого раунда игроки не могут отдавать приказы подмоги";

    public WebOfLies(){
        super(true, message);
    }

    @Override
    public void Trigger() {

    }
}
