package com.client.model.Cards.CardTypes;

import com.client.model.Game;
import com.client.model.Cards.Card;

public abstract class WesterosEvent extends Card {
    private Boolean hasMammoth;

    public abstract void triggerCard(Game game);
}
