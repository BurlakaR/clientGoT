package com.client.model.WesterosEvents;

public class ArmyGathering extends WesterosEvent {
    private static String message = "Каждый Дом в порядке хода создает новые отряды в землях с крепостями и замками";

    public ArmyGathering()
    {
        super(false, message);
    }

    @Override
    public void Trigger() {

    }
}
