package com.mkk.pattens.observer;

public interface IMessageCenter {
    void connect(IClient client);
    void disConnect(IClient client);
    void publishMessage(int id,String message);
}
