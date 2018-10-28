package com.common;



public class TestCommand extends Message {
    String x;
    String y;


    public TestCommand(String x, String y) {
        this.x=x;
        this.y=y;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public void print(){
        System.out.println(x+"-"+y);
    }
}