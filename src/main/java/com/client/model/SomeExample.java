package com.client.model;

import com.client.communication.SocketManager;
import com.common.TestCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;

@Service
public class SomeExample {
    @Autowired
    SocketManager socketManager;



    @PostConstruct
    public void init() throws IOException {
        socketManager.connect();
        printer();
        socketManager.send(new TestCommand("Hello", "world"));
    }

    public void printer(){
        new Thread(()->{
            while(true){
                socketManager.receive().print();
            }
        }).start();
    }
}
