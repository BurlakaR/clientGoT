package com.common.model.Cards.CardTypes.Wilds;

import com.common.Game;
import com.common.IClientController;
import com.common.ISocketManager;
import com.common.Player;
import com.common.model.Cards.CardTypes.WildVictory;
import com.common.model.utils.Auction;

import java.util.ArrayList;

public class HordeAssault extends WildVictory {

    public HordeAssault() {
        super("");
        this.message = "Высшая ставка может собрать войска по обычным правилам сбора в любом замке или крепости\n" +
                "Низшая ставка теряет 2 отряда в одном из своих замков или крепостей. Если таких нет, теряет 2 любых отряда\n" +
                "Все прочие теряют по одному любому отряду";
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
        Auction auction = game.getAuction();
        applyForHighestStake(auction.getHighestStake());
        applyForLowestStake(auction.getLowestStake());
        applyForEveryoneElse(auction.getEverybodyExceptHighestAndLowestStake());
    }

    @Override
    public void executeOnServer(Game game, ISocketManager socketManager) {
    }
}
