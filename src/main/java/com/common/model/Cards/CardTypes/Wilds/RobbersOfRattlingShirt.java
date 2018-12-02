package com.common.model.Cards.CardTypes.Wilds;

import com.common.model.Cards.CardTypes.WildVictory;
import com.common.model.Player;

import java.util.ArrayList;

public class RobbersOfRattlingShirt extends WildVictory {

    public RobbersOfRattlingShirt() {
        this.message = "Высшая ставка продвигается на одно деление по треку снабжения\n" +
                "Низшая ставка отступает на два деления назад по треку снабжения\n" +
                "Все прочие отступают на одно деление назад по треку снабжения";
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
