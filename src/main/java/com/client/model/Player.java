package com.client.model;

import com.client.model.Commanders.Commander;

import java.util.ArrayList;

public class Player {
    private String name;
    private short barrelSupply;
    private short numberOfCastles;
    private short ironThronePosition;
    private short valyrianSwordPosition;
    private short ravenPosition;
    private ArrayList<Commander> commanders = new ArrayList<Commander>();

    public Player(String name, short barrelSupply, short numberOfCastles, short ironThronePosition,
                  short valyrianSwordPosition, short ravenPosition, ArrayList<Commander> commanders){
        this.name = name;
        this.barrelSupply = barrelSupply;
        this.numberOfCastles = numberOfCastles;
        this.ironThronePosition = ironThronePosition;
        this.valyrianSwordPosition = valyrianSwordPosition;
        this.ravenPosition = ravenPosition;
        this.commanders = commanders;
    }

    public Player(){;}

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

    public String getName() {
        return name;
    }

    public ArrayList<Commander> getCommanders() {
        return commanders;
    }
}
