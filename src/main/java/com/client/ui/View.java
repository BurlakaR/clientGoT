package com.client.ui;

import com.common.model.Game;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;

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
