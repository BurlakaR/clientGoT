package com.client.model;

import com.client.communication.SocketManager;
import com.common.TestCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;

@Component
public class SomeExample {
    @Autowired
    SocketManager socketManager;

    @PostConstruct
    public void init(){

    }

    public void setIp(String ip){
        socketManager.setIp(ip);
    }

    public void createRoom(int numberplayer){
        socketManager.createGame(numberplayer);
    }

    public void connectRoom(int id){
        socketManager.connectGame(id);
    }


}
