package com.client.model.WesterosEvents;

public class LastDaysOfSummer extends WesterosEvent{
    private static String message = "Ничего не происходит.";

    public LastDaysOfSummer()
    {
        super(true, message);
    }

    @Override
    public void Trigger() {

    }
}
