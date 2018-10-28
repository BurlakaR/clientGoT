package com.client.model;

import com.client.communication.SocketManager;
import com.common.Message;
import com.common.Port;
import com.common.TestCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

@Service
public class SomeExample {
    @Autowired
    SocketManager socketManager;



    @PostConstruct
    public void init() throws IOException {
        socketManager.connect();
        printer();
        socketManager.send(new TestCommand("Hello", "world"));
        socketManager.send(new TestCommand("Bye", "world"));
        socketManager.send(new TestCommand("Something", "world"));
    }

    public void printer(){
        new Thread(()->{
            while(true){
                socketManager.receive().print();
            }
        }).start();
    }
}
