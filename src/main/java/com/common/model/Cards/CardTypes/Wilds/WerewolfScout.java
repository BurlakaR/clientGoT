package com.common.model.Cards.CardTypes.Wilds;

import com.common.model.Cards.CardTypes.WildVictory;
import com.common.model.Player;

import java.util.ArrayList;

public class WerewolfScout extends WildVictory {

    public WerewolfScout() {
        this.message = "Высшая ставка возвращает в свой запас жетонов власти свою ставку, " +
                "сделанную на отражение атаки\n" +
                "Низшая ставка сбрасывает все доступные жетоны власти\n" +
                "Все прочие сбрасывают по 2 доступных жетона власти";
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
