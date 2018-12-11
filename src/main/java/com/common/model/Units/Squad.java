package com.common.model.Units;

import com.common.model.Map.MapNodes.MapNode;

import java.io.Serializable;
import java.util.ArrayList;

public class Squad implements Serializable{
    private ArrayList<Unit> squad = new ArrayList<Unit>();

    private MapNode node;

    public Squad(){}

    public Squad(ArrayList<Unit> draftees){
        squad = draftees;
    }

    public void addUnit(Unit unit){
        squad.add(unit);
    }

    public Unit takeUnit(Unit unit){
        squad.remove(unit);
        return unit;
    }

    public Unit get(int index){
        return squad.get(index);
    }

    public int size(){
        return squad.size();
    }

    public ArrayList<Unit> getSquad() {
        return squad;
    }

    public MapNode getNode() {
        return node;
    }

    public void setNode(MapNode node) {
        this.node = node;
    }
}
