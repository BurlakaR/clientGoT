package com.common.model.Decks;

import com.common.model.Cards.CardTypes.WesterosEvent;

public class WesterosDeck extends Deck {
    public WesterosDeck(){
        super();
    }

    @Override
    public WesterosEvent getTop(){
        return (WesterosEvent)super.getTop();
    }

    @Override
    public WesterosEvent showCard(int i){
        return (WesterosEvent)super.showCard(i);
    }

    @Override
    public WesterosEvent getCard(int i){
        return (WesterosEvent)super.getCard(i);
    }
}
