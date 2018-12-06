package com.common.model.Units;

import java.util.ArrayList;

public class Squad {
    private ArrayList<Unit> squad = new ArrayList<Unit>();

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
