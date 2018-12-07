package com.common.model.Cards.CardTypes.Wilds;

import com.common.ClientController;
import com.common.Game;
import com.common.Player;
import com.common.model.Cards.CardTypes.WildVictory;

import java.util.ArrayList;

public class WerewolfScout extends WildVictory {

    public WerewolfScout() {
        super("");
        this.message = "Высшая ставка возвращает в свой запас жетонов власти свою ставку, " +
                "сделанную на отражение атаки\n" +
                "Низшая ставка сбрасывает все доступные жетоны власти\n" +
                "Все прочие сбрасывают по 2 доступных жетона власти";
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
