package com.common;

import com.common.model.Cards.CardTypes.Commander;
import com.common.model.Map.MapNodes.MapNode;

public abstract class ClientController {

    //shows user a list of available commanders and asks to choose between them, sends a choice.
    public abstract void getCommander(Player p);

    //asks user to choose one of the nodes he owns with a castle. For army gathering, for instance.
    // Sends nodeForArmyGathering
    public abstract void getMapNodeWithCastle();

    //gets stake for auctions and sends it
    public abstract void getStake();
}

