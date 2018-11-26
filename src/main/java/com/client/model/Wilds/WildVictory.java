package com.client.model.Wilds;

import com.client.model.Player;
import com.client.model.decks.Card;

import java.util.ArrayList;

public abstract class WildVictory extends Card{

    public abstract void ApplyForHighestStake(Player player);

    public abstract void ApplyForLowestStake(Player player);

    public abstract void ApplyForEveryoneElse(ArrayList<Player> players);


}
