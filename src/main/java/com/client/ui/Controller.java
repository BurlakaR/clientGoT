package com.client.ui;

import com.client.model.SomeExample;
import javafx.event.ActionEvent;
import org.springframework.beans.factory.annotation.Autowired;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;



public class Controller {
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
        }
    }

    @FXML
    void createGameRoom(ActionEvent event) {
        if(ipserver.getText()!=null&&playernumber.getText()!=null) {
            e.setIp(ipserver.getText());
            e.createRoom(Integer.parseInt(playernumber.getText()));
        }
    }

}