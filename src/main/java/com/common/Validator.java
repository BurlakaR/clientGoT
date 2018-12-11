package com.common;

import com.common.model.Map.MapNodes.MapNode;
import com.common.model.Map.MapNodes.NodeType;
import com.common.model.Orders.OrderRule;
import com.common.model.Orders.OrderType;
import com.common.model.Units.Squad;

import java.util.ArrayList;

//This class would analyse game object and determine whether it satisfies certain conditions.
public class Validator {

    public static boolean nodeIsReadyForOrder(Game game, MapNode node){
        return false;
    }

    //for army gathering
    public static ArrayList<MapNode> getNodesWithCastlesOwnedByPlayer(Game game){return null;}

    public static boolean nodeContainsForeignSquad(Game game, MapNode node){
        return false;
    }

    //returns an array of nodes which could be effected by the fire order, including the source node
    public static ArrayList<MapNode> getNodesThatCouldBeFired(MapNode node){
        ArrayList<MapNode> res = new ArrayList<MapNode>();
        if(node.getOrder().getOrderType() == OrderType.OrderFire){
            ArrayList<MapNode> neighbors = node.getNeighbors();
            res.add(node);
            for (MapNode n : neighbors){
                if(!n.isOwnedBy(node.getOwner())){
                    OrderType ot = n.getOrder().getOrderType();
                    if(ot == OrderType.OrderFire || ot == OrderType.OrderHelp
                            || (ot == OrderType.OrderDefence && n.getOrder().isStar())){
                        res.add(n);
                    }
                }
            }
        }
        return res;
    }

    public static ArrayList<MapNode> getNodesForRetreat(MapNode source){
        return null;
    }

    //get available nodes for attack order, including source
    public static ArrayList<MapNode> getNodesForCrusade(MapNode source){
        ArrayList<MapNode> res = new ArrayList<MapNode>();
        if(source.getOrder().getOrderType() == OrderType.OrderAttack){
            //res.add(source);
            ArrayList<MapNode> neighbors = source.getNeighbors();
            for (MapNode targetNode : neighbors){
                NodeType targetNodeType = targetNode.getNodeType();
                switch (source.getNodeType()){
                    case Land:
                            if(targetNodeType == NodeType.Land){
                                res.add(targetNode);
                            }
                            //res.addAll(getNodesAccessibleThroughSea(source));
                        break;
                    case Sea:
                        if(targetNodeType == NodeType.Sea ||
                                (targetNodeType == NodeType.Port && couldGetIntoPort(source, targetNode)))
                        {
                            res.add(targetNode);
                        }
                        break;
                    case Port:
                        if(targetNodeType == NodeType.Sea && getPortSea(source).isFreeOrOwnedBy(source.getOwner())){
                            res.add(targetNode);
                        }
                        break;
                }
            }
        }
        return res;
    }

    private static ArrayList<MapNode> getNodesAccessibleThroughSea(MapNode source){
        ArrayList<MapNode> res = new ArrayList<MapNode>();
        if(source.getNodeType() == NodeType.Land){
            ArrayList<MapNode> neighbors = source.getNeighbors();
            for(MapNode n : neighbors){
                if(n.getNodeType() == NodeType.Sea && n.isOwnedBy(source.getOwner())){
                    ArrayList<MapNode> controlledSeas = new ArrayList<MapNode>();
                    controlledSeas.addAll(getNeighboringControlledSeas(n));
                    for(MapNode cs : controlledSeas){
                        ArrayList<MapNode> csNeighbors = cs.getNeighbors();
                        for (MapNode csn : csNeighbors){
                            if(csn.getNodeType() == NodeType.Land){
                                res.add(csn);
                            }
                        }
                    }
                }
            }
        }
        return res;
    }

    //getting other sees owned by the same player nearby recursively
    private static ArrayList<MapNode> getNeighboringControlledSeas(MapNode sourceSea){
        ArrayList<MapNode> neighboringControlledSeas = new ArrayList<MapNode>();
        if(sourceSea.getNodeType() == NodeType.Sea){
            ArrayList<MapNode> neighbors = sourceSea.getNeighbors();
            for (MapNode n : neighbors){
                if(n.getNodeType() == NodeType.Sea && n.isOwnedBy(sourceSea.getOwner())){
                    neighboringControlledSeas.addAll(getNeighboringControlledSeas(n));
                }
            }
        }
        return neighboringControlledSeas ;
    }

    private static boolean couldGetIntoPort( MapNode sourceSea, MapNode targetPort){
        ArrayList<MapNode> portNeighbors = targetPort.getNeighbors();
        MapNode portLand = getPortLand(targetPort);
        return portLand.isFreeOrOwnedBy(sourceSea.getOwner());
    }

    private static MapNode getPortLand(MapNode port){
        if(port.getNodeType() == NodeType.Port){
            ArrayList<MapNode> portNeighbors = port.getNeighbors();
            for (MapNode n : portNeighbors){
                if(n.getNodeType() == NodeType.Land){
                    return n;
                }
            }
        }
        return null;
    }

    private static MapNode getPortSea(MapNode port){
        if(port.getNodeType() == NodeType.Port){
            ArrayList<MapNode> portNeighbors = port.getNeighbors();
            for (MapNode n : portNeighbors){
                if(n.getNodeType() == NodeType.Sea){
                    return n;
                }
            }
        }
        return null;
    }

    //returns squads that could be build in target node
    //Order source and target should be set. Rule order should be with a star.
    //After build, built squad should be added to order
    public static ArrayList<Squad> getSquadsPossibleToBuild(OrderRule order){
        return null;
    }

    //order source should be set. Rule order should be with a star.
    public static ArrayList<MapNode> getNodesAvailableForBuilding(OrderRule order){
        return null;
    }
}
