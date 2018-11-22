package com.client.model.Wilds;

import com.client.model.Player;

import java.util.ArrayList;

public class RavenKillers extends WildVictory {
    private String message = "Высшая ставка может тут же заменить 2 любых своих воина рыцарями\n" +
            "Низшая ставка заменяет всех своих рыцарей доступными пешими воинами. " +
            "Рыцари, которых некем заменить, гибнут\n" +
            "Все прочие заменяют воинами по 2 своих рыцаря";

    public RavenKillers(String message) {
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
