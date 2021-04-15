package com.mkk.pattens.observer;

import java.net.Socket;

public class MessageClient implements IClient {

    private int id;
    private IMessageCenter messageCenter;

    public MessageClient(int id, IMessageCenter messageCenter) {
        this.id = id;
        this.messageCenter = messageCenter;
    }

    @Override
    public int getId() {
        return id;
    }

    public void connect() {
        messageCenter.connect(this);
    }

    public void disConnect() {
        messageCenter.disConnect(this);
    }

    public void sendMessage(String message) {
        messageCenter.publishMessage(this.id, message);
    }

    @Override
    public void onMessageReceived(String msg) {
        System.out.println("Client-" + this.getId() + " got message from server:" + msg);
    }
}
