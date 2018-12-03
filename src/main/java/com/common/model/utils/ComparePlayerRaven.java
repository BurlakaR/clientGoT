package com.common.model.utils;

import com.common.Player;

import java.util.Comparator;

public class ComparePlayerRaven implements Comparator<Player> {

    @Override
    public int compare(Player player, Player t1) {
        return player.getRavenPosition()-t1.getRavenPosition();
    }
}
