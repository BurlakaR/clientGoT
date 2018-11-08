package com.client.model.Nodes;

import com.client.model.utils.Castle;

import java.util.ArrayList;

public class Land extends Node {
    private Castle castle;
    private short numberOfBarrels;
    private short numberOfCrowns;

    public Land(String name,  ArrayList<Node> neighbors)
    {
        super(name, neighbors);
    }
}
