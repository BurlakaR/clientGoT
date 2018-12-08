package com.client.ui;

import com.common.Game;
import com.common.Player;
import com.client.communication.*;
import javafx.fxml.FXML;
import javafx.scene.Group;


public class GameWindowController {
    private static Game INSTANCE;
    private static View INSTANCE_VIEW;
    private static ImageBuilder INSTANCE_IMG_BUILDER;
    private static ControllerImplementation INSTANCE_CONTROLLER;

    ControllerViewMap controllerViewMap;

    @FXML
    Group imageGroup;
    SocketManager socketManager;

    public static Game getGameInstance() {
        return INSTANCE;
    }

    public static View getInstanceView() {
        return INSTANCE_VIEW;
    }

    public static ImageBuilder getInstanceImgBuilder() {
        return INSTANCE_IMG_BUILDER;
    }

    public static void setINSTANCE(Game INSTANCE) {
        GameWindowController.INSTANCE = INSTANCE;
    }

    public void setSocketManager(SocketManager socketManager) {
        this.socketManager = socketManager;
        start();
    }

    public void start(){
        //Look at FirstWindowController
        //Next 2 Strings comment for work without server
        //Game game=(Game)socketManager.receive();
        //game.setCurrentPlayer(((Player) socketManager.receive()));
        //System.out.println(game.getCurrentPlayer().getName());
        //GameWindowController.INSTANCE = game;

        //Next 2 Strings comment for work with server
        INSTANCE=new Game();
        INSTANCE.setNumberOfPlayers((short)6);
        Colors.Colors(getGameInstance().getPlayers());


        INSTANCE_VIEW=new View(imageGroup);
        INSTANCE_IMG_BUILDER=new ImageBuilder();
        INSTANCE_CONTROLLER=new ControllerImplementation();

        INSTANCE.getMap().executeOnClient(INSTANCE_CONTROLLER, INSTANCE);
    }
}
