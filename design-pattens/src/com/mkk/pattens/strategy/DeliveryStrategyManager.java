package com.mkk.pattens.strategy;

import com.mkk.pattens.strategy.strategies.InternalCargoStrategy;
import com.mkk.pattens.strategy.strategies.ParcelExternalStrategy;
import com.mkk.pattens.strategy.strategies.ShipExternalStrategy;

public class DeliveryStrategyManager {
    public void scanOrder(IOrder order) {
        switch (order.getShippingCountry()) {
            case "Internal":
                order.setCargo(new InternalCargoStrategy());
                break;
            case "External":
                switch (order.getShippingMethod()) {
                    case "Parcel":
                        order.setCargo(new ParcelExternalStrategy());
                        break;
                    case "Ship":
                        order.setCargo(new ShipExternalStrategy());
                        break;
                }
                break;
        }
    }
}
