package com.client.ui;

import com.client.communication.SocketManager;
import com.common.IntegerMessage;
import com.common.model.Game;
import com.common.model.Nodes.NodeMap;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.ScrollPane;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;


public class GameWindowController {

    View view;
    ControllerViewMap controllerViewMap;
    Game game;

    @FXML
    Group imageGroup;

    @FXML
    ScrollPane scrollPane;

    Pane pane;

    SocketManager socketManager;

    public void setSocketManager(SocketManager socketManager) {
        this.socketManager = socketManager;
        start();
    }



    public void start(){
        //Look at FirstWindowController
        //Next 2 Strings comment for work without server
        //int player=((IntegerMessage) socketManager.receive()).getMessage();
        //game=(Game)socketManager.receive();

        //Next 2 Strings comment for work with server
        game=new Game();
        game.setNumberOfPlayers((short)3);

        view=new View(game, imageGroup);
        controllerViewMap= new ControllerViewMap(view,  imageGroup, scrollPane);
        controllerViewMap.ableAllNodes();
    }




}
