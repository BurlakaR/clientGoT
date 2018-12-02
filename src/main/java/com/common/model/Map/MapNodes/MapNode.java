package com.common.model.Map.MapNodes;

import com.common.model.Units.Squad;
import com.common.model.utils.Castle;
import com.common.model.utils.ForImage;

import java.util.ArrayList;

public class MapNode extends ForImage {
    private Squad squad = new Squad();
    private ArrayList<MapNode> neighbors = new ArrayList<MapNode>();
    private String name;
    private Boolean hasPoweerCoin;

    public MapNode(int x, int y, int w, int h, String name) {
        super(x, y, w, h, name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<MapNode> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(ArrayList<MapNode> neighbors){ this.neighbors = neighbors;}
}
