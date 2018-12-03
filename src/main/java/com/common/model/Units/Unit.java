package com.common.model.Units;

public abstract class Unit {
    protected short cost;
    protected short damage;
    protected short damageToCastles;
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
}
