package com.common.model.utils;

import com.common.model.Player;

import java.util.Comparator;

public class ComparePlayersIron implements Comparator<Player> {

    @Override
    public int compare(Player player, Player t1) {
        return player.getIronThronePosition()-t1.getIronThronePosition();
    }
}
