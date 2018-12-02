package com.common.model.Orders;

public class OrderAtack extends Order {
    public OrderAtack(boolean star, int power) {
        super("OrderAtack", star, power);
        if(power<0) this.setImgName(this.getImgName()+"1");
        else if(power==0) this.setImgName(this.getImgName()+"2");
    }
}
