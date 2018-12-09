package com.client.ui;

import com.client.ui.view.View;
import com.common.Game;
import com.client.communication.*;
import com.common.Player;
import javafx.fxml.FXML;
import javafx.scene.Group;

import static java.lang.System.*;


public class GWC {
    private static Game INSTANCE;
    private static View INSTANCE_VIEW;
    private static ImageBuilder INSTANCE_IMG_BUILDER;
    private static Player.ControllerImplementation INSTANCE_CONTROLLER;
    private static SocketManager socketManager;


    @FXML
    Group imageGroup;


    public static Game getGameInstance() {
        return INSTANCE;
    }

    public static View getInstanceView() {
        return INSTANCE_VIEW;
    }

    public static ImageBuilder getInstanceImgBuilder() {
        return INSTANCE_IMG_BUILDER;
    }

    public static SocketManager getInstanceSockets(){ return socketManager;}

    public static Player.ControllerImplementation getInstanceController() {return INSTANCE_CONTROLLER;}

    public static void setINSTANCE(Game INSTANCE) {
        GWC.INSTANCE = INSTANCE;
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
        out.println(game.getCurrentPlayer().getName());
        GWC.INSTANCE = game;

        //Next 2 Strings comment for work with server
        //INSTANCE=new Game();
        //INSTANCE.setNumberOfPlayers((short)6);
        //Colors.Colors(getGameInstance().getPlayers());


        while(true){
            socketManager.receive().executeOnClient(getInstanceController(), getGameInstance());
        }


    }
}
