package com.client.ui;

import com.client.ui.view.ViewNodeMap;
import com.common.model.Map.MapNodes.MapNode;
import javafx.scene.Group;
import javafx.scene.image.ImageView;


public class ControllerViewMap {
    static ModelViewBinding modelViewBinding;
    static public ModelViewBinding getModelViewBinding(){return modelViewBinding;}
    Group root;
    HandlerBuilder handlerBuilder;


    public ControllerViewMap(ModelViewBinding modelViewBinding){
        this.modelViewBinding=modelViewBinding;
        this.root= GWC.getInstanceView().getRoot();
        this.handlerBuilder=new HandlerBuilder(modelViewBinding, root);

    }


    public void ableAllNodes(){
        handlerBuilder.standartHandlers();
        for(int i=0; i<modelViewBinding.getNodeCount(); i++){
            ableChoose(modelViewBinding.getNodeView(GWC.getGameInstance().getMap().getNodes().get(i)));
        }
    }

    public void disableAllNodes(){
        for(int i=0; i<modelViewBinding.getNodeCount(); i++){
            disableChoose(modelViewBinding.getNodeView(GWC.getGameInstance().getMap().getNodes().get(i)));
        }
    }

    public void switchForAll(){
        for(int i = 0; i< GWC.getGameInstance().getMap().getNodes().size(); i++){
            if(!GWC.getGameInstance().getMap().getNodes().get(i).getOrder().orderIsEmpty()){
                ViewNodeMap buf=GWC.getInstanceView().getViewMap().getNodeView(modelViewBinding.getNodeView(GWC.getGameInstance().getMap().getNodes().get(i)));
                switchToOrder(buf);
            }
        }
    }



    public void changeToOrders(){
        handlerBuilder.orderHandlers();
        ImageView buf, order;
        MapNode node;
        ViewNodeMap viewNodeMap;
        for(int i=0; i<modelViewBinding.getNodeCount(); i++){
            buf=modelViewBinding.getNodeView(GWC.getGameInstance().getMap().getNodes().get(i));
            node = modelViewBinding.getNode(buf);
            viewNodeMap = GWC.getInstanceView().getViewMap().getNodeView(buf);
            if(node.getOwner()!=null&&node.getOwner().equals(GWC.getGameInstance().getCurrentPlayer())&&node.getSquad().size()>0){
                buf.setOnMouseClicked(handlerBuilder.nodeClicked);
                root.getChildren().remove(viewNodeMap.getNodePane().getCoin());
                order = viewNodeMap.getNodePane().getOrder();
                order.setLayoutX(viewNodeMap.getNodePane().getCoin().getLayoutX());
                order.setOnMouseClicked(handlerBuilder.orderClicked);
                root.getChildren().add(order);
            }
        }
    }

    private void switchToOrder(ViewNodeMap viewNodeMap){
        ImageView order;
        root.getChildren().remove(viewNodeMap.getNodePane().getCoin());
        order = viewNodeMap.getNodePane().getOrder();
        order.setLayoutX(viewNodeMap.getNodePane().getCoin().getLayoutX());
        order.setOnMouseClicked(handlerBuilder.orderClicked);
        root.getChildren().add(order);
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
