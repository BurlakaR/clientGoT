package com.common.model.Map.MapNodes;

import com.common.model.utils.Castle;


public class Land extends MapNode {
    private Castle castle;
    private int barrels; //1 or 2
    private int crowns; //1 or 2

    public Land(int x, int y, int w, int h, String name, Castle castle, int barrels, int crowns) {
        super(x, y, w, h, name);
        this.castle = castle;
        this.barrels = barrels;
        this.crowns = crowns;
        nodeType = NodeType.Land;
    }
}
