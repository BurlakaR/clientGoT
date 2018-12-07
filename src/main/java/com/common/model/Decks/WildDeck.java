package com.common.model.Decks;

import com.common.ClientController;
import com.common.Game;
import com.common.Message;
import com.common.SocketManagerCommon;
import com.common.model.Cards.Card;
import com.common.model.Cards.CardTypes.WildVictory;

import java.util.ArrayList;

public class WildDeck extends Deck {
   public WildDeck(){
        super();
    }

    public ArrayList<WildVictory> getWildVictoryCards() {
        ArrayList<WildVictory> WildVictoryCards = new ArrayList<WildVictory>();
        ArrayList<Card> cards = super.cards;
        for (Card c : cards){
            WildVictoryCards.add((WildVictory)c);
        }

        return WildVictoryCards;
    }

    public ArrayList<WildVictory> getRemovedWildVictoryCards() {
        ArrayList<WildVictory> removedWildVictoryCards = new ArrayList<WildVictory>();
        ArrayList<Card> removed = super.removed;
        for (Card wv : removed){
            removedWildVictoryCards.add((WildVictory)wv);
        }

        return removedWildVictoryCards;
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

    @Override
    public void executeOnClient(Game game, SocketManagerCommon socketManager, ClientController controller) {

    }

    @Override
    public Message executeOnServer(Game game, SocketManagerCommon socketManager) {
        return null;
    }
}
