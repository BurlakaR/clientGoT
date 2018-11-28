package com.client.model.Decks;

import com.client.model.Cards.CardTypes.Commander;

public class CommanderDeck extends Deck {
    public CommanderDeck(){
        super();
    }

    @Override
    public Commander getTop(){
        return (Commander)super.getTop();
    }

    @Override
    public Commander showCard(int i){
        return (Commander)super.showCard(i);
    }

    @Override
    public Commander getCard(int i){
        return (Commander)super.getCard(i);
    }
}
