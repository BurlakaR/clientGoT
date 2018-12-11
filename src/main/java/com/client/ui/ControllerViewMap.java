package com.client.ui;

import com.client.ui.view.ViewNodeMap;
import com.common.model.Map.MapNodes.MapNode;
import com.common.model.Orders.EmptyOrder;
import com.common.model.Orders.Order;
import com.common.model.Orders.OrderType;
import javafx.scene.Group;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.ImageView;

import java.util.ArrayList;


public class ControllerViewMap {
    Group root;
    HandlerBuilder handlerBuilder;


    public ControllerViewMap(){
        this.root= GWC.getInstanceView().getRoot();
        this.handlerBuilder=new HandlerBuilder(root);
    }




    public void ableAllNodes(){
        for(int i=0; i<ControllerImplementation.getModelViewBinding().getNodeCount(); i++){
            if(GWC.getGameInstance().getMap().getNodes().get(i).getOwner()!=null)
            ableChoose(ControllerImplementation.getModelViewBinding().getNodeView(GWC.getGameInstance().getMap().getNodes().get(i)));
        }
    }

    public void disableAllNodes(){
        for(int i=0; i<ControllerImplementation.getModelViewBinding().getNodeCount(); i++){
            disableChoose(ControllerImplementation.getModelViewBinding().getNodeView(GWC.getGameInstance().getMap().getNodes().get(i)));
        }
    }

    public void disableOrders(ArrayList<MapNode> nodes){
        for (MapNode nod :
                nodes) {
            ImageView vn = ControllerImplementation.getModelViewBinding().getNodeView(nod);
            GWC.getInstanceView().getViewMap().getNodeView(vn).getNodePane().getOrder().setOnMouseClicked(null);
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
        img.setOnMouseEntered(handlerBuilder.getNodeEnter());
        img.setOnMouseExited(handlerBuilder.getNodeExit());
        img.setOnMouseClicked(handlerBuilder.getNodeClicked());
    }

    public void disableChoose(ImageView img){
        img.setOnMouseEntered(null);
        img.setOnMouseExited(null);
        img.setOnMouseClicked(null);
    }

    public void ableOrders(OrderType orderType){
        ImageView order;
        MapNode node;
        handlerBuilder.orderMake(orderType);
        for(int i=0;i<GWC.getInstanceView().getViewMap().size(); i++){
            node = ControllerImplementation.getModelViewBinding().getNode(GWC.getInstanceView().getViewMap().getNodeView(i).getNodeImage());
            if(node.getOrder().getOrderType()==orderType&&node.getOwner()==GWC.getGameInstance().getCurrentPlayer())
            GWC.getInstanceView().getViewMap().getNodeView(i).getNodePane().getOrder().setOnMouseClicked(handlerBuilder.getOrderClicked());
            else
            GWC.getInstanceView().getViewMap().getNodeView(i).getNodePane().getOrder().setEffect(Colors.setGray(new ColorAdjust()));
        }
    }


}
