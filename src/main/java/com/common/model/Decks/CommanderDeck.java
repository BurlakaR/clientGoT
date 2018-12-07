package com.common.model.Decks;

import com.common.ClientController;
import com.common.Game;
import com.common.model.Cards.Card;
import com.common.model.Cards.CardTypes.Commander;

import java.util.ArrayList;

public class CommanderDeck extends Deck {
    public CommanderDeck(){
        super();
    }

    public ArrayList<Commander> getCommanders() {
        ArrayList<Commander> comanders = new ArrayList<Commander>();
        ArrayList<Card> cards = super.cards;
        for (Card c : cards){
            comanders.add((Commander)c);
        }

        return comanders;
    }

    public ArrayList<Commander> getRemovedCommanders() {
        ArrayList<Commander> removedCommanders = new ArrayList<Commander>();
        ArrayList<Card> removed = super.removed;
        for (Card c : removed){
            removedCommanders.add((Commander)c);
        }

        return removedCommanders;
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

    //feeling so good about it...
    @Override
    public void executeOnClient(ClientController controller, Game game) {

    }

    @Override
    public void executeOnServer(Game game) {
    }
}
