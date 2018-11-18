package com.common;


public class IntegerMessage extends Message {
    int message;

    public int getMessage() {
        return message;
    }

    public void setMessage(int message) {
        this.message = message;
    }

    public IntegerMessage(int message) {
        this.message = message;
    }

}