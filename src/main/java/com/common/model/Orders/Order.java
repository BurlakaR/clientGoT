package com.common.model.Orders;

import com.common.Game;
import com.common.IClientController;
import com.common.ISocketManager;
import com.common.model.Map.MapNodes.MapNode;
import com.common.model.utils.ForImage;

public abstract class Order extends ForImage {
    //Fuck Liskov
    protected OrderType orderType;
    private boolean available;
    private boolean used = false;
    private boolean star;
    private int power;
    protected MapNode source;
    protected MapNode target;


    public Order( String imgName, boolean star, int power) {
        super(125, 0, 80, 80, imgName);
        if(star) this.setImgName(this.getImgName()+"Star");
        this.star=star;
        this.power=power;
    }

    @Override
    public abstract void executeOnClient(IClientController controller, Game game);

    @Override
    public abstract void executeOnServer(Game game, ISocketManager socketManager);

    public MapNode getSource() {
        return source;
    }

    public void setSource(MapNode source) {
        this.source = source;
    }

    public MapNode getTarget() {
        return target;
    }

    public void setTarget(MapNode target) {
        this.target = target;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    public boolean isStar() {
        return star;
    }

    public boolean isAvailable() {
        return available;
    }

    public OrderType getOrderType() {
        return orderType;
    }
}
