package com.client.model.Cards.CardTypes;

import com.client.model.Player;
import com.client.model.Cards.Card;

import java.util.ArrayList;

public abstract class WildVictory extends Card{

    public abstract void ApplyForHighestStake(Player player);

    public abstract void ApplyForLowestStake(Player player);

    public abstract void ApplyForEveryoneElse(ArrayList<Player> players);


}
