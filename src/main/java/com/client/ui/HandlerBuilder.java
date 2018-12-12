package com.client.ui;

import com.client.ui.view.ViewNodeMap;
import com.common.Player;
import com.common.Validator;
import com.common.model.Map.Map;
import com.common.model.Map.MapNodes.MapNode;
import com.common.model.Map.MapNodes.NodeType;
import com.common.model.Orders.Order;
import com.common.model.Orders.OrderRule;
import com.common.model.Orders.OrderType;
import com.common.model.Units.Squad;
import com.common.model.Units.Unit;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class HandlerBuilder {
    Group root;

    ArrayList<MapNode> nodes=new ArrayList<>();
    ImageView prevOrder;
    static OrderType orderType;

    public static OrderType getOrderType() {
        return orderType;
    }

    public static void setOrderType(OrderType orderType) {
        HandlerBuilder.orderType = orderType;
    }

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
                    source.setEffect(Colors.setBright(Colors.getColor(owner)));

            }
        };

        nodeExit=new EventHandler<MouseEvent>()  {
            @Override
            public void handle(MouseEvent event) {
                ImageView source =(ImageView)event.getSource();
                Player owner = ControllerImplementation.getModelViewBinding().getNode(source).getOwner();
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

    public void orderMake(OrderType orderType) {
        setOrderType(orderType);
        nodeEnter=new EventHandler<MouseEvent>()  {
            @Override
            public void handle(MouseEvent event) {
                ImageView source =(ImageView)event.getSource();
                ColorAdjust colorAdjust = (ColorAdjust) source.getEffect();
                source.setEffect(Colors.setBright(colorAdjust));

            }
        };

        nodeExit=new EventHandler<MouseEvent>()  {
            @Override
            public void handle(MouseEvent event) {
                ImageView source =(ImageView)event.getSource();
                ColorAdjust colorAdjust = (ColorAdjust) source.getEffect();
                source.setEffect(Colors.setUsual(colorAdjust));

            }
        };


        orderClicked = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                ControllerImplementation.getControllerViewMap().ableAllNodes();
                ControllerImplementation.getControllerViewMap().disableOrders(nodes);
                GWC.getInstanceView().setNoColorToNodes(GWC.getGameInstance().getMap().getNodes());
                if (prevOrder != null) {
                    prevOrder.setOnMouseClicked(orderClicked);
                }
                ImageView source = (ImageView) event.getSource();
                prevOrder = source;
                MapNode node = ControllerImplementation.getModelViewBinding().getNode(GWC.getInstanceView().getViewMap().getNodeViewByOrder(source).getNodeImage());
                Order order=ControllerImplementation.getModelViewBinding().getNode(GWC.getInstanceView().getViewMap().getNodeViewByOrder(source).getNodeImage()).getOrder();

                switch (getOrderType()) {
                    case OrderFire:
                        nodes = Validator.getNodesThatCouldBeFired(node);
                        break;
                    case OrderAttack:
                        nodes = Validator.getNodesForCrusade(node);
                        break;
                    case OrderRule:
                        nodes = Validator.getNodesAvailableForBuilding((OrderRule)order);
                        break;
                    default:
                        break;
                }
                GWC.getInstanceView().setGreyColorToNodes(GWC.getGameInstance().getMap().getNodes());
                ImageView vn;
                GWC.getInstanceView().setNoColorToNodes(nodes);
                for (MapNode nod :
                        nodes) {
                    if (nod.isAble()) {
                        vn = ControllerImplementation.getModelViewBinding().getNodeView(nod);

                            if(orderType!=OrderType.OrderRule)
                            GWC.getInstanceView().getViewMap().getNodeView(vn).getNodeImage().setOnMouseClicked(new EventHandler<MouseEvent>() {
                                @Override
                                public void handle(MouseEvent event) {
                                    ImageView target = (ImageView) event.getSource();
                                    node.getOrder().setTarget(ControllerImplementation.getModelViewBinding().getNode(target));
                                    Stage confirm = new Stage();
                                    Group group = new Group();
                                    Button Conf = new Button();
                                    Conf.setPrefHeight(40);
                                    Conf.setPrefWidth(170);
                                    Conf.setText("Confirm");

                                    Conf.setOnMouseClicked(new EventHandler<MouseEvent>() {
                                        @Override
                                        public void handle(MouseEvent event) {
                                            node.getOrder().setSource(node);
                                            //System.out.println(node.getOrder().getSource().getName() + node.getOrder().getTarget().getName());
                                            GWC.getInstanceSockets().send(node.getOrder());
                                            confirm.close();
                                            //GWC.getInstanceController().render(GWC.getGameInstance());
                                        }
                                    });
                                    group.getChildren().add(Conf);
                                    Scene conf = new Scene(group);
                                    confirm.setScene(conf);
                                    confirm.show();
                                }
                            });

                            else
                                GWC.getInstanceView().getViewMap().getNodeView(vn).getNodeImage().setOnMouseClicked(new EventHandler<MouseEvent>() {
                                    @Override
                                    public void handle(MouseEvent event) {
                                        ImageView imgNode = (ImageView)event.getSource();
                                        ViewNodeMap viewnode = GWC.getInstanceView().getViewMap().getNodeView(imgNode);
                                        MapNode node = ControllerImplementation.getModelViewBinding().getNode(imgNode);
                                        order.setTarget(node);
                                        ArrayList<Squad> squads = Validator.getSquadsPossibleToBuild((OrderRule)order);
                                        java.util.Map<Button, Squad> squadchoices = new HashMap<>();

                                        Stage squadwindow = new Stage();
                                        Group group = new Group();

                                        for (Squad sq:
                                             squads) {
                                            String s="";
                                            for (Unit u:
                                                 sq.getSquad()) {
                                                s+=u.getImgName()+" ";
                                            }
                                            Button b = new Button(); b.setText(s);
                                            b.setPrefHeight(40);b.setPrefWidth(170);
                                            b.setOnMouseClicked(new EventHandler<MouseEvent>() {
                                                @Override
                                                public void handle(MouseEvent event) {
                                                    //System.out.println(node.getOrder().getSource().getName() + node.getOrder().getTarget().getName());
                                                    //GWC.getInstanceSockets().send(node.getOrder());
                                                    ((OrderRule) order).addBuiltSquad(squadchoices.get(b));
                                                    squadwindow.close();
                                                }
                                            });
                                            group.getChildren().add(b);
                                        }
                                        Scene conf = new Scene(group);
                                        squadwindow.setScene(conf);
                                        squadwindow.show();
                                    }
                                });
                        }
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
