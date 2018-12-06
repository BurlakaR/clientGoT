package com.client.ui;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

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
                Pane pane = modelViewBinding.view.getViewMap().getNodeView(source).getNodePane();
                pane.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        Pane sourcep =(Pane)(event.getSource());
                        ImageView sourcei = modelViewBinding.view.getViewMap().getNodeView(sourcep).getNodeImage();
                        sourcei.setOnMouseEntered(nodeEnter);
                        sourcei.setOnMouseExited(nodeExit);
                        sourcei.setOnMouseClicked(nodeClicked);
                        sourcei.setEffect(bright);
                        root.getChildren().remove(sourcep);

                    }
                });
                root.getChildren().add(pane);
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
                root.getChildren().remove(modelViewBinding.view.getViewMap().getNodeView(source).getNodePane());
            }
        };
    }


}
