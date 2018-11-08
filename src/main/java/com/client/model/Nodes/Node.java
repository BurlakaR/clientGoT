package com.client.model.Nodes;

import com.client.model.Units.Unit;

import java.util.ArrayList;

public class Node {
    private ArrayList<Unit> squad = new ArrayList<Unit>(); //not yet sure how would we apply the crusades
    private ArrayList<Node> neighbors = new ArrayList<Node>();
    private String name;

    public Node(String name,  ArrayList<Node> neighbors)
    {
        this.name = name;
        this.neighbors = neighbors;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Node> getNeighbors() {
        return neighbors;
    }
}
