package com.client.model.Wilds;

import com.client.model.Player;

import java.util.ArrayList;

public class RobbersOfRattlingShirt extends WildVictory {
    private String message = "Высшая ставка продвигается на одно деление по треку снабжения\n" +
            "Низшая ставка отступает на два деления назад по треку снабжения\n" +
            "Все прочие отступают на одно деление назад по треку снабжения";

    public RobbersOfRattlingShirt(String message) {
        super(message);
    }

    @Override
    public void ApplyForHighestStake(Player player) {

    }

    @Override
    public void ApplyForLowestStake(Player player) {

    }

    @Override
    public void ApplyForEveryoneElse(ArrayList<Player> players) {

    }
}
