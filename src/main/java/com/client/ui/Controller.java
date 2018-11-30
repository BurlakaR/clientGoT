package com.client.ui;

import com.client.model.Map;
import com.client.model.Nodes.NodeMap;
import com.client.model.SomeExample;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;


public class Controller {
    Stage stage;
    Scene game;
    Map map;


    Group imageGroup;

    @Autowired
    SomeExample e;

    @FXML
    private TextField ipserver;

    @FXML
    private TextField roomnumber;

    @FXML
    private TextField playernumber;

    @FXML
    void connectGameRoom(ActionEvent event) {
        if(ipserver.getText()!=null&&roomnumber.getText()!=null) {
            e.setIp(ipserver.getText());
            e.connectRoom(Integer.parseInt(roomnumber.getText()));
            startGame(event);
        }
    }

    @FXML
    void createGameRoom(ActionEvent event) {
        if(ipserver.getText()!=null&&playernumber.getText()!=null) {
            e.setIp(ipserver.getText());
            e.createRoom(Integer.parseInt(playernumber.getText()));
            startGame(event);
        }
    }

    public void startGame(ActionEvent event){
        try {
            Parent p = FXMLLoader.load(getClass().getResource("/fxml/game.fxml"));
            imageGroup=(Group)p.lookup("#imageGroup");
            game=new Scene(p);
            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            stage.setScene(game);
            stage.show();
        } catch (IOException e1) {
            e1.printStackTrace();
        }


    }

}