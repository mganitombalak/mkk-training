package com.gildedrose.strategy;

import com.gildedrose.Item;

public class RegularBackstageStrategy extends RegularStrategy {
    @Override
    public void updateQuality(Item item) {
        if(item.sellIn <= BACKSTAGE_SELLIN_VERY_CLOSE)
            item.quality += BACKSTAGE_QUALITY_VERY_CLOSE_INCREASE;
        else if(item.sellIn <= BACKSTAGE_SELLIN_CLOSE)
            item.quality += BACKSTAGE_QUALITY_CLOSE_INCREASE;
        item.quality = Math.min(item.quality, 50);
    }

    public void updateSellIn(Item item) {
        item.sellIn -= DEFAULT_SELLIN_DECREASE;
    }
}
