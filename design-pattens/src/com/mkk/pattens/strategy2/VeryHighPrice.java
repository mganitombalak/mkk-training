package com.mkk.pattens.strategy2;

public class VeryHighPrice extends BasePrice implements IPriceStrategy {
    @Override
    public double calculate() {
        return this.getValue() * 4;
    }
}
