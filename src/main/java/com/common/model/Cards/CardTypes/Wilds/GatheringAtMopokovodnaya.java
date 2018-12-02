package com.common.model.Cards.CardTypes.Wilds;

import com.common.model.Cards.CardTypes.WildVictory;
import com.common.model.Player;

import java.util.ArrayList;

public class GatheringAtMopokovodnaya extends WildVictory {

    public GatheringAtMopokovodnaya() {
        this.message = "Высшая ставка забирает на руку весь сброс своих карт дома\n" +
                "Низшая ставка, если держит в руке больше одной карты, сбрасывает всех своих полководцев с наибольшей силой\n" +
                "Все остальные, если держат на руке более одной карты дома, сбрасывают по одной на свой выбор";
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
