package com.common.model.Cards.CardTypes.Wilds;

import com.common.ClientController;
import com.common.Game;
import com.common.Player;
import com.common.model.Cards.CardTypes.WildVictory;

import java.util.ArrayList;

public class KingBehindTheWall extends WildVictory {

    public KingBehindTheWall() {
        super("");
        this.message = "Высшая ставка продвигается на первое место любого трека и забирает " +
                "соответствующий жетон превосходства\n" +
                "Низшая ставка отсупает на последнее деление всех треков вллияния\n" +
                "Все прочие в порядке хода отступают на последнее деление трека вотчин или двора(по выбору)";
    }

    @Override
    public void applyForHighestStake(Player player) {

    }

    @Override
    public void applyForLowestStake(Player player) {

    }

    @Override
    public void applyForEveryoneElse(ArrayList<Player> players) {

    }

    @Override
    public void executeOnClient(ClientController controller, Game game) {

    }

    @Override
    public void executeOnServer(Game game) {
    }
}
