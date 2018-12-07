package com.client.ui;

import com.common.Player;
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
    Colors colors;

    EventHandler nodeEnter, nodeExit, nodeClicked, nodeAnotherClicked;

    public HandlerBuilder(ModelViewBinding modelViewBinding, Group root){
        this.modelViewBinding=modelViewBinding;
        this.root=root;
        colors = new Colors(this.modelViewBinding.game.getPlayers());

        for(int i =0; i<modelViewBinding.view.getViewMap().size(); i++){
            ImageView buf =modelViewBinding.view.getViewMap().getNodeView(i).getNodeImage();
            buf.setEffect(colors.getColor(modelViewBinding.getNode(buf).getOwner()));
        }

        nodeEnter=new EventHandler<MouseEvent>()  {
            @Override
            public void handle(MouseEvent event) {
                ImageView source =(ImageView)event.getSource();
                Player owner = modelViewBinding.getNode(source).getOwner();
                if(owner!=null)
                source.setEffect(colors.setBright(colors.getColor(owner)));

            }
        };

        nodeExit=new EventHandler<MouseEvent>()  {
            @Override
            public void handle(MouseEvent event) {
                ImageView source =(ImageView)event.getSource();
                Player owner = modelViewBinding.getNode(source).getOwner();
                if(owner!=null)
                source.setEffect(colors.setUsual(colors.getColor(owner)));

            }
        };

        nodeClicked=new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                ImageView source =(ImageView)event.getSource();
                source.setOnMouseEntered(null);
                source.setOnMouseExited(null);
                source.setOnMouseClicked(nodeAnotherClicked);
                root.getChildren().remove(modelViewBinding.view.getViewMap().getNodeView(source).getNodePane().getCoin());
                root.getChildren().addAll(modelViewBinding.view.getViewMap().getNodeView(source).getNodePane().getUnits());
            }
        };

        nodeAnotherClicked=new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                ImageView source =(ImageView)event.getSource();
                source.setOnMouseEntered(nodeEnter);
                source.setOnMouseExited(nodeExit);
                source.setOnMouseClicked(nodeClicked);
                root.getChildren().removeAll(modelViewBinding.view.getViewMap().getNodeView(source).getNodePane().getUnits());
                root.getChildren().add(modelViewBinding.view.getViewMap().getNodeView(source).getNodePane().getCoin());
            }
        };
    }


}
