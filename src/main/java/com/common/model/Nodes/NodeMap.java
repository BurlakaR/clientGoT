package com.common.model.Nodes;

import com.common.model.Units.Unit;
import com.common.model.utils.ForImage;

import java.util.ArrayList;

public class NodeMap extends ForImage {
    private ArrayList<Unit> squad = new ArrayList<Unit>(); //not yet sure how would we apply the crusades
    private ArrayList<NodeMap> neighbors = new ArrayList<NodeMap>();
    private String name;


    public NodeMap(int x, int y, int w, int h, String name) {
        super(x, y, w, h, name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<NodeMap> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(ArrayList<NodeMap> neighbors){ this.neighbors = neighbors;}
}
