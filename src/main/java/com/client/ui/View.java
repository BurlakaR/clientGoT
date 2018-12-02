package com.client.ui;

import com.common.model.Game;
import com.common.model.Nodes.NodeMap;
import com.common.model.Orders.Order;
import com.common.model.utils.ForImage;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class View {
    ImageBuilder imageBuilder;
    Group root;

    Game game;

    ViewMap viewMap;

    OrderPane orderPane;



    public View(Game game, Group root){
        this.game=game;

        this.root=root;
        imageBuilder = new ImageBuilder();

        viewMap=new ViewMap(imageBuilder, root, this.game.getMap());
        orderPane = new OrderPane(this.game.getOrders(), imageBuilder);

    }


    public ViewMap getViewMap() {
        return viewMap;
    }

    public Parent getRoot() {
        return root;
    }

    public Pane getOrderPane() {
        return orderPane.getOrderPane();
    }

    public Pane getOrderPane(double x, double y){
        return orderPane.redisclocate(x, y);
    }
}
