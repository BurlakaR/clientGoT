package com.common.model.Cards.CardTypes;

import com.common.model.Cards.Card;

public abstract class WesterosEvent extends Card {
    private Boolean hasMammoth;

    public WesterosEvent(String img) {
        super(img);
    }

    public Boolean getHasMammoth() {
        return hasMammoth;
    }
}
