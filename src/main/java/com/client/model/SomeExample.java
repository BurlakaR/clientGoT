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
    public void init() throws IOException {
        socketManager.createGame(3);
        //socketManager.connectGame(1);
        //TestCommand buf = (TestCommand)socketManager.receive();
        //System.out.println(buf);
    }


}
