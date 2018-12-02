package com.common.model.utils;

import com.common.model.Player;

import java.util.Comparator;

public class ComparePlayersSword implements Comparator<Player> {
    @Override
    public int compare(Player player, Player t1) {
        return player.getValyrianSwordPosition()-t1.getValyrianSwordPosition();
    }
}
