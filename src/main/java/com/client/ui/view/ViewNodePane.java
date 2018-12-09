package com.client.ui.view;

import javafx.scene.image.ImageView;

import java.util.ArrayList;

public class ViewNodePane {
    ArrayList<ImageView> units=new ArrayList<>();
    ImageView order;


    public ArrayList<ImageView> getUnits() {
        return units;
    }

    public void setUnits(ArrayList<ImageView> units) {
        this.units = units;
    }

    public ImageView getOrder() {
        return order;
    }

    public void setOrder(ImageView order) {
        this.order = order;
    }
}
