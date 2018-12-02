package com.common.model.Cards.CardTypes.Wilds;

import com.common.model.Cards.CardTypes.WildVictory;
import com.common.model.Player;

import java.util.ArrayList;

public class MammothRiders extends WildVictory {

    public MammothRiders() {
        this.message = "Высшая ставка может выбрать из сброса одну карту дома и вернуть ее на руку\n" +
                "Низшая ставка теряет три любых отряда\n" +
                "Все прочие терят по 2 любых отряда";
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
