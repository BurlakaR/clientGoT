package com.common.model.Units;

import com.common.Player;
import com.common.model.utils.ForImage;

public abstract class Unit extends ForImage{
    private Player player;
    protected short cost;
    protected short damage;
    protected short damageToCastles;

    public Unit(Player player, String imgName) {
        super(0, 0, 37, 45, imgName);
        this.player=player;
    }
    //in battle one of the damages should be taken, not a sum in case of a castle

    public short getCost() {
        return cost;
    }

    public short getDamage() {
        return damage;
    }

    public short getDamageToCastles() {
        return damageToCastles;
    }

    public Player getPlayer() {
        return player;
    }
}
