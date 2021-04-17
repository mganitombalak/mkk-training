package com.gildedrose.strategy;

import com.gildedrose.Item;

public abstract class RegularStrategy implements IQualityUpdateStrategy {

    protected static final int DEFAULT_QUALITY_DECREASE = 1;
    protected static final int DEFAULT_SELLIN_DECREASE = 1;
    protected static final int BACKSTAGE_QUALITY_VERY_CLOSE_INCREASE = 3;
    protected static final int BACKSTAGE_QUALITY_CLOSE_INCREASE = 2;
    protected static final int BACKSTAGE_SELLIN_CLOSE = 10;
    protected static final int BACKSTAGE_SELLIN_VERY_CLOSE = 5;
}
