package com.client.ui;

import com.client.communication.SocketManager;
import com.common.Game;
import com.common.model.Map.MapNodes.MapNode;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Pane;


public class GameWindowController {


    ControllerViewMap controllerViewMap;

    @FXML
    Group imageGroup;


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
        Game game=new Game();
        game.setNumberOfPlayers((short)3);

        View view=new View(imageGroup);
        ImageBuilder imageBuilder=new ImageBuilder();
        ModelViewBinding modelViewBinding = new ModelViewBinding(game, view, imageBuilder);

        controllerViewMap= new ControllerViewMap(modelViewBinding);
        controllerViewMap.ableAllNodes();
    }
}
