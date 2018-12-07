package com.common.model.utils;

import com.common.Player;
import com.common.model.Decks.CommanderDeck;

public class EmptyLogo extends Logo {
    public EmptyLogo() {
        super(45,45,new Player("Empty",0,0,0,0,0,new CommanderDeck()));
        this.imgName="Empty";
    }
}
