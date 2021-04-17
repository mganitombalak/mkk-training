package com.gildedrose.strategy;

import com.gildedrose.Item;

public interface IQualityUpdateStrategy {
    public void updateQuality(Item item);

    public void updateSellIn(Item item);
}
