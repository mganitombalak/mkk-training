package com.mkk.pattens.strategy2;

public class BookingManager implements IBookingManager {
    private double totalSeatCount;
    private double avaliableSeatCount;

    public BookingManager(double totalSeatCount) {
        this.totalSeatCount = totalSeatCount;
        this.avaliableSeatCount=totalSeatCount;
    }

    @Override
    public double getTotalSeatCount() {
        return totalSeatCount;
    }

    @Override
    public double getAvaliableSeatCount() {
        return avaliableSeatCount;
    }

    @Override
    public void BookNow(ISeat seat) {
        avaliableSeatCount -= 1;
        System.out.println(seat.getSeatNumber()+ " has been booked.");
    }
}
