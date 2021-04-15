package com.mkk.pattens.strategy.strategies;

public class ParcelExternalStrategy extends ExtenalCargoStrategy {

    @Override
    public void deliver() {
        super.deliver();
        System.out.print(" and will be delivered by parcel\n");
    }
}
