package com.client.model.Wilds;

import com.client.model.Player;

import java.util.ArrayList;

public class MammothRiders extends WildVictory {
    private String message = "Высшая ставка может выбрать из сброса одну карту дома и вернуть ее на руку\n" +
            "Низшая ставка теряет три любых отряда\n" +
            "Все прочие терят по 2 любых отряда";

    public MammothRiders(String message) {
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
