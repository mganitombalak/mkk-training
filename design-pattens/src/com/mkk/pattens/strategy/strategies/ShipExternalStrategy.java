package com.mkk.pattens.strategy.strategies;

public class ShipExternalStrategy extends ExtenalCargoStrategy{

    @Override
    public void deliver() {
        super.deliver();
        System.out.print(" and will be delivered by ship\n");
    }
}
