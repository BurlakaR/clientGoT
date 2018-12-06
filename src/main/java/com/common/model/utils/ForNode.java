package com.common.model.utils;

public abstract class ForNode extends ForImage{
    int xpane, ypane;


    public ForNode(int x, int y, int w, int h, String imgName) {
        super(x, y, w, h, imgName);
    }

    public void setXYpane(int x, int y){
        this.xpane=x+100;
        this.ypane=y-150;
    }

    public int getXpane() {
        return xpane;
    }

    public int getYpane() {
        return ypane;
    }
}
