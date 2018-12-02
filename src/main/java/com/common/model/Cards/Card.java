package com.common.model.Cards;

import com.common.Message;

public abstract class Card extends Message {
    protected String message = "";
    protected String img = "";

    public String getMessage() {
        return message;
    }
    public String getImg() {
        return img;
    }
}
