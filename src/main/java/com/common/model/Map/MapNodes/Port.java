package com.common.model.Map.MapNodes;

public class Port extends MapNode {
    public Port(int x, int y, int w, int h, String name) {
        super(x, y, w, h, name);
        nodeType = NodeType.Port;
    }
}
