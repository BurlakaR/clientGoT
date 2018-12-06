package com.common.model.Units.UnitTypes;

import com.common.Player;
import com.common.model.Units.Unit;

public class Tower extends Unit {
    public Tower(Player player)
    {
        super(player, ("Tower"+player.getName()));
        cost = 2;
        damage = 0;
        damageToCastles = 4;
    }
}
