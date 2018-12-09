package com.common.model.Cards.CardTypes.Wilds;

import com.common.Game;
import com.common.IClientController;
import com.common.ISocketManager;
import com.common.Player;
import com.common.model.Cards.CardTypes.WildVictory;

import java.util.ArrayList;

public class RobbersOfRattlingShirt extends WildVictory {

    public RobbersOfRattlingShirt() {
        super("");
        this.message = "Высшая ставка продвигается на одно деление по треку снабжения\n" +
                "Низшая ставка отступает на два деления назад по треку снабжения\n" +
                "Все прочие отступают на одно деление назад по треку снабжения";
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
    public void executeOnClient(IClientController controller, Game game) {

    }

    @Override
    public void executeOnServer(Game game, ISocketManager socketManager) {
    }
}
