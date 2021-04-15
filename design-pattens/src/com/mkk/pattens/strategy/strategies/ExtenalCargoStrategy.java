package com.mkk.pattens.strategy.strategies;

import com.mkk.pattens.strategy.IDeliveryStrategy;

public class ExtenalCargoStrategy implements IDeliveryStrategy {
    @Override
    public void deliver() {
        System.out.println("Order has been marked as External Cargo");
    }
}
