package com.common.model.Decks;

import com.common.model.Cards.CardTypes.WildVictory;

public class WildDeck extends Deck {
   public WildDeck(){
        super();
    }

    @Override
    public WildVictory getTop(){
        return (WildVictory)super.getTop();
    }


    @Override
    public WildVictory showCard(int i){
        return (WildVictory)super.showCard(i);
    }

    @Override
    public WildVictory getCard(int i){
        return (WildVictory)super.getCard(i);
    }
}
