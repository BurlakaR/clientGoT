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

    EventHandler nodeEnter, nodeExit, nodeClicked, nodeAnotherClicked;

    public HandlerBuilder(ModelViewBinding modelViewBinding, Group root){
        this.modelViewBinding=modelViewBinding;
        this.root=root;


        for(int i =0; i<GameWindowController.getInstanceView().getViewMap().size(); i++){
            ImageView buf =GameWindowController.getInstanceView().getViewMap().getNodeView(i).getNodeImage();
            if(modelViewBinding.getNode(buf).isAble())buf.setEffect(Colors.getColor(modelViewBinding.getNode(buf).getOwner()));

        }

        nodeEnter=new EventHandler<MouseEvent>()  {
            @Override
            public void handle(MouseEvent event) {
                ImageView source =(ImageView)event.getSource();
                Player owner = modelViewBinding.getNode(source).getOwner();
                if(owner!=null)
                source.setEffect(Colors.setBright(Colors.getColor(owner)));

            }
        };

        nodeExit=new EventHandler<MouseEvent>()  {
            @Override
            public void handle(MouseEvent event) {
                ImageView source =(ImageView)event.getSource();
                Player owner = modelViewBinding.getNode(source).getOwner();
                if(owner!=null)
                source.setEffect(Colors.setUsual(Colors.getColor(owner)));

            }
        };

        nodeClicked=new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                ImageView source =(ImageView)event.getSource();
                source.setOnMouseEntered(null);
                source.setOnMouseExited(null);
                source.setOnMouseClicked(nodeAnotherClicked);
                root.getChildren().remove(GameWindowController.getInstanceView().getViewMap().getNodeView(source).getNodePane().getCoin());
                root.getChildren().addAll(GameWindowController.getInstanceView().getViewMap().getNodeView(source).getNodePane().getUnits());
            }
        };

        nodeAnotherClicked=new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                ImageView source =(ImageView)event.getSource();
                source.setOnMouseEntered(nodeEnter);
                source.setOnMouseExited(nodeExit);
                source.setOnMouseClicked(nodeClicked);
                root.getChildren().removeAll(GameWindowController.getInstanceView().getViewMap().getNodeView(source).getNodePane().getUnits());
                root.getChildren().add(GameWindowController.getInstanceView().getViewMap().getNodeView(source).getNodePane().getCoin());
            }
        };
    }


}
