package com.mkk.pattens.strategy2;

public interface IBookingManager {
    double getTotalSeatCount();
    double getAvaliableSeatCount();
    void BookNow(ISeat seat);
}
