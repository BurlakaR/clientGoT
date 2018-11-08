package com.client.model.WesterosEvents;

public class SupplyRecount extends WesterosEvent {
    private static String message = "Каждый Дом в порядке хода пересчитывает снабжение и, если необходимо, " +
            "уменьшает численность войск соответственно";

    public SupplyRecount()
    {
        super(false, message);
    }

    @Override
    public void Trigger() {

    }
}
