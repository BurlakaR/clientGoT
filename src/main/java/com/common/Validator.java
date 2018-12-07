package com.common;

import com.common.model.Map.MapNodes.MapNode;

import java.util.ArrayList;

//This class would analyse game object and determine whether it satisfies certain conditions.
public class Validator {

    public static boolean nodeIsReadyForOrder(MapNode node){
        return false;
    }

    //for army gathering
    public static ArrayList<MapNode> getNodesWithCastlesOwnedByPlayer(){return null;}

    public static boolean nodeContainsForeignSquad(MapNode node){

        return false;
    }
}
