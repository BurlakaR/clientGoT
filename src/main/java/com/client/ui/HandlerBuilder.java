package com.client.ui;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

import java.util.ArrayList;

public class HandlerBuilder {
    ModelViewBinding modelViewBinding;
    Group root;

    EventHandler nodeEnter, nodeExit, nodeClicked, nodeAnotherClicked;
    ColorAdjust bright, usual, curentNode;

    public HandlerBuilder(ModelViewBinding modelViewBinding, Group root){
        this.modelViewBinding=modelViewBinding;
        this.root=root;

        bright = new ColorAdjust(); usual= new ColorAdjust(); curentNode = new ColorAdjust();
        bright.setBrightness(0.3); usual.setBrightness(0.0);
        curentNode.setHue(0.7);

        nodeEnter=new EventHandler<MouseEvent>()  {
            @Override
            public void handle(MouseEvent event) {
                ImageView source =(ImageView)event.getSource();
                source.setEffect(bright);

            }
        };

        nodeExit=new EventHandler<MouseEvent>()  {
            @Override
            public void handle(MouseEvent event) {
                ImageView source =(ImageView)event.getSource();
                source.setEffect(usual);

            }
        };

        nodeClicked=new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                ImageView source =(ImageView)event.getSource();
                source.setOnMouseEntered(null);
                source.setOnMouseExited(null);
                source.setOnMouseClicked(nodeAnotherClicked);
                source.setEffect(curentNode);
                ArrayList<ImageView> pane= modelViewBinding.view.getViewMap().getNodeView(source).getNodePane();

                root.getChildren().addAll(pane);
            }
        };

        nodeAnotherClicked=new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                ImageView source =(ImageView)event.getSource();
                source.setOnMouseEntered(nodeEnter);
                source.setOnMouseExited(nodeExit);
                source.setOnMouseClicked(nodeClicked);
                source.setEffect(bright);
                root.getChildren().removeAll(modelViewBinding.view.getViewMap().getNodeView(source).getNodePane());
            }
        };
    }


}
