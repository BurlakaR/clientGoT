package com.common.model.Map;

import com.client.communication.SocketManager;
import com.common.ClientController;
import com.common.Game;
import com.common.Message;
import com.common.model.Map.MapNodes.Land;
import com.common.model.Map.MapNodes.MapNode;
import com.common.model.Map.MapNodes.Port;
import com.common.model.Map.MapNodes.Sea;
import com.common.model.utils.Castle;

import java.util.ArrayList;

public class Map extends Message {
    private short numberOfPlayers;
    //dictionary of nodes here "field name" -> "instance of a node"
    ArrayList<MapNode> nodes;

    public Map(short numberOfPlayers)
    {
        this.numberOfPlayers = numberOfPlayers;
        nodes = new ArrayList<>();
        allNodes();

        //full standart init here
    }

    public ArrayList<MapNode> getNodes() {
        return nodes;
    }

    private void allNodes(){
        nodes.add(new Land(412, 1258, 280, 193, "Riverrun", null, 0, 1 ));
        nodes.add(new Sea(4, 1852, 878, 643, "ChannelRedwin" ));
        nodes.add(new Land(623, 535, 316, 379, "WhiteHarbor", new Castle(1, 0), 0, 0));
        nodes.add(new Land(54, 2282, 160, 137, "Arbor", null, 0, 1));
        nodes.add(new Land(521, 1078, 224, 185, "Twins", null, 0 , 1));
        nodes.add(new Sea(962, 1305, 293, 780, "BayOfCrashedShips"));
        nodes.add(new Land(789, 656, 225, 177, "WidowTower", null, 1 , 0));
        nodes.add(new Land(221, 327, 696, 557, "Winterfell", new Castle(2, 2), 1, 1));
        nodes.add(new Sea(816, 2064, 433, 431, "Summersea"));
        nodes.add(new Land(542, 2139, 490, 201, "Dorn", null, 0 , 1));
        nodes.add(new Land(360, 1900, 467, 310, "DornMarks", null, 1, 0));
        nodes.add(new Sea(650, 1997, 445, 187, "DornSea"));
        nodes.add(new Land(1028, 1422, 201, 215, "DragonStone", new Castle(2, 2), 1, 1));
        nodes.add(new Sea(865, 189, 384, 630, "ColdSea"));
        nodes.add(new Sea(0, 889, 241, 999, "WestSea"));
        nodes.add(new Sea(45, 1010, 470, 464, "IronManBay"));
        nodes.add(new Sea(1, 179, 631, 787, "IceBay"));
        nodes.add(new Land(413, 2201, 253, 157, "Starfall", null, 1 , 0));
        nodes.add(new Sea(29, 1282, 455, 367, "GoldBay"));
        nodes.add(new Land(384, 1385, 225, 264, "StoneChurch", null, 0, 1));
        nodes.add(new Land(129, 539, 338, 354, "StoneShore", null, 1, 0));
        nodes.add(new Land(798, 311, 291, 260, "Karhold", null, 0 , 1));
        nodes.add(new Land(719, 1565, 215, 216, "KingBay", new Castle(2, 5), 0, 2));
        nodes.add(new Land(688, 1377, 376, 231, "KingRoad", new Castle(1, 0), 0 ,0));
        nodes.add(new Land(705, 1561, 340, 360, "KingForest", null, 0, 1));
        nodes.add(new Land(138, 911, 216, 145, "StoneFingers", new Castle(1, 0), 0, 0));
        nodes.add(new Land(160, 1333, 281, 266, "Lannisport", new Castle(2, 2), 2 , 0));
        nodes.add(new Land (618, 1090, 479, 332, "MoonMountaints", null, 1 , 0));
        nodes.add(new Land(796, 1250, 331, 152, "EagleNest", new Castle(1, 6), 1 ,1));
        nodes.add(new Land(338, 890, 180, 200, "Neck", null, 1 , 0));
        nodes.add(new Land(706, 983, 372, 212, "Fingers", null, 1, 0));
        nodes.add(new Land(194, 1561, 213, 273, "SeaRoad", null, 1, 0));
        nodes.add(new Land(387, 1693, 377, 268, "Reach", new Castle(1, 0), 0,0));
        nodes.add(new Land(369, 1058, 248, 221, "Sigard", null, 1, 1));
        nodes.add(new Land(483, 836, 211, 305, "Keilin", new Castle(1,0), 0, 0));
        nodes.add(new Land(790, 2141, 324, 124, "SunSpear", new Castle(1, 0), 1, 1));
        nodes.add(new Land(154, 1973, 308, 332, "OldTown", new Castle(1, 0), 0, 0));
        nodes.add(new Sea(606, 767, 647, 678, "NarrowSea"));
        nodes.add(new Land(194, 1783, 258, 215, "Highgarden", new Castle(2,2), 2, 0 ));
        nodes.add(new Land(560, 1358, 180, 183, "Harrenhall", new Castle(1, 0), 1, 0));
        nodes.add(new Land(386, 1526, 341, 261, "Blackwater", null, 2 , 0));
        nodes.add(new Sea(803, 1487, 221, 193, "BlackBay"));
        nodes.add(new Land(508, 183, 399, 237, "BlackCastle", null, 0 , 1));
        nodes.add(new Land(801, 1777, 301, 278, "StormEnd", new Castle(1, 0 ), 0 ,0));
        nodes.add(new Land(85, 1106, 272, 224, "Pike", new Castle(2, 2), 1 , 1));
        nodes.add(new Port(710, 855, 109, 112,"PORT"));//WhiteHarbor
        nodes.add(new Port(281, 373, 115, 119, "PORT"));//Winterfell
        nodes.add(new Port(239, 1104, 119, 123, "PORT"));//Iron
        nodes.add(new Port(182, 1408, 116, 120, "PORT"));//Lannis
        nodes.add(new Port(1108, 1570, 113, 117,"PORT"));//Dragon
        nodes.add(new Port(929, 1864, 110, 113, "PORT"));//Storm
        nodes.add(new Port(1063, 2174, 122, 126, "PORT"));//Dorn
        nodes.add(new Port(114, 1977, 113, 117, "PORT"));//Reach
    }

    @Override
    public void executeOnClient(Game game, SocketManager socketManager, ClientController controller) {

    }

    @Override
    public Message executeOnServer(Game game, SocketManager socketManager) {
        return null;
    }
}
