package com.common.model.Units;

import java.io.Serializable;
import java.util.ArrayList;

public class Squad implements Serializable{
    private ArrayList<Unit> squad = new ArrayList<Unit>();

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
}
