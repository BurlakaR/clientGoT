package com.client.ui;

import com.client.ui.view.ViewNodeMap;
import com.common.model.Map.MapNodes.MapNode;
import com.common.model.Orders.EmptyOrder;
import com.common.model.Orders.Order;
import com.common.model.Orders.OrderType;
import javafx.scene.Group;
import javafx.scene.image.ImageView;


public class ControllerViewMap {
    Group root;
    HandlerBuilder handlerBuilder;


    public ControllerViewMap(){
        this.root= GWC.getInstanceView().getRoot();
        this.handlerBuilder=new HandlerBuilder(root);
    }




    public void ableAllNodes(){
        handlerBuilder.standartHandlers();
        for(int i=0; i<ControllerImplementation.getModelViewBinding().getNodeCount(); i++){
            ableChoose(ControllerImplementation.getModelViewBinding().getNodeView(GWC.getGameInstance().getMap().getNodes().get(i)));
        }
    }

    public void disableAllNodes(){
        for(int i=0; i<ControllerImplementation.getModelViewBinding().getNodeCount(); i++){
            disableChoose(ControllerImplementation.getModelViewBinding().getNodeView(GWC.getGameInstance().getMap().getNodes().get(i)));
        }
    }

    public void switchForAll(){
        for(int i = 0; i< GWC.getGameInstance().getMap().getNodes().size(); i++){
            if(!(GWC.getGameInstance().getMap().getNodes().get(i).getOrder().getOrderType()==OrderType.OrderEmpty)){
                ViewNodeMap buf=GWC.getInstanceView().getViewMap().getNodeView(ControllerImplementation.getModelViewBinding().getNodeView(GWC.getGameInstance().getMap().getNodes().get(i)));
                buf.getNodePane().getOrder().toFront();
            }
        }
    }



    public void changeToOrders(){
        handlerBuilder.orderHandlers();
        MapNode node;
        GWC.getInstanceView().removeAllExceptNodes();
        for(int i=0; i<ControllerImplementation.getModelViewBinding().getNodeCount(); i++){
            node = GWC.getGameInstance().getMap().getNodes().get(i);
            if(node.getOwner()!=null&&node.getOwner().equals(GWC.getGameInstance().getCurrentPlayer())&&node.getSquad().size()>0){
                node.setOrder(new EmptyOrder());
            }
        }
        ControllerImplementation.getModelViewBinding().rerender();
        GWC.getInstanceView().showNodesInfo();
        handlerBuilder.orderHandlers();
        for(int i=0;i<GWC.getInstanceView().getViewMap().size(); i++){
            GWC.getInstanceView().getViewMap().getNodeView(i).getNodePane().getOrder().setOnMouseClicked(handlerBuilder.getOrderClicked());
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
