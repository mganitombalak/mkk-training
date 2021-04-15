package com.mkk.pattens.strategy2;

public class LowPrice extends BasePrice implements IPriceStrategy {
    @Override
    public double calculate() {
        return this.getValue() * 1.1;
    }
}
