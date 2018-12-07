package com.common.model.utils;

import java.io.Serializable;

public class Castle implements Serializable{
    private int garrison;
    private int power; //either 1 or 2, unexpected shit on other values, no time for exceptions

    public Castle(int power, int garrison)
    {
        this.power = power;
        this.garrison = garrison;
    }

    public int getGarrison() {
        return garrison;
    }

    public int getPower() {
        return power;
    }
}
