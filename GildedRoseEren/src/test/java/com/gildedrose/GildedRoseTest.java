package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void decreaseQualityByOne() {
        RegisterItem.initialize();
        GildedRose.items = new Item[] { RegisterItem.createItem(ItemTypeEnum.REGULAR, ItemCategoryEnum.DEFAULT,"foo", 10, 100) };
        GildedRose.updateQuality();
        assertEquals(99, GildedRose.items[0].quality);
    }

    @Test
    void decreaseSellInByOne() {
        RegisterItem.initialize();
        GildedRose.items = new Item[] { RegisterItem.createItem(ItemTypeEnum.REGULAR, ItemCategoryEnum.DEFAULT,"foo", 10, 100) };
        GildedRose.updateQuality();
        assertEquals(9, GildedRose.items[0].sellIn);
    }

    @Test
    void decreaseQualityByOneTwice() {
        RegisterItem.initialize();
        GildedRose.items = new Item[] { RegisterItem.createItem(ItemTypeEnum.REGULAR, ItemCategoryEnum.DEFAULT,"foo", 10, 100) };
        GildedRose.updateQuality();
        GildedRose.updateQuality();
        assertEquals(98, GildedRose.items[0].quality);
    }

    @Test
    void decreaseQualityByTwoAfterSellInPassed() {
        RegisterItem.initialize();
        GildedRose.items = new Item[] { RegisterItem.createItem(ItemTypeEnum.REGULAR, ItemCategoryEnum.DEFAULT,"foo", -1, 100) };
        GildedRose.updateQuality();
        assertEquals(98, GildedRose.items[0].quality);
    }

    @Test
    void decreaseSellinAfterSellInPassed() {
        RegisterItem.initialize();
        GildedRose.items = new Item[] { RegisterItem.createItem(ItemTypeEnum.REGULAR, ItemCategoryEnum.DEFAULT,"foo", -1, 100) };
        GildedRose.updateQuality();
        assertEquals(-2, GildedRose.items[0].sellIn);
    }

    @Test
    void decreaseSellinWhenSellInZero() {
        RegisterItem.initialize();
        GildedRose.items = new Item[] { RegisterItem.createItem(ItemTypeEnum.REGULAR, ItemCategoryEnum.DEFAULT,"foo", -1, 100) };
        GildedRose.updateQuality();
        assertEquals(-2, GildedRose.items[0].sellIn);
    }

    @Test
    void negativeQualityValue() {
        RegisterItem.initialize();
        GildedRose.items = new Item[] { RegisterItem.createItem(ItemTypeEnum.REGULAR, ItemCategoryEnum.DEFAULT,"foo", 10, 0) };
        GildedRose.updateQuality();
        assertEquals(0, GildedRose.items[0].quality);
    }

    @Test
    void agedBrieQualityIncreases() {
        RegisterItem.initialize();
        GildedRose.items = new Item[] { RegisterItem.createItem(ItemTypeEnum.REGULAR, ItemCategoryEnum.AGED_BRIE,"Aged Brie", 10, 49) };
        GildedRose.updateQuality();
        assertEquals(50, GildedRose.items[0].quality);
    }

    @Test
    void backstagePassesQualityIncreases() {
        RegisterItem.initialize();
        GildedRose.items = new Item[] { RegisterItem.createItem(ItemTypeEnum.REGULAR, ItemCategoryEnum.BACKSTAGE_PASSES,"TAFKAL80ETC concert", 10, 49) };
        GildedRose.updateQuality();
        assertEquals(50, GildedRose.items[0].quality);
    }

    @Test
    void backstagePassesQualityIncreasesByTwo() {
        RegisterItem.initialize();
        GildedRose.items = new Item[] { RegisterItem.createItem(ItemTypeEnum.REGULAR, ItemCategoryEnum.BACKSTAGE_PASSES,"TAFKAL80ETC concert", 10, 20), new Item("Backstage passes to a TAFKAL80ETC concert", 6, 20) };
        GildedRose.updateQuality();
        assertEquals(22, GildedRose.items[0].quality);
        assertEquals(22, GildedRose.items[1].quality);
    }

    @Test
    void backstagePassesQualityIncreasesByThree() {
        RegisterItem.initialize();
        GildedRose.items = new Item[] { RegisterItem.createItem(ItemTypeEnum.REGULAR, ItemCategoryEnum.BACKSTAGE_PASSES,"TAFKAL80ETC concert", 5, 20), RegisterItem.createItem(ItemTypeEnum.REGULAR, ItemCategoryEnum.BACKSTAGE_PASSES,"TAFKAL80ETC concert", 1, 20) };
        GildedRose.updateQuality();
        assertEquals(23, GildedRose.items[0].quality);
        assertEquals(23, GildedRose.items[1].quality);
    }

    @Test
    void backstagePassesQualityDropsToZero() {
        RegisterItem.initialize();
        GildedRose.items = new Item[] { RegisterItem.createItem(ItemTypeEnum.REGULAR, ItemCategoryEnum.BACKSTAGE_PASSES,"TAFKAL80ETC concert", 0, 20) };
        GildedRose.updateQuality();
        assertEquals(0, GildedRose.items[0].quality);
    }

    @Test
    void agedBrieQualityCanNotExceed50() {
        RegisterItem.initialize();
        GildedRose.items = new Item[] { RegisterItem.createItem(ItemTypeEnum.REGULAR, ItemCategoryEnum.AGED_BRIE,"Aged Brie", 10, 50) };
        GildedRose.updateQuality();
        assertEquals(50, GildedRose.items[0].quality);
    }

    @Test
    void sulfurasQualityWontChange() {
        RegisterItem.initialize();
        GildedRose.items = new Item[] { RegisterItem.createItem(ItemTypeEnum.REGULAR, ItemCategoryEnum.SULFURAS,"Hand of Ragnaros", 10, 80) };
        GildedRose.updateQuality();
        assertEquals(80, GildedRose.items[0].quality);
    }

    @Test
    void sulfurasSellinWontChange() {
        RegisterItem.initialize();
        GildedRose.items = new Item[] { RegisterItem.createItem(ItemTypeEnum.REGULAR, ItemCategoryEnum.SULFURAS,"Hand of Ragnaros", 10, 80) };
        GildedRose.updateQuality();
        assertEquals(10, GildedRose.items[0].sellIn);
    }

}
