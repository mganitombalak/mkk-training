package com.mkk.pattens.observer;

public interface IClient {
    int getId();
    void onMessageReceived(String msg);
}
