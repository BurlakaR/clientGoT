package com.client.ui;

import javafx.scene.Group;
import javafx.scene.image.ImageView;


public class ControllerViewMap {
    ModelViewBinding modelViewBinding;
    Group root;
    HandlerBuilder handlerBuilder;


    public ControllerViewMap(ModelViewBinding modelViewBinding){
        this.modelViewBinding=modelViewBinding;
        this.root=GameWindowController.getInstanceView().getRoot();
        this.handlerBuilder=new HandlerBuilder(modelViewBinding, root);
        ableAllNodes();

    }


    public void ableAllNodes(){
        for(int i=0; i<modelViewBinding.getNodeCount(); i++){
            ableChoose(modelViewBinding.getNodeView(GameWindowController.getGameInstance().getMap().getNodes().get(i)));
        }
    }

    public void disableAllNodes(){
        for(int i=0; i<modelViewBinding.getNodeCount(); i++){
            disableChoose(modelViewBinding.getNodeView(GameWindowController.getGameInstance().getMap().getNodes().get(i)));
        }
    }



    public void ableChoose(ImageView img){
        img.setOnMouseEntered(handlerBuilder.nodeEnter);
        img.setOnMouseExited(handlerBuilder.nodeExit);
        img.setOnMouseClicked(handlerBuilder.nodeClicked);
    }

    public void disableChoose(ImageView img){
        img.setOnMouseEntered(null);
        img.setOnMouseExited(null);
        img.setOnMouseClicked(null);
    }
}
