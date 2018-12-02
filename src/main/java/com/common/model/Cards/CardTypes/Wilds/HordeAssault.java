package com.common.model.Cards.CardTypes.Wilds;

import com.common.model.Cards.CardTypes.WildVictory;
import com.common.model.Player;

import java.util.ArrayList;

public class HordeAssault extends WildVictory {

    public HordeAssault() {
        this.message = "Высшая ставка может собрать войска по обычным правилам сбора в любом замке или крепости\n" +
                "Низшая ставка теряет 2 отряда в одном из своих замков или крепостей. Если таких нет, теряет 2 любых отряда\n" +
                "Все прочие теряют по одному любому отряду";
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
