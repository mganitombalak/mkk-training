package com.mkk.pattens.memento;

public interface IStatus {

    OrderState getState();
    void setState(OrderState newState);
}
