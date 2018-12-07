package com.common.model.Orders;

import com.common.ClientController;
import com.common.Game;
import com.common.model.Map.MapNodes.MapNode;
import com.common.model.utils.ForImage;

public abstract class Order extends ForImage {
    protected boolean available;
    protected boolean used = false;
    protected boolean star;
    protected int power;
    protected MapNode source;
    protected MapNode target;

    public Order( String imgName, boolean star, int power) {
        super(125, 0, 80, 80, imgName);
        if(star) this.setImgName(this.getImgName()+"Star");
        this.star=star;
        this.power=power;
    }

    @Override
    public void executeOnClient(ClientController controller, Game game){
        setUsed(true);
    }

    @Override
    public void executeOnServer(Game game){
        setUsed(true);
    }

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
}
