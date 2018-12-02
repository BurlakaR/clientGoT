package com.common.model.Cards.CardTypes;

import com.common.model.Cards.Card;
import com.common.model.Player;

import java.util.ArrayList;

public abstract class WildVictory extends Card {

    public abstract void ApplyForHighestStake(Player player);

    public abstract void ApplyForLowestStake(Player player);

    public abstract void ApplyForEveryoneElse(ArrayList<Player> players);


}
