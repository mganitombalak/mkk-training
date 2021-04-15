package com.mkk.pattens.strategy2;

public class Seat implements ISeat {
    private IPriceStrategy strategy;
    private String seatNumber;

    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public String getSeatNumber() {
        return seatNumber;
    }

    @Override
    public void setPriceStrategy(IPriceStrategy strategy) {
        this.strategy = strategy;
    }

    public double getPrice(){
        return this.strategy.calculate();
    }
}
