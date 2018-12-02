package com.client.ui;

import com.common.model.Orders.Order;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

import java.util.ArrayList;

public class OrderPane {
    ImageBuilder imageBuilder;


    Pane orderPane;
    ImageView display;
    int indexImg;
    BiMap<Order, ImageView> orderPaneMap;

    public OrderPane(ArrayList<Order> orders, ImageBuilder imageBuilder){
        this.imageBuilder=imageBuilder;
        orderPaneMap = HashBiMap.create();

        orderPane=new Pane();
        orderPane.setPrefHeight(104);
        orderPane.setPrefWidth(156);
        for (Order o:
                orders) {
            orderPaneMap.put(o, imageBuilder.createView(o));
        }


        indexImg=0;
        display = new ImageView(((ImageView)orderPaneMap.values().toArray()[indexImg]).getImage());
        display.setLayoutX(44);
        display.setLayoutY(11);
        display.setFitHeight(80);
        display.setFitWidth(80);
        display.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

            }
        });

        Button left = new Button();
        left.setText("<");
        left.setLayoutX(18);
        left.setLayoutY(35);
        left.setPrefHeight(29);
        left.setPrefWidth(8);
        left.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if(indexImg>0) indexImg--;
                display.setImage(((ImageView)orderPaneMap.values().toArray()[indexImg]).getImage());
            }
        });

        Button right = new Button();
        right.setText(">");
        right.setLayoutX(122);
        right.setLayoutY(35);
        right.setPrefHeight(29);
        right.setPrefWidth(8);
        right.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if(indexImg<orderPaneMap.size()-1) indexImg++;
                display.setImage(((ImageView)orderPaneMap.values().toArray()[indexImg]).getImage());
            }
        });


        orderPane.getChildren().add(display);
        orderPane.getChildren().add(left);
        orderPane.getChildren().add(right);
    }

    public Pane getOrderPane() {
        return orderPane;
    }

    public Pane redisclocate(double x, double y){
        orderPane.setLayoutX(x);
        orderPane.setLayoutY(y);
        return orderPane;
    }
}
