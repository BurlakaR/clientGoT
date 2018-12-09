package com.client.ui;

import com.client.communication.SocketManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;


public class FirstWindowController {
    Stage stage;
    Scene game;//nice naming, bro)


    @Autowired
    SocketManager socketManager;

    @FXML
    private TextField ipserver;

    @FXML
    private TextField roomnumber;

    @FXML
    private TextField playernumber;

    @FXML
    void connectGameRoom(ActionEvent event) {
        if(ipserver.getText()!=null&&roomnumber.getText()!=null) {
            //Look at GWC
            //Next 2 Strings comment to work without server using ConnectButton
            socketManager.setIp(ipserver.getText());
            socketManager.connectGame(Integer.parseInt(roomnumber.getText()));
            startGame(event);
        }
    }

    @FXML
    void createGameRoom(ActionEvent event) {
        if(ipserver.getText()!=null&&playernumber.getText()!=null) {
            socketManager.setIp(ipserver.getText());
            socketManager.createGame(Integer.parseInt(playernumber.getText()));
            startGame(event);
        }
    }

    public void startGame(ActionEvent event){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/game.fxml"));
            Parent p = fxmlLoader.load();
            GWC gameController = fxmlLoader.<GWC>getController();
            gameController.setSocketManager(socketManager);
            game=new Scene(p);
            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            stage.setScene(game);
            stage.show();
        } catch (IOException e1) {
            e1.printStackTrace();
        }


    }

}