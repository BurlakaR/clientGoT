package com.common.model.Nodes;

import com.common.model.utils.Castle;

public class Land extends NodeMap {
    private Castle castle;
    private short numberOfBarrels;
    private short numberOfCrowns;

    public Land(int x, int y, int w, int h, String name) {
        super(x, y, w, h, name);
    }
}
