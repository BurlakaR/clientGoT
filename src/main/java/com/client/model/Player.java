package com.client.model;

public class Player {
    //there should be some kind of id here
    private short barrelSupply;
    private short numberOfCastles;
    private short ironThronePosition;
    private short valyrianSwordPosition;
    private short ravenPosition;

    public short getBarrelSupply() {
        return barrelSupply;
    }

    public void setBarrelSupply(short barrelSupply) {
        this.barrelSupply = barrelSupply;
    }

    public short getNumberOfCastles() {
        return numberOfCastles;
    }

    public void setNumberOfCastles(short numberOfCastles) {
        this.numberOfCastles = numberOfCastles;
    }

    public short getIronThronePosition() {
        return ironThronePosition;
    }

    public void setIronThronePosition(short ironThronePosition) {
        this.ironThronePosition = ironThronePosition;
    }

    public short getValyrianSwordPosition() {
        return valyrianSwordPosition;
    }

    public void setValyrianSwordPosition(short valyrianSwordPosition) {
        this.valyrianSwordPosition = valyrianSwordPosition;
    }

    public short getRavenPosition() {
        return ravenPosition;
    }

    public void setRavenPosition(short ravenPosition) {
        this.ravenPosition = ravenPosition;
    }
}
