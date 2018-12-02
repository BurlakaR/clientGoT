package com.client.ui;

import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.control.ScrollPane;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;


public class ControllerViewMap {
    View view;
    Group root;
    ScrollPane scrollPane;

    double deltaY;

    EventHandler nodeEnter, nodeExit, nodeClicked, nodeCLickedAnother;
    ColorAdjust bright, usual, curentNode;

    public ControllerViewMap(View view , Group root, ScrollPane scrollPane){
        this.scrollPane=scrollPane;
        this.view=view;
        this.root=root;
        deltaY=0;

        bright = new ColorAdjust(); usual= new ColorAdjust(); curentNode = new ColorAdjust();
        bright.setBrightness(0.3); usual.setBrightness(0.0);
        curentNode.setHue(1.0);

        root.setOnScroll(new EventHandler<ScrollEvent>() {
            @Override
            public void handle(ScrollEvent event) {
                deltaY+=event.getDeltaY();
                if(deltaY>0) deltaY=0;
                else if(deltaY<-2450) deltaY=-2450;
                System.out.println(deltaY);
            }
        });

        nodeEnter=new EventHandler<MouseEvent>()  {
            @Override
            public void handle(MouseEvent event) {

                ((ImageView)event.getSource()).setEffect(bright);
            }
        };

        nodeExit=new EventHandler<MouseEvent>()  {
            @Override
            public void handle(MouseEvent event) {

                ((ImageView)event.getSource()).setEffect(usual);
            }
        };

        nodeClicked=new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                disableAllNodes();

                ImageView img= (ImageView)event.getSource();
                img.setEffect(curentNode);
                img.setOnMouseClicked(nodeCLickedAnother);
                root.getChildren().add(view.getOrderPane(event.getSceneX(), event.getSceneY()-deltaY/1.8));


            }
        };
        nodeCLickedAnother=new EventHandler<MouseEvent>()  {
            @Override
            public void handle(MouseEvent event) {
                ableAllNodes();
                ImageView img= (ImageView)event.getSource();
                img.setEffect(usual);
                img.setOnMouseClicked(nodeClicked);
                root.getChildren().remove(view.getOrderPane());
            }
        };
    }


    public void ableAllNodes(){
        for(int i=0; i<view.getViewMap().mapView.size(); i++){
            ableChoose(view.getViewMap().getNodeViewAt(i));
        }
    }

    public void disableAllNodes(){
        for(int i=0; i<view.getViewMap().mapView.size(); i++){
            disableChoose(view.getViewMap().getNodeViewAt(i));
        }
    }



    public void ableChoose(ImageView img){
        img.setOnMouseEntered(nodeEnter);
        img.setOnMouseExited(nodeExit);
        img.setOnMouseClicked(nodeClicked);
    }

    public void disableChoose(ImageView img){
        img.setOnMouseEntered(null);
        img.setOnMouseExited(null);
        img.setOnMouseClicked(null);
    }
}
