package com.client.model.Wilds;

import com.client.model.Player;

import java.util.ArrayList;

public abstract class WildVictory {
    private String message;

    public WildVictory(String message)
    {
        this.message = message;
    }

    public abstract void ApplyForHighestStake(Player player);

    public abstract void ApplyForLowestStake(Player player);

    public abstract void ApplyForEveryoneElse(ArrayList<Player> players);

    public String getMessage() {
        return message;
    }
}
