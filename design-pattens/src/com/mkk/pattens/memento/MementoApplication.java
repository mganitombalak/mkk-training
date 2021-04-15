package com.mkk.pattens.memento;

import java.util.Arrays;

public class MementoApplication {
    public static void main(String[] args) {
        StatusMemento sm = new StatusMemento();
        Order newOrder = new Order(sm);

        newOrder.setState(OrderState.Pending);
        System.out.println(newOrder.getState());

        newOrder.setState(OrderState.PreAuthorized);
        System.out.println(newOrder.getState());

        newOrder.setState(OrderState.Canceled);
        System.out.println(newOrder.getState());

        sm.Undo();
        System.out.println(newOrder.getState());
        sm.Redo();
        System.out.println(newOrder.getState());
    }
}
