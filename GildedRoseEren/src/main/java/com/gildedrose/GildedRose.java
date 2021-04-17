package com.gildedrose;


import com.gildedrose.enhanceditems.IEnhancedItem;

public class GildedRose {
    static Item[] items;


    public static void updateQuality() {
        RegisterItem.getEnhancedItems().forEach(IEnhancedItem::calculateQualityAndSellIn);
    }

    public static Item getItem(int index) {
        return items[index];
    }
}