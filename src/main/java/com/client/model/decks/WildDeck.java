package com.client.model.decks;

import com.client.model.Wilds.*;

public class WildDeck extends Deck{
    public WildDeck(){
        super();
        cards.add(new GatheringAtMopokovodnaya());
        cards.add(new HordeAssault());
        cards.add(new KingBehindTheWall());
        cards.add(new MammothRiders());
        cards.add(new RavenKillers());
        cards.add(new RobbersOfRattlingShirt());
        cards.add(new SilenceAtTheWall());
        cards.add(new Vanguard());
        cards.add(new WerewolfScout());
        this.shuffle();
    }
}
