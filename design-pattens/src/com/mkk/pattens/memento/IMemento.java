package com.mkk.pattens.memento;

public interface IMemento {
    void listen(IStatus object);
    void onChange(OrderState state);
}
