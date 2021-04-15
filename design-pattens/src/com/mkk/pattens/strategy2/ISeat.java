package com.mkk.pattens.strategy2;

public interface ISeat {
    String getSeatNumber();
    void setPriceStrategy(IPriceStrategy strategy);
    double getPrice();
}
