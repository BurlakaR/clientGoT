package com.client.model.Nodes;

import com.client.model.Units.Unit;
import com.client.model.utils.Displayable;

import java.util.ArrayList;

public class Node {
    private ArrayList<Unit> squad = new ArrayList<Unit>(); //not yet sure how would we apply the crusades
    private ArrayList<Node> neighbors = new ArrayList<Node>();
    private String name;
    private String img;

    public Node(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Node> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(ArrayList<Node> neighbors){ this.neighbors = neighbors;}
}
