package com.common;

import com.client.communication.SocketManager;
import com.common.Message;
import com.common.model.Decks.CommanderDeck;
import com.common.model.Map.MapNodes.MapNode;

import java.util.ArrayList;

public class Player extends Message {
    private String name;
    private short barrelSupply;
    private short numberOfCastles;
    private short ironThronePosition;
    private short valyrianSwordPosition;
    private short ravenPosition;
    private short starNumber;
    private CommanderDeck commaders;
    private ArrayList<MapNode> ownedNodes = new ArrayList<MapNode>();


    public Player(String name, short barrelSupply, short numberOfCastles, short ironThronePosition,
                  short valyrianSwordPosition, short ravenPosition, CommanderDeck commnders){
        this.name = name;
        this.barrelSupply = barrelSupply;
        this.numberOfCastles = numberOfCastles;
        this.ironThronePosition = ironThronePosition;
        this.valyrianSwordPosition = valyrianSwordPosition;
        this.ravenPosition = ravenPosition;
        this.commaders = commnders;
    }



    public Player(String stark, int barrelSupply, int numberOfCastles, int ironThronePosition, int valyrianSwordPosition, int ravenPosition, CommanderDeck commnders){;}

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

    public CommanderDeck getCommaders() {
        return commaders;
    }

    public short getStarNumber() {
        return starNumber;
    }

    public void setStarNumber(short starNumber) {
        this.starNumber = starNumber;
    }

    @Override
    public void executeOnClient(Game game, SocketManager socketManager, ClientController controller) {

    }

    @Override
    public Message executeOnServer(Game game, SocketManager socketManager) {
        return null;
    }
}
