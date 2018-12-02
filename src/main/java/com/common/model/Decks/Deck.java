package com.common.model.Decks;

import com.common.Message;
import com.common.model.Cards.Card;

import java.util.ArrayList;

public abstract class Deck extends Message {
    ArrayList<Card> cards=new ArrayList<>();;
    ArrayList<Card> removed=new ArrayList<>();;

    public Deck add(Card card){
       cards.add(card);
       return this;
    }

    public Card getTop(){
        if(!cards.isEmpty()){
            Card buf = cards.get(0);
            cards.remove(0);
            return buf;
        }
        return null;
    }

    public void returnRemoved(){
        for (Card c:
             removed) {
            cards.add(c);
        }
        this.shuffle();
        removed=new ArrayList<>();
    }

    public void remove(Card card){
        cards.remove(card);
        removed.add(card);
    }

    public Card showCard(int i){
        if(i<cards.size()){
            return cards.get(i);
        }
        return null;
    }

    public Card getCard(int i){
        if(i<cards.size()){
            Card buf = cards.get(i);
            cards.remove(i);
            return buf;
        }
        return null;
    }

    public void shuffle(){
        ArrayList<Card> buf = new ArrayList<>();
        int randindex;
        while(!cards.isEmpty()){
            randindex=(int) (Math.random() * cards.size());
            buf.add(cards.get(randindex));
            cards.remove(randindex);
        }
        cards=buf;
    }

    public int getDeckSize(){
        return cards.size();
    }

    public int getRemovedSize(){
        return removed.size();
    }
}
