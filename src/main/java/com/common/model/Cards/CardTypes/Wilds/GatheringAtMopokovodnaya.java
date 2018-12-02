package com.common.model.Cards.CardTypes.Wilds;

import com.client.GUIRequestsTempClass;
import com.common.model.Cards.CardTypes.Commander;
import com.common.model.Cards.CardTypes.WildVictory;
import com.common.model.Decks.CommanderDeck;
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
        player.getCommaders().returnRemoved();
    }

    @Override
    public void ApplyForLowestStake(Player player) {
        CommanderDeck commanders = player.getCommaders();

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
        }
    }

    @Override
    public void ApplyForEveryoneElse(ArrayList<Player> players) {
        for (Player player : players){
            Commander commanderToBeRemoved = GUIRequestsTempClass.getCommander(player);
            player.getCommaders().remove(commanderToBeRemoved);
        }
    }


}
