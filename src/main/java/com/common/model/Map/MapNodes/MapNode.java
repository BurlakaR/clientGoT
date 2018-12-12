package com.common.model.Map.MapNodes;

import com.common.Game;
import com.common.IClientController;
import com.common.ISocketManager;
import com.common.Player;
import com.common.model.Orders.NoOrder;
import com.common.model.Orders.Order;
import com.common.model.Units.Squad;
import com.common.model.Units.Unit;
import com.common.model.utils.EmptyLogo;
import com.common.model.utils.ForNode;
import com.common.model.utils.Logo;

import java.util.ArrayList;

public class MapNode extends ForNode {
    protected NodeType nodeType;
    private boolean isAble=true;
    private Player owner = null;
    private Squad squad = new Squad();
    private Order order = new NoOrder();
    private Logo logo;
    private ArrayList<MapNode> neighbors = new ArrayList<MapNode>();
    private String name;
    private Boolean hasPowerCoin;

    public MapNode(int x, int y, int w, int h, String name) {
        super(x, y, w, h, name);
        this.name = name;
        logo = new EmptyLogo();
    }

    public void updateNodeByNode(Game game, MapNode node){
        this.hasPowerCoin = node.hasPowerCoin;
        this.order = node.order;
        this.squad = node.squad;
        for (Unit u : squad.getSquad()){
            u.setPlayer(game.getPlayerByName(u.getPlayer().getName()));
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<MapNode> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(ArrayList<MapNode> neighbors){ this.neighbors = neighbors;}

    public Squad getSquad() {
        return squad;
    }

    public Squad takeSquad(){
        Squad buf = squad;
        squad = new Squad();
        return buf;
    }

    public void setSquad(Squad squad) {
        this.squad = squad;
        owner=squad.get(0).getPlayer();
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
        this.order.setSource(this);
    }

    public Logo getLogo() {
        return logo;
    }

    public void setLogo(Logo logo) {
        this.logo = logo;
        owner=logo.getPlayer();
    }

    public void setOwner(Player p){
        owner = p;
    }

    public boolean isFreeOrOwnedBy(Player p){
        if(owner == null){
            return true;
        }
        return owner.getName().equals(p.getName());
    }

    public boolean isOwnedBy(Player p){
        if(owner == null){
            return false;
        }
        return owner.getName().equals(p.getName());
    }

    //one more really bad place for those guys
    @Override
    public void executeOnClient(IClientController controller, Game game) {

    }

    @Override
    public void executeOnServer(Game game, ISocketManager socketManager) {
    }

    public Boolean getHasPowerCoin() {
        return hasPowerCoin;
    }

    public void setHasPowerCoin(Boolean hasPowerCoin) {
        this.hasPowerCoin = hasPowerCoin;
    }

    public boolean isAble() {
        return isAble;
    }

    public void setAble(boolean able) {
        isAble = able;
    }

    public NodeType getNodeType() {
        return nodeType;
    }

    public Player getOwner() {
        return owner;
    }

    public boolean containsACastle(){ return false;}
}
