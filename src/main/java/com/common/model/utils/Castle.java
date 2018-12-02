package com.common.model.utils;

public class Castle {
    private short garrison;
    private short power; //either 1 or 2

    public Castle(short power, short garrison) throws Exception //not sure if it's OK to throw an exception here
    {
        if(power < 1 || power > 2)
        {
            throw new Exception("Castle power should be either 1 or 2");
        }
        this.power = power;
        this.garrison = garrison;
    }

    public short getGarrison() {
        return garrison;
    }

    public short getPower() {
        return power;
    }
}
