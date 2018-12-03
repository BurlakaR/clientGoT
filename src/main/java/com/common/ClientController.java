package com.common;

import com.common.model.Cards.CardTypes.Commander;
import com.common.model.Map.MapNodes.MapNode;

public abstract class ClientController {

    //shows user a list of available commanders and asks to choose between them, returns a choice.
    public abstract Commander getCommander(Player p);

    //asks user to choose one of the nodes he owns with a castle. For army gathering, for instance.
    public abstract MapNode getMapNodeWithCastle();

    //gets stake for auctions
    public abstract int getStake();
}

