package com.common.model.Map;

import com.common.ClientController;
import com.common.Game;
import com.common.Message;
import com.common.SocketManagerCommon;
import com.common.model.Map.MapNodes.Land;
import com.common.model.Map.MapNodes.MapNode;
import com.common.model.Map.MapNodes.Port;
import com.common.model.Map.MapNodes.Sea;
import com.common.model.utils.Castle;

import java.util.ArrayList;

public class Map extends Message {
    private short numberOfPlayers;
    //dictionary of nodes here "field name" -> "instance of a node"
    ArrayList<MapNode> nodes = new ArrayList<MapNode>();;

    public Map(short numberOfPlayers)
    {
        this.numberOfPlayers = numberOfPlayers;
        addAllNodes();

        //full standart init here
    }


    @Override
    public void executeOnClient(Game game, SocketManagerCommon socketManager, ClientController controller) {

    }

    @Override
    public Message executeOnServer(Game game, SocketManagerCommon socketManager) {
        return null;
    }

    public ArrayList<MapNode> getNodes() {
        return nodes;
    }

    //this could have been a graph...
    private void addAllNodes(){
        nodes.add(new Land(412, 1258, 280, 193, "Riverrun", null, 0, 1 ));//0
        nodes.add(new Sea(4, 1852, 878, 643, "ChannelRedwin" ));//1
        nodes.add(new Land(623, 535, 316, 379, "WhiteHarbor", new Castle(1, 0), 0, 0));//2
        nodes.add(new Land(54, 2282, 160, 137, "Arbor", null, 0, 1));//3
        nodes.add(new Land(521, 1078, 224, 185, "Twins", null, 0 , 1));//4
        nodes.add(new Sea(962, 1305, 293, 780, "BayOfCrashedShips"));//5
        nodes.add(new Land(789, 656, 225, 177, "WidowTower", null, 1 , 0));//6
        nodes.add(new Land(221, 327, 696, 557, "Winterfell", new Castle(2, 2), 1, 1));//7
        nodes.add(new Sea(816, 2064, 433, 431, "Summersea"));//8
        nodes.add(new Land(542, 2139, 490, 201, "Dorn", null, 0 , 1));//9
        nodes.add(new Land(360, 1900, 467, 310, "DornMarks", null, 1, 0));//10
        nodes.add(new Sea(650, 1997, 445, 187, "DornSea"));//11
        nodes.add(new Land(1028, 1422, 201, 215, "DragonStone", new Castle(2, 2), 1, 1));//12
        nodes.add(new Sea(865, 189, 384, 630, "TremblingSea"));//13
        nodes.add(new Sea(0, 889, 241, 999, "SunsetSea"));//14
        nodes.add(new Sea(45, 1010, 470, 464, "IronManBay"));//15
        nodes.add(new Sea(1, 179, 631, 787, "IceBay"));//16
        nodes.add(new Land(413, 2201, 253, 157, "Starfall", null, 1 , 0));//17
        nodes.add(new Sea(29, 1282, 455, 367, "GoldBay"));//18
        nodes.add(new Land(384, 1385, 225, 264, "StoneChurch", null, 0, 1));//19
        nodes.add(new Land(129, 539, 338, 354, "StoneShore", null, 1, 0));//20
        nodes.add(new Land(798, 311, 291, 260, "Karhold", null, 0 , 1));//21
        nodes.add(new Land(719, 1565, 215, 216, "KingBay", new Castle(2, 5), 0, 2));//22
        nodes.add(new Land(688, 1377, 376, 231, "KingRoad", new Castle(1, 0), 0 ,0));//23
        nodes.add(new Land(705, 1561, 340, 360, "KingForest", null, 0, 1));//24
        nodes.add(new Land(138, 911, 216, 145, "StoneFingers", new Castle(1, 0), 0, 0));//25
        nodes.add(new Land(160, 1333, 281, 266, "Lannisport", new Castle(2, 2), 2 , 0));//26
        nodes.add(new Land (618, 1090, 479, 332, "MoonMountaints", null, 1 , 0));//27
        nodes.add(new Land(796, 1250, 331, 152, "EagleNest", new Castle(1, 6), 1 ,1));//28
        nodes.add(new Land(338, 890, 180, 200, "Neck", null, 1 , 0));//29
        nodes.add(new Land(706, 983, 372, 212, "Fingers", null, 1, 0));//30
        nodes.add(new Land(194, 1561, 213, 273, "SeaRoad", null, 1, 0));//31
        nodes.add(new Land(387, 1693, 377, 268, "Reach", new Castle(1, 0), 0,0));//32
        nodes.add(new Land(369, 1058, 248, 221, "Sigard", null, 1, 1));//33
        nodes.add(new Land(483, 836, 211, 305, "Keilin", new Castle(1,0), 0, 0));//34
        nodes.add(new Land(790, 2141, 324, 124, "SunSpear", new Castle(1, 0), 1, 1));//35
        nodes.add(new Land(154, 1973, 308, 332, "OldTown", new Castle(1, 0), 0, 0));//36
        nodes.add(new Sea(606, 767, 647, 678, "NarrowSea"));//37
        nodes.add(new Land(194, 1783, 258, 215, "Highgarden", new Castle(2,2), 2, 0 ));//38
        nodes.add(new Land(560, 1358, 180, 183, "Harrenhall", new Castle(1, 0), 1, 0));//39
        nodes.add(new Land(386, 1526, 341, 261, "Blackwater", null, 2 , 0));//40
        nodes.add(new Sea(803, 1487, 221, 193, "BlackBay"));//41
        nodes.add(new Land(508, 183, 399, 237, "BlackCastle", null, 0 , 1));//42
        nodes.add(new Land(801, 1777, 301, 278, "StormEnd", new Castle(1, 0 ), 0 ,0));//43
        nodes.add(new Land(85, 1106, 272, 224, "Pike", new Castle(2, 2), 1 , 1));//44
        nodes.add(new Port(710, 855, 109, 112,"PORT"));//WhiteHarbor//45
        nodes.add(new Port(281, 373, 115, 119, "PORT"));//Winterfell//46
        nodes.add(new Port(239, 1104, 119, 123, "PORT"));//Iron//Pike//47
        nodes.add(new Port(182, 1408, 116, 120, "PORT"));//Lannis//48
        nodes.add(new Port(1108, 1570, 113, 117,"PORT"));//Dragon//49
        nodes.add(new Port(929, 1864, 110, 113, "PORT"));//Storm//50
        nodes.add(new Port(1063, 2174, 122, 126, "PORT"));//Dorn//51
        nodes.add(new Port(114, 1977, 113, 117, "PORT"));//Reach/простор//старомест//52

        //setting neighbors
        //Riverrun
        nodes.get(0).setNeighbors(new ArrayList<MapNode>(){{
            add(nodes.get(15));
            add(nodes.get(33));
            add(nodes.get(27));
            add(nodes.get(39));
            add(nodes.get(19));
            add(nodes.get(26));
            add(nodes.get(18));
        }});
        nodes.get(0).setXYpane(365, 1449);
        //ChannelRedwin
        nodes.get(1).setNeighbors(new ArrayList<MapNode>(){{
            add(nodes.get(3));
            add(nodes.get(52));//this should be a port near staromest
            add(nodes.get(32));
            add(nodes.get(17));
            add(nodes.get(38));
            add(nodes.get(9));
            add(nodes.get(8));
            add(nodes.get(14));//закатное море
        }});
        nodes.get(1).setXYpane(139, 2540);
        //WhiteHarbor
        nodes.get(2).setNeighbors(new ArrayList<MapNode>(){{
            add(nodes.get(34));
            add(nodes.get(45));
            add(nodes.get(6));
            add(nodes.get(7));
            add(nodes.get(13));
            add(nodes.get(37));
        }});
        nodes.get(2).setXYpane(556, 880);
        //Arbor
        nodes.get(3).setNeighbors(new ArrayList<MapNode>(){{
            add(nodes.get(1));
        }});
        nodes.get(3).setXYpane(-64, 2486);
        //Twins
        nodes.get(4).setNeighbors(new ArrayList<MapNode>(){{
            add(nodes.get(33));
            add(nodes.get(34));
            add(nodes.get(37));
            add(nodes.get(30));
            add(nodes.get(27));
        }});
        nodes.get(4).setXYpane(451, 1280);
        //BayOfCrashedShips
        nodes.get(5).setNeighbors(new ArrayList<MapNode>(){{
            add(nodes.get(49));
            add(nodes.get(50));
            add(nodes.get(12));
            add(nodes.get(8));
            add(nodes.get(11));
            add(nodes.get(43));
            add(nodes.get(24));
            add(nodes.get(41));
            add(nodes.get(23));
            add(nodes.get(37));
        }});
        nodes.get(5).setXYpane(900, 1871);
        //WidowTower
        nodes.get(6).setNeighbors(new ArrayList<MapNode>(){{
            add(nodes.get(37));
            add(nodes.get(2));
            add(nodes.get(13));
        }});
        nodes.get(6).setXYpane(718, 852);
        //Winterfell
        nodes.get(7).setNeighbors(new ArrayList<MapNode>(){{
            add(nodes.get(46));
            add(nodes.get(20));
            add(nodes.get(16));
            add(nodes.get(42));
            add(nodes.get(21));
            add(nodes.get(13));
            add(nodes.get(2));
            add(nodes.get(34));
        }});
        nodes.get(7).setXYpane(494, 597);
        //Summersea
        nodes.get(8).setNeighbors(new ArrayList<MapNode>(){{
            add(nodes.get(1));
            add(nodes.get(9));
            add(nodes.get(35));
            add(nodes.get(51));
            add(nodes.get(11));
            add(nodes.get(5));
        }});
        nodes.get(8).setXYpane(896, 2543);
        //Dorn
        nodes.get(9).setNeighbors(new ArrayList<MapNode>(){{
            add(nodes.get(8));
            add(nodes.get(1));
            add(nodes.get(17));
            add(nodes.get(10));
            add(nodes.get(11));
            add(nodes.get(35));
        }});
        nodes.get(9).setXYpane(544, 2363);
        //DornMarks
        nodes.get(10).setNeighbors(new ArrayList<MapNode>(){{
            add(nodes.get(17));
            add(nodes.get(9));
            add(nodes.get(11));
            add(nodes.get(43));
            add(nodes.get(24));
            add(nodes.get(32));
            add(nodes.get(38));
            add(nodes.get(36));
        }});
        nodes.get(10).setXYpane(333, 2119);
        //DornSea
        nodes.get(11).setNeighbors(new ArrayList<MapNode>(){{
            add(nodes.get(5));
            add(nodes.get(8));
            add(nodes.get(35));
            add(nodes.get(9));
            add(nodes.get(10));
            add(nodes.get(43));
        }});
        nodes.get(11).setXYpane(680, 2216);
        //DragonStone
        nodes.get(12).setNeighbors(new ArrayList<MapNode>(){{
            add(nodes.get(49));
            add(nodes.get(5));
        }});
        nodes.get(12).setXYpane(938, 1635);
        //TremblingSea
        nodes.get(13).setNeighbors(new ArrayList<MapNode>(){{
            add(nodes.get(42));
            add(nodes.get(21));
            add(nodes.get(7));
            add(nodes.get(2));
            add(nodes.get(6));
            add(nodes.get(37));
        }});
        nodes.get(13).setXYpane(933, 847);
        //SunsetSea
        nodes.get(14).setNeighbors(new ArrayList<MapNode>(){{
            add(nodes.get(16));
            add(nodes.get(25));
            add(nodes.get(15));
            add(nodes.get(18));
            add(nodes.get(31));
            add(nodes.get(38));
            add(nodes.get(1));
        }});
        nodes.get(14).setXYpane(-67, 1869);
        //IronManBay
        nodes.get(15).setNeighbors(new ArrayList<MapNode>(){{
            add(nodes.get(47));
            add(nodes.get(44));
            add(nodes.get(18));
            add(nodes.get(14));
            add(nodes.get(25));
            add(nodes.get(29));
            add(nodes.get(33));
            add(nodes.get(0));
        }});
        nodes.get(15).setXYpane(-64, 1481);
        //IceBay
        nodes.get(16).setNeighbors(new ArrayList<MapNode>(){{
            add(nodes.get(46));
            add(nodes.get(29));
            add(nodes.get(25));
            add(nodes.get(14));
            add(nodes.get(20));
            add(nodes.get(7));
            add(nodes.get(42));
        }});
        nodes.get(16).setXYpane(-63, 626);
        //Starfall
        nodes.get(17).setNeighbors(new ArrayList<MapNode>(){{
            add(nodes.get(1));
            add(nodes.get(9));
            add(nodes.get(10));
        }});
        nodes.get(17).setXYpane(330, 2414);
        //GoldBay
        nodes.get(18).setNeighbors(new ArrayList<MapNode>(){{
            add(nodes.get(31));
            add(nodes.get(14));
            add(nodes.get(15));
            add(nodes.get(48));
            add(nodes.get(26));
        }});
        nodes.get(18).setXYpane(-63, 1698);
        //StoneChurch
        nodes.get(19).setNeighbors(new ArrayList<MapNode>(){{
            add(nodes.get(26));
            add(nodes.get(0));
            add(nodes.get(39));
            add(nodes.get(40));
            add(nodes.get(31));
        }});
        nodes.get(19).setXYpane(326, 1656);
        //StoneShore
        nodes.get(20).setNeighbors(new ArrayList<MapNode>(){{
            add(nodes.get(7));
            add(nodes.get(16));
        }});
        nodes.get(20).setXYpane(118, 861);
        //Karhold
        nodes.get(21).setNeighbors(new ArrayList<MapNode>(){{
            add(nodes.get(42));
            add(nodes.get(13));
            add(nodes.get(7));
        }});
        nodes.get(21).setXYpane(773, 531);
        //KingBay
        nodes.get(22).setNeighbors(new ArrayList<MapNode>(){{
            add(nodes.get(32));
            add(nodes.get(40));
            add(nodes.get(23));
            add(nodes.get(41));
            add(nodes.get(24));
        }});
        nodes.get(22).setXYpane(619, 1776);
        //KingRoad
        nodes.get(23).setNeighbors(new ArrayList<MapNode>(){{
            add(nodes.get(37));
            add(nodes.get(5));
            add(nodes.get(41));
            add(nodes.get(22));
            add(nodes.get(40));
            add(nodes.get(39));
            add(nodes.get(27));
        }});
        nodes.get(23).setXYpane(648, 1622);
        //KingForest
        nodes.get(24).setNeighbors(new ArrayList<MapNode>(){{
            add(nodes.get(32));
            add(nodes.get(22));
            add(nodes.get(41));
            add(nodes.get(5));
            add(nodes.get(43));
            add(nodes.get(10));
        }});
        nodes.get(24).setXYpane(635, 1925);
        //StoneFingers
        nodes.get(25).setNeighbors(new ArrayList<MapNode>(){{
            add(nodes.get(15));
            add(nodes.get(14));
            add(nodes.get(16));
            add(nodes.get(29));
        }});
        nodes.get(25).setXYpane(56, 1134);
        //Lannisport
        nodes.get(26).setNeighbors(new ArrayList<MapNode>(){{
            add(nodes.get(48));
            add(nodes.get(18));
            add(nodes.get(0));
            add(nodes.get(19));
            add(nodes.get(31));
        }});
        nodes.get(26).setXYpane(138, 1665);
        //MoonMountaints
        nodes.get(27).setNeighbors(new ArrayList<MapNode>(){{
            add(nodes.get(4));
            add(nodes.get(30));
            add(nodes.get(37));
            add(nodes.get(28));
            add(nodes.get(23));
        }});
        nodes.get(27).setXYpane(576, 1380);
        //EagleNest
        nodes.get(28).setNeighbors(new ArrayList<MapNode>(){{
            add(nodes.get(27));
            add(nodes.get(37));
        }});
        nodes.get(28).setXYpane(754, 1448);
        //Neck
        nodes.get(29).setNeighbors(new ArrayList<MapNode>(){{
            add(nodes.get(15));
            add(nodes.get(25));
            add(nodes.get(16));
            add(nodes.get(34));
            add(nodes.get(33));
        }});
        nodes.get(29).setXYpane(250, 1111);
        //Fingers
        nodes.get(30).setNeighbors(new ArrayList<MapNode>(){{
            add(nodes.get(4));
            add(nodes.get(37));
            add(nodes.get(27));
        }});
        nodes.get(30).setXYpane(649, 1234);
        //SeaRoad
        nodes.get(31).setNeighbors(new ArrayList<MapNode>(){{
            add(nodes.get(14));
            add(nodes.get(18));
            add(nodes.get(26));
            add(nodes.get(19));
            add(nodes.get(40));
            add(nodes.get(32));
            add(nodes.get(38));
        }});
        nodes.get(31).setXYpane(116, 1819);
        //Reach
        nodes.get(32).setNeighbors(new ArrayList<MapNode>(){{
            add(nodes.get(38));
            add(nodes.get(31));
            add(nodes.get(40));
            add(nodes.get(22));
            add(nodes.get(24));
            add(nodes.get(10));
        }});
        nodes.get(32).setXYpane(379, 1965);
        //Sigard
        nodes.get(33).setNeighbors(new ArrayList<MapNode>(){{
            add(nodes.get(15));
            add(nodes.get(29));
            add(nodes.get(34));
            add(nodes.get(4));
            add(nodes.get(0));
        }});
        nodes.get(33).setXYpane(303, 1343);
        //Keilin
        nodes.get(34).setNeighbors(new ArrayList<MapNode>(){{
            add(nodes.get(37));
            add(nodes.get(4));
            add(nodes.get(33));
            add(nodes.get(29));
            add(nodes.get(7));
            add(nodes.get(2));
        }});
        nodes.get(34).setXYpane(405, 1102);
        //SunSpear
        nodes.get(35).setNeighbors(new ArrayList<MapNode>(){{
            add(nodes.get(9));
            add(nodes.get(11));
            add(nodes.get(51));
            add(nodes.get(8));
        }});
        nodes.get(35).setXYpane(116, 1819);
        //OldTown
        nodes.get(36).setNeighbors(new ArrayList<MapNode>(){{
            add(nodes.get(1));
            add(nodes.get(52));
            add(nodes.get(38));
            add(nodes.get(10));
        }});
        nodes.get(36).setXYpane(110, 2234);
        //NarrowSea
        nodes.get(37).setNeighbors(new ArrayList<MapNode>(){{
            add(nodes.get(13));
            add(nodes.get(6));
            add(nodes.get(2));
            add(nodes.get(45));
            add(nodes.get(34));
            add(nodes.get(4));
            add(nodes.get(30));
            add(nodes.get(27));
            add(nodes.get(28));
            add(nodes.get(23));
            add(nodes.get(5));
        }});
        nodes.get(37).setXYpane(932, 1026);
        //Highgarden
        nodes.get(38).setNeighbors(new ArrayList<MapNode>(){{
            add(nodes.get(1));
            add(nodes.get(14));
            add(nodes.get(31));
            add(nodes.get(32));
            add(nodes.get(10));
            add(nodes.get(36));
        }});
        nodes.get(38).setXYpane(174, 2023);
        //Harrenhall
        nodes.get(39).setNeighbors(new ArrayList<MapNode>(){{
            add(nodes.get(23));
            add(nodes.get(40));
            add(nodes.get(19));
            add(nodes.get(0));
        }});
        nodes.get(39).setXYpane(478, 1565);
        //Blackwater
        nodes.get(40).setNeighbors(new ArrayList<MapNode>(){{
            add(nodes.get(31));
            add(nodes.get(19));
            add(nodes.get(39));
            add(nodes.get(23));
            add(nodes.get(22));
            add(nodes.get(32));
        }});
        nodes.get(40).setXYpane(368, 1799);
        //BlackBay
        nodes.get(41).setNeighbors(new ArrayList<MapNode>(){{
            add(nodes.get(24));
            add(nodes.get(22));
            add(nodes.get(23));
            add(nodes.get(5));
        }});
        nodes.get(41).setXYpane(767, 1707);
        //BlackCastle
        nodes.get(42).setNeighbors(new ArrayList<MapNode>(){{
            add(nodes.get(16));
            add(nodes.get(7));
            add(nodes.get(21));
            add(nodes.get(13));
        }});
        nodes.get(42).setXYpane(492, 412);
        //StormEnd
        nodes.get(43).setNeighbors(new ArrayList<MapNode>(){{
            add(nodes.get(50));
            add(nodes.get(11));
            add(nodes.get(10));
            add(nodes.get(24));
            add(nodes.get(5));
        }});
        nodes.get(43).setXYpane(741, 2110);
        //Pike
        nodes.get(44).setNeighbors(new ArrayList<MapNode>(){{
            add(nodes.get(47));
            add(nodes.get(15));
        }});
        nodes.get(44).setXYpane(51, 1391);
        //WhiteHarbor port
        nodes.get(45).setNeighbors(new ArrayList<MapNode>(){{
            add(nodes.get(37));
            add(nodes.get(2));
        }});
        nodes.get(45).setXYpane(592, 1053);
        //Winterfell port
        nodes.get(46).setNeighbors(new ArrayList<MapNode>(){{
            add(nodes.get(7));
            add(nodes.get(16));
        }});
        nodes.get(46).setXYpane(168, 505);
        //Iron port
        nodes.get(47).setNeighbors(new ArrayList<MapNode>(){{
            add(nodes.get(15));
            add(nodes.get(44));
        }});
        nodes.get(47).setXYpane(98, 1252);
        //Lannis port
        nodes.get(48).setNeighbors(new ArrayList<MapNode>(){{
            add(nodes.get(18));
            add(nodes.get(26));
        }});
        nodes.get(48).setXYpane(39, 1549);
        //Dragon port
        nodes.get(49).setNeighbors(new ArrayList<MapNode>(){{
            add(nodes.get(12));
            add(nodes.get(5));
        }});
        nodes.get(49).setXYpane(961, 1765);
        //Storm port
        nodes.get(50).setNeighbors(new ArrayList<MapNode>(){{
            add(nodes.get(43));
            add(nodes.get(5));
        }});
        nodes.get(50).setXYpane(834, 2005);
        //Dorn port
        nodes.get(51).setNeighbors(new ArrayList<MapNode>(){{
            add(nodes.get(35));
            add(nodes.get(8));
        }});
        nodes.get(51).setXYpane(960, 2361);
        //Reach port
        nodes.get(52).setNeighbors(new ArrayList<MapNode>(){{
            add(nodes.get(1));
            add(nodes.get(36));
        }});
        nodes.get(52).setXYpane(-14, 2122);
    }
}
