package com.common.model.Decks;

import com.common.ClientController;
import com.common.Game;
import com.common.Message;
import com.common.SocketManagerCommon;
import com.common.model.Cards.Card;
import com.common.model.Cards.CardTypes.WesterosEvent;

import java.util.ArrayList;

public class WesterosDeck extends Deck {
    public WesterosDeck(){
        super();
    }

    public ArrayList<WesterosEvent> getWesterosEvents() {
        ArrayList<WesterosEvent> westerosEvents = new ArrayList<WesterosEvent>();
        ArrayList<Card> cards = super.cards;
        for (Card c : cards){
            westerosEvents.add((WesterosEvent)c);
        }

        return westerosEvents;
    }

    public ArrayList<WesterosEvent> getRemovedWesterosEvents() {
        ArrayList<WesterosEvent> removedWesterosEvents= new ArrayList<WesterosEvent>();
        ArrayList<Card> removed = super.removed;
        for (Card we : removed){
            removedWesterosEvents.add((WesterosEvent)we);
        }

        return removedWesterosEvents;
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

    @Override
    public void executeOnClient(Game game, SocketManagerCommon socketManager, ClientController controller) {

    }

    @Override
    public Message executeOnServer(Game game, SocketManagerCommon socketManager) {
        return null;
    }
}
