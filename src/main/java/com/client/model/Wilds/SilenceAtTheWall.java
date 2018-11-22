package com.client.model.Wilds;

import com.client.model.Player;

import java.util.ArrayList;

public class SilenceAtTheWall extends WildVictory{
    private String message = "Ничего не происходит";

    public SilenceAtTheWall(String message) {
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
