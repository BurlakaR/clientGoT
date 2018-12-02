package com.common.model.utils;

import com.common.Message;

public class ForImage extends Message {

    String imgName;

    int x,y,w,h;

    public ForImage(int x, int y, int w, int h , String imgName){
        this.x=x;
        this.y=y;
        this.w=w;
        this.h=h;
        this.imgName =imgName;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
}
