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

    Queue<Message> messagesReceive=new LinkedBlockingQueue<>();
    Queue<Message> messagesSend=new LinkedBlockingQueue<>();

    @PostConstruct
    public void init() throws IOException {
        socketManager.setMessages(messagesReceive, messagesSend);
        socketManager.connect();
        printer();
        messagesSend.add(new TestCommand("Hello", "world"));
        messagesSend.add(new TestCommand("Bye", "world"));
        messagesSend.add(new TestCommand("Something", "world"));
    }

    public void printer(){
        new Thread(()->{
            while(true){
                if(!messagesReceive.isEmpty()) messagesReceive.poll().print();
            }
        }).start();
    }
}
