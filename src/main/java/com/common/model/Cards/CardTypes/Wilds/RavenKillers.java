package com.common.model.Cards.CardTypes.Wilds;

import com.common.ClientController;
import com.common.Game;
import com.common.Player;
import com.common.model.Cards.CardTypes.WildVictory;

import java.util.ArrayList;

public class RavenKillers extends WildVictory {

    public RavenKillers() {
        super("");
        this.message = "Высшая ставка может тут же заменить 2 любых своих воина рыцарями\n" +
                "Низшая ставка заменяет всех своих рыцарей доступными пешими воинами. " +
                "Рыцари, которых некем заменить, гибнут\n" +
                "Все прочие заменяют воинами по 2 своих рыцаря";
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
