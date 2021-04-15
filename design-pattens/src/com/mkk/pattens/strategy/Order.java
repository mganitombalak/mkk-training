package com.mkk.pattens.strategy;

public class Order implements IOrder{

    private String shippingCountry;
    private String shippingMethod;
    private IDeliveryStrategy cargo;

    public Order(String shippingCountry, String shippingMethod) {
        this.shippingCountry = shippingCountry;
        this.shippingMethod = shippingMethod;
    }

    @Override
    public String getShippingCountry() {
        return shippingCountry;
    }

    @Override
    public String getShippingMethod() {
        return shippingMethod;
    }

    @Override
    public void deliver() {
        this.cargo.deliver();
    }

    @Override
    public void setCargo(IDeliveryStrategy cargo) {
        this.cargo=cargo;
    }
}
