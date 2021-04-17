package com.gildedrose.enhanceditems;

import com.gildedrose.GildedRose;
import com.gildedrose.strategy.IQualityUpdateStrategy;

public class EnhancedItem implements IEnhancedItem {
    private IQualityUpdateStrategy updateStrategy;
    private int itemIndex;

    @Override
    public EnhancedItem setUpdateStrategy(IQualityUpdateStrategy updateStrategy) {
        this.updateStrategy = updateStrategy;
        return this;
    }

    @Override
    public EnhancedItem setItemIndex(int index) {
        this.itemIndex = index;
        return this;
    }

    @Override
    public void calculateSellIn() {
        this.updateStrategy.updateSellIn(GildedRose.getItem(itemIndex));
    }

    @Override
    public void calculateQuality() {
        this.updateStrategy.updateQuality(GildedRose.getItem(itemIndex));
    }

    @Override
    public void calculateQualityAndSellIn() {
        calculateSellIn();
        calculateQuality();
    }
}
