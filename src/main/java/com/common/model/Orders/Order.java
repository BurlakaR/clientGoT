package com.common.model.Orders;

import com.common.model.utils.ForImage;

public abstract class Order extends ForImage {
    boolean available;
    boolean star;
    int power;

    public Order( String imgName, boolean star, int power) {
        super(125, 0, 80, 80, imgName);
        if(star) this.setImgName(this.getImgName()+"Star");
        this.star=star;
        this.power=power;
    }
}
