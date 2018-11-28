package com.client.model.Cards.CardTypes.Wilds;

import com.client.model.Cards.CardTypes.WildVictory;
import com.client.model.Player;

import java.util.ArrayList;

public class SilenceAtTheWall extends WildVictory {

    public SilenceAtTheWall() {
        this.message = "Ничего не происходит";
        this.img="";
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
