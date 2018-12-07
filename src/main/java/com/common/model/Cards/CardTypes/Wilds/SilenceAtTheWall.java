package com.common.model.Cards.CardTypes.Wilds;

import com.common.ClientController;
import com.common.Game;
import com.common.Player;
import com.common.model.Cards.CardTypes.WildVictory;

import java.util.ArrayList;

public class SilenceAtTheWall extends WildVictory {

    public SilenceAtTheWall() {
        super("");
        this.message = "Ничего не происходит";
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
