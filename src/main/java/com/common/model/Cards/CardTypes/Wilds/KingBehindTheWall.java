package com.common.model.Cards.CardTypes.Wilds;

import com.common.model.Cards.CardTypes.WildVictory;
import com.common.model.Player;

import java.util.ArrayList;

public class KingBehindTheWall extends WildVictory {

    public KingBehindTheWall() {
        this.message = "Высшая ставка продвигается на первое место любого трека и забирает " +
                "соответствующий жетон превосходства\n" +
                "Низшая ставка отсупает на последнее деление всех треков вллияния\n" +
                "Все прочие в порядке хода отступают на последнее деление трека вотчин или двора(по выбору)";
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
