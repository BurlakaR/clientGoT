package com.client.ui;

import com.client.ui.view.ViewNodeMap;
import com.common.model.Map.MapNodes.MapNode;
import com.common.model.Orders.EmptyOrder;
import com.common.model.Orders.Order;
import com.common.model.Orders.OrderType;
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
            if(!(GWC.getGameInstance().getMap().getNodes().get(i).getOrder().getOrderType() == OrderType.OrderEmpty)){
                ViewNodeMap buf=GWC.getInstanceView().getViewMap().getNodeView(modelViewBinding.getNodeView(GWC.getGameInstance().getMap().getNodes().get(i)));
                buf.getNodePane().getOrder().toFront();
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
                buf.setOnMouseClicked(handlerBuilder.nodeClickedWithOrder);
                if(node.getOrder().getOrderType() == OrderType.OrderEmpty) {
                    root.getChildren().remove(viewNodeMap.getNodePane().getOrder());
                    order=GWC.getInstanceImgBuilder().createView(new EmptyOrder());
                    order.setLayoutX(viewNodeMap.getNodePane().getOrder().getLayoutX());
                    order.setLayoutY(viewNodeMap.getNodePane().getOrder().getLayoutY());
                    viewNodeMap.getNodePane().setOrder(order);
                    order.setOnMouseClicked(handlerBuilder.orderClicked);
                    root.getChildren().add(order);
                }
            }
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
