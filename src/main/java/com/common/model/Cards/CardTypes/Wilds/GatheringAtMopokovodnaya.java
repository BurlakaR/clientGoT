package com.common.model.Cards.CardTypes.Wilds;

import com.common.ClientController;
import com.common.Game;
import com.common.Player;
import com.common.model.Cards.CardTypes.WildVictory;
import com.common.model.utils.Auction;

import java.util.ArrayList;

public class GatheringAtMopokovodnaya extends WildVictory {
    public GatheringAtMopokovodnaya() {
        super("");
        this.message = "Высшая ставка забирает на руку весь сброс своих карт дома\n" +
                "Низшая ставка, если держит в руке больше одной карты, сбрасывает всех своих полководцев с наибольшей силой\n" +
                "Все остальные, если держат на руке более одной карты дома, сбрасывают по одной на свой выбор";
    }

    @Override
    public void applyForHighestStake(Player player) {
        player.getCommaders().returnRemoved();
    }

    @Override
    public void applyForLowestStake(Player player) {
        /*CommanderDeck commanders = player.getCommaders();

        int minForce = 4, tForce;
        for (Commander commander : commanders.getCommanders())
        {
            tForce = commander.getForce();
            if(minForce > tForce)
            {
                minForce = tForce;
            }
        }

        for (Commander commander: commanders.getCommanders()){
            if(commander.getForce() > minForce)
            {
                commanders.remove(commander);
            }
        }*/
    }

    @Override
    public void applyForEveryoneElse(ArrayList<Player> players) {
        for (Player player : players){
           /* Commander commanderToBeRemoved = controller.getCommander(player);
            player.getCommaders().remove(commanderToBeRemoved);*/
        }
    }

    @Override
    public void executeOnClient(ClientController controller, Game game) {
        Auction auction = game.getAuction();
        applyForHighestStake(auction.getHighestStake());
        applyForLowestStake(auction.getLowestStake());
        applyForEveryoneElse(auction.getEverybodyExceptHighestAndLowestStake());
    }

    @Override
    public void executeOnServer(Game game) {
    }
}
