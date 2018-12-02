package com.common.model.Cards.CardTypes.Wilds;

import com.common.model.Cards.CardTypes.WildVictory;
import com.common.model.Player;

import java.util.ArrayList;

public class Vanguard extends WildVictory {

    public Vanguard() {
        this.message = "не учавствует в торгах (и распределении наград и штрафов по итогам) " +
                "за отражение атаки  одичалых, которые тут же нападают снвоа с силой 6\n" +
                "Низшая ставка на свой выбор либо: теряет 2 любых отряда, либо отступает на 2 деления по тому " +
                "треку влияния, где у нее наилучшая позиция\n" +
                "Все прочие не караются";
        this.img="";
    }

    @Override
    public void ApplyForHighestStake(Player player) {

    }

    @Override
    public void ApplyForLowestStake(Player player) {

    }

    @Override
    public void ApplyForEveryoneElse(ArrayList<Player> players) {

    }
}
