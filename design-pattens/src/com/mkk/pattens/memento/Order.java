package com.mkk.pattens.memento;

import java.util.Date;

public class Order implements IStatus{

    private int id;
    private Date orderDate;
    private OrderState state;
    private IMemento memento;

    public Order(IMemento memento) {
        this.memento = memento;
        this.memento.listen(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public OrderState getState() {
        return state;
    }

    public void setState(OrderState newState) {
        if(state!=newState) {
            this.state = newState;
            this.memento.onChange(newState);
        }
    }
}
