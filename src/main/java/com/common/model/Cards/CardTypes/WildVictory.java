package com.common.model.Cards.CardTypes;

import com.common.model.Cards.Card;
import com.common.Player;

import java.util.ArrayList;

public abstract class WildVictory extends Card {

    public WildVictory(String img) {
        super(img);
    }

    public abstract void applyForHighestStake(Player player);

    public abstract void applyForLowestStake(Player player);

    public abstract void applyForEveryoneElse(ArrayList<Player> players);

}
