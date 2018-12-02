package com.common.model.Cards.CardTypes;

import com.common.model.Cards.Card;
import com.common.model.utils.Battle;

public abstract class Commander extends Card {
    private short force; //ranges from 0 to 4

    public Commander(short force) throws Exception {
        if(force >= 0 && force <= 4)
        {
            this.force = force;
        }
        else
        {
            throw new Exception("force ranges from 0 to 4");
        }
    }

    public abstract void ApplyCommander(Battle battle);
}
