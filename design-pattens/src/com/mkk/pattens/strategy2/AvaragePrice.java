package com.mkk.pattens.strategy2;

public class AvaragePrice extends BasePrice implements IPriceStrategy {
    @Override
    public double calculate() {
        return this.getValue() * 1.5;
    }
}
