package com.mkk.pattens.strategy2;

import java.util.Arrays;
import java.util.List;

public class MKKAirwaysApplication {
    public static void main(String[] args) {
        BookingManager bm = new BookingManager(20d);
        PriceStrategyManager psm = new PriceStrategyManager(bm);
        List<ISeat> seats = Arrays.asList(
                new Seat("A1"),
                new Seat("A2"),
                new Seat("B1"),
                new Seat("B2"),
                new Seat("C1"),
                new Seat("C2"),
                new Seat("D1"),
                new Seat("D2"),
                new Seat("E1"),
                new Seat("E2"),
                new Seat("F1"),
                new Seat("F2"),
                new Seat("G1"),
                new Seat("G2"),
                new Seat("H1"),
                new Seat("H2"),
                new Seat("J1"),
                new Seat("J2"),
                new Seat("K1"),
                new Seat("K2")
        );

        seats.forEach(s->{
            psm.Identify(s);
            System.out.println(s.getSeatNumber() + ": $"+s.getPrice());
            bm.BookNow(s);
        });
    }
}
