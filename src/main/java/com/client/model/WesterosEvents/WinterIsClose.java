package com.client.model.WesterosEvents;

public class WinterIsClose extends WesterosEvent {
    private static String message = "";

    public WinterIsClose()
    {
        super(false, message);
    }

    @Override
    public void Trigger() {

    }
}
