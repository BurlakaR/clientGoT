package com.client.model.WesterosEvents;

public abstract class WesterosEvent {
    private Boolean hasMammoth;
    private String message;

    public WesterosEvent(Boolean hasMammoth, String message)
    {
        this.message = message;
        this.hasMammoth = hasMammoth;
    }

    public abstract void Trigger();

    public String getMessage() {
        return message;
    }
}
