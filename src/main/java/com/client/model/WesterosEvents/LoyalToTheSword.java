package com.client.model.WesterosEvents;

public class LoyalToTheSword extends WesterosEvent {
    private static String message = "Владелец Валерийского меча выбирает один из трёх вариантов: " +
            "\nВ фазе замыслов этого раунда не отдаются приказы обороны" +
            "\nВ фазе замыслов этого раунда не отдаются приказы похода +1" +
            "\nНичего не происходит";

    public LoyalToTheSword(){
        super(false, message);
    }

    @Override
    public void Trigger() {

    }
}
