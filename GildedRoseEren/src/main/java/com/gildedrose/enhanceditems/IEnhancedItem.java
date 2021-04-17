package com.gildedrose.enhanceditems;

import com.gildedrose.strategy.IQualityUpdateStrategy;

public interface IEnhancedItem {

    public IEnhancedItem setUpdateStrategy(IQualityUpdateStrategy updateStrategy);

    public IEnhancedItem setItemIndex(int index);

    public void calculateSellIn();

    public void calculateQuality();

    public void calculateQualityAndSellIn();
}
