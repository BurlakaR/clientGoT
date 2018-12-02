package com.common.model.Units.UnitTypes;

import com.common.model.Units.Unit;

public class Vessel extends Unit {
    public Vessel()
    {
        cost = 1;
        damage = 1;
        damageToCastles = 1; //would be counted when supporting other squads
    }
}
