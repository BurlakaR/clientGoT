package com.common.model.Cards.CardTypes;

import com.common.model.Cards.Card;
import com.common.model.Game;

public abstract class WesterosEvent extends Card {
    private Boolean hasMammoth;

    public abstract void triggerCard(Game game);
}
