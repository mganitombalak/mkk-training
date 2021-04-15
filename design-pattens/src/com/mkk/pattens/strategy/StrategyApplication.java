package com.mkk.pattens.strategy;

public class StrategyApplication {
    public static void main(String[] args) {
        Order o1 = new Order("Internal", "Parcel");
        Order o2 = new Order("External", "Parcel");
        Order o3 = new Order("External", "Ship");

        DeliveryStrategyManager dsm = new DeliveryStrategyManager();

        dsm.scanOrder(o1);
        dsm.scanOrder(o2);
        dsm.scanOrder(o3);

        o1.deliver();
        o2.deliver();
        o3.deliver();
    }
}
