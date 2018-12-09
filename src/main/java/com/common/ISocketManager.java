package com.common;

import java.net.Socket;
import java.util.ArrayList;

public interface ISocketManager {
    void send(Message message, Socket client);

    Message receive(Socket client);

    void multipleSend(Message message, ArrayList<Socket> socketsClient);

    ArrayList<Message> mupltipleReceive(ArrayList<Socket> socketsClient);
}
