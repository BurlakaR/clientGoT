package com.common.model.Cards.CardTypes.Wilds;

import com.common.*;
import com.common.model.Cards.CardTypes.WildVictory;

import java.util.ArrayList;

public class MammothRiders extends WildVictory {

    public MammothRiders() {
        super("");
        this.message = "Высшая ставка может выбрать из сброса одну карту дома и вернуть ее на руку\n" +
                "Низшая ставка теряет три любых отряда\n" +
                "Все прочие терят по 2 любых отряда";
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
    public void executeOnClient(Game game, SocketManagerCommon socketManager, ClientController controller) {

    }

    @Override
    public Message executeOnServer(Game game, SocketManagerCommon socketManager) {
        return null;
    }
}
