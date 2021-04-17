package com.gildedrose.strategy;

import com.gildedrose.Item;

public class RegularDefaultStrategy extends RegularStrategy {
    @Override
    public void updateQuality(Item item) {
        item.quality = item.quality >= (DEFAULT_QUALITY_DECREASE) ? item.quality - DEFAULT_QUALITY_DECREASE : 0;
    }

    public void updateSellIn(Item item) {
        item.sellIn -= DEFAULT_SELLIN_DECREASE;
    }
}
