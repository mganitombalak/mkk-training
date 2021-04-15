package com.mkk.pattens.strategy.strategies;

import com.mkk.pattens.strategy.IDeliveryStrategy;

public class InternalCargoStrategy implements IDeliveryStrategy {
    @Override
    public void deliver() {
        System.out.println("Order has been marked as Internal Cargo and will be delivered by truck");
    }
}
