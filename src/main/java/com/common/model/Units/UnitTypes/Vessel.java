package com.common.model.Units.UnitTypes;

import com.common.Player;
import com.common.model.Units.Unit;

public class Vessel extends Unit {
    public Vessel(Player player)
    {
        super(player, ("Vessel"+player.getName()));
        cost = 1;
        damage = 1;
        damageToCastles = 1; //would be counted when supporting other squads
    }
}
