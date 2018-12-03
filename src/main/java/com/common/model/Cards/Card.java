package com.common.model.Cards;

import com.common.Message;
import com.common.model.utils.ForImage;

public abstract class Card extends ForImage {
    protected String message = "";

    public Card(String img){
        //numbers are random for now!!!
        super(0, 0, 10, 10, img);
    }

    public String getMessage() {
        return message;
    }
}
