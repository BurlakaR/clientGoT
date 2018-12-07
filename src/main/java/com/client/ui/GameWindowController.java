package com.client.ui;

import com.common.Game;
import com.common.Player;
import com.client.communication.*;
import javafx.fxml.FXML;
import javafx.scene.Group;


public class GameWindowController {
    private static Game INSTANCE;

    ControllerViewMap controllerViewMap;

    @FXML
    Group imageGroup;
    SocketManager socketManager;

    public static Game getGameInstance() {
        return INSTANCE;
    }

    public void setSocketManager(SocketManager socketManager) {
        this.socketManager = socketManager;
        start();
    }

    public void start(){
        //Look at FirstWindowController
        //Next 2 Strings comment for work without server
        Game game=(Game)socketManager.receive();
        game.setCurrentPlayer(((Player) socketManager.receive()));
        System.out.println(game.getCurrentPlayer().getName());
        GameWindowController.INSTANCE = game;

        //Next 2 Strings comment for work with server
        //Game game=new Game();
        //game.setNumberOfPlayers((short)3);

        View view=new View(imageGroup);
        ImageBuilder imageBuilder=new ImageBuilder();
        ModelViewBinding modelViewBinding = new ModelViewBinding(game, view, imageBuilder);

        controllerViewMap= new ControllerViewMap(modelViewBinding);
        controllerViewMap.ableAllNodes();
    }
}
