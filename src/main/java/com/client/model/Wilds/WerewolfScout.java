package com.client.model.Wilds;

import com.client.model.Player;

import java.util.ArrayList;

public class WerewolfScout extends WildVictory {
    private String message = "Высшая ставка возвращает в свой запас жетонов власти свою ставку, " +
            "сделанную на отражение атаки\n" +
            "Низшая ставка сбрасывает все доступные жетоны власти\n" +
            "Все прочие сбрасывают по 2 доступных жетона власти";

    public WerewolfScout(String message) {
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
