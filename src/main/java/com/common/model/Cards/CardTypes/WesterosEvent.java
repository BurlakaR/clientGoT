package com.common.model.Cards.CardTypes;

import com.common.model.Cards.Card;
import com.common.Game;

public abstract class WesterosEvent extends Card {
    private Boolean hasMammoth;

    public WesterosEvent(String img) {
        super(img);
    }

    public Boolean getHasMammoth() {
        return hasMammoth;
    }
}
