package com.client.ui;

import com.client.ui.view.ViewNodeMap;
import com.common.Player;
import com.common.model.Map.MapNodes.MapNode;
import com.common.model.Map.MapNodes.NodeType;
import com.common.model.Orders.Order;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class HandlerBuilder {
    Group root;

    EventHandler<MouseEvent> nodeEnter;
    EventHandler<MouseEvent> nodeExit;
    EventHandler<MouseEvent> nodeClicked;
    EventHandler<MouseEvent> nodeAnotherClicked;
    EventHandler<MouseEvent> orderClicked;

    public HandlerBuilder(Group root){
        this.root=root;

    }


    public void standartHandlers(){

        nodeEnter=new EventHandler<MouseEvent>()  {
            @Override
            public void handle(MouseEvent event) {
                ImageView source =(ImageView)event.getSource();
                Player owner = ControllerImplementation.getModelViewBinding().getNode(source).getOwner();
                if(owner!=null)
                    source.setEffect(Colors.setBright(Colors.getColor(owner)));

            }
        };

        nodeExit=new EventHandler<MouseEvent>()  {
            @Override
            public void handle(MouseEvent event) {
                ImageView source =(ImageView)event.getSource();
                Player owner = ControllerImplementation.getModelViewBinding().getNode(source).getOwner();
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
                root.getChildren().remove(GWC.getInstanceView().getViewMap().getNodeView(source).getNodePane().getOrder());
                root.getChildren().addAll(GWC.getInstanceView().getViewMap().getNodeView(source).getNodePane().getUnits());
            }
        };

        nodeAnotherClicked=new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                ImageView source =(ImageView)event.getSource();
                source.setOnMouseEntered(nodeEnter);
                source.setOnMouseExited(nodeExit);
                source.setOnMouseClicked(nodeClicked);
                root.getChildren().removeAll(GWC.getInstanceView().getViewMap().getNodeView(source).getNodePane().getUnits());
                root.getChildren().add(GWC.getInstanceView().getViewMap().getNodeView(source).getNodePane().getOrder());
            }
        };
    }

    public void orderHandlers(){
        Queue<Order> orders = new LinkedBlockingQueue<>();
        final int[] stars = {0};
        orders.addAll(GWC.getGameInstance().getOrders());




        orderClicked=new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if(event.getButton().equals(MouseButton.SECONDARY)){
                    Stage confirm = new Stage();
                    Group group = new Group();
                    Button Conf = new Button();
                    Conf.setPrefHeight(40); Conf.setPrefWidth(170);
                    Conf.setText("Confirm");
                    Conf.setOnMouseClicked(new EventHandler<MouseEvent>() {
                        @Override
                        public void handle(MouseEvent event) {
                            GWC.getInstanceSockets().send(GWC.getGameInstance().getMap());
                            GWC.getInstanceController().render(GWC.getGameInstance().getMap());
                            confirm.close();
                        }
                    });
                    group.getChildren().add(Conf);
                    Scene conf = new Scene(group);
                    confirm.setScene(conf);
                    confirm.show();
                }
                else{
                    ImageView source =(ImageView)event.getSource();
                    ViewNodeMap viewNodeMap = GWC.getInstanceView().getViewMap().getNodeViewByOrder(source);
                    MapNode mapNode = ControllerImplementation.getModelViewBinding().getNode(viewNodeMap.getNodeImage());
                    Order current = mapNode.getOrder();
                    if(!current.getImgName().equals("OrderEmpty")){
                        if(current.isStar()) stars[0]--;

                        current.setUsed(false);
                        orders.add(current);
                    }

                    do {

                        current = orders.poll();
                        if(current.isUsed()){
                            orders.add(current);
                            continue;
                        }
                        if (current.isStar()){
                            stars[0]++;
                            if(stars[0]>GWC.getGameInstance().getCurrentPlayer().getStarNumber()){
                                stars[0]--;
                                orders.add(current);
                                continue;
                            }
                        }
                        if(!(mapNode.getNodeType() == NodeType.Land) && current.getImgName().contains("Rule")){
                            if(current.isStar()) stars[0]--;
                            current.setUsed(false);
                            orders.add(current);
                            continue;
                        }
                        mapNode.setOrder(current);
                        current.setUsed(true);
                        break;
                    }while(true);



                    current.setX((int) source.getLayoutX()); current.setY((int) source.getLayoutY());
                    viewNodeMap.getNodePane().setOrder(GWC.getInstanceImgBuilder().createView(current));
                    root.getChildren().remove(source);
                    source= viewNodeMap.getNodePane().getOrder();
                    source.setOnMouseClicked(orderClicked);
                    root.getChildren().add(source);
                }

            }
        };
    }

    public EventHandler<MouseEvent> getNodeEnter() {
        return nodeEnter;
    }

    public EventHandler<MouseEvent> getNodeExit() {
        return nodeExit;
    }

    public EventHandler<MouseEvent> getNodeClicked() {
        return nodeClicked;
    }

    public EventHandler<MouseEvent> getNodeAnotherClicked() {
        return nodeAnotherClicked;
    }

    public EventHandler<MouseEvent> getOrderClicked() {
        return orderClicked;
    }
}
