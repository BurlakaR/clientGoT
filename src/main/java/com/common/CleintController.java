package com.common;

import com.common.model.Map.MapNodes.MapNode;

//A comment after the method says what would be sent by GUI handlers to the server as a result of execution
public interface CleintController {
    //shows user a list of available commanders and asks to choose between them, sends a choice.
    void getCommander();//Commander

    //logic-free util. Restriction on the type of source (owned/withAnArmy/etc) would be made elsewhere
    //void getNode();//Node

    //This is for army gathering. It should display a LIST of options on how the squad of a particular source could
    //be upgraded, then create actual specific Unit objects. Sends an updated game to be rendered on server.
    void chooseSquadComposition(MapNode node);//Game

    //gets stake for auctions and sends it
    void getStake();//Stake

    //puts a game into respective mode, player give orders and confirms.
    void putOrders();//Map
}
