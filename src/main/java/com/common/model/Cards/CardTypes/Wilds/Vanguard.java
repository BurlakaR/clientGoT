package com.common.model.Cards.CardTypes.Wilds;

import com.common.Game;
import com.common.IClientController;
import com.common.ISocketManager;
import com.common.Player;
import com.common.model.Cards.CardTypes.WildVictory;

import java.util.ArrayList;

public class Vanguard extends WildVictory {

    public Vanguard() {
        super("");
        this.message = "не учавствует в торгах (и распределении наград и штрафов по итогам) " +
                "за отражение атаки  одичалых, которые тут же нападают снвоа с силой 6\n" +
                "Низшая ставка на свой выбор либо: теряет 2 любых отряда, либо отступает на 2 деления по тому " +
                "треку влияния, где у нее наилучшая позиция\n" +
                "Все прочие не караются";
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
