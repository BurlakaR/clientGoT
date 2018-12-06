package com.common.model.Units.UnitTypes;

import com.common.Player;
import com.common.model.Units.Unit;

public class Soldier extends Unit {
    public Soldier(Player player)
    {
        super(player, ("Soldier"+player.getName()));
        cost = 1;
        damage = 1;
        damageToCastles = 1;
    }


}
