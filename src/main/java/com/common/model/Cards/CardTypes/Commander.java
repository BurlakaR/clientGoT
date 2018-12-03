package com.common.model.Cards.CardTypes;

import com.common.model.Cards.Card;
import com.common.model.utils.Battle;

public abstract class Commander extends Card {
    private int force; //ranges from 0 to 4

    public Commander(String img, int force) {
        super(img);
        this.force = force;
    }

    public int getForce() {
        return force;
    }
}
