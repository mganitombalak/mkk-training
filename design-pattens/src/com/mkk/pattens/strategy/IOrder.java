package com.mkk.pattens.strategy;

public interface IOrder {
    String getShippingCountry();
    String getShippingMethod();
    void setCargo(IDeliveryStrategy cargo);
    void deliver();
}
