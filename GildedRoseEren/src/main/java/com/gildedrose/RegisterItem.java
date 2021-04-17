package com.gildedrose;

import com.gildedrose.enhanceditems.IEnhancedItem;
import com.gildedrose.enhanceditems.EnhancedItem;
import com.gildedrose.strategy.RegularBackstageStrategy;
import com.gildedrose.strategy.RegularDefaultStrategy;

import java.util.ArrayList;
import java.util.List;

public class RegisterItem {

    private static List<IEnhancedItem> enhancedItems;

    public static Item createItem(ItemTypeEnum itemType, ItemCategoryEnum itemCategoryEnum, String itemName, int sellIn, int quality) {
        Item item = new Item(itemType.toString() + " " + itemCategoryEnum.toString() + " " + itemName, sellIn, quality);
        switch (itemCategoryEnum){
            case DEFAULT:
                enhancedItems.add(new EnhancedItem().setItemIndex(enhancedItems.size()).setUpdateStrategy(new RegularDefaultStrategy()));
                break;
            case BACKSTAGE_PASSES:
                enhancedItems.add(new EnhancedItem().setItemIndex(enhancedItems.size()).setUpdateStrategy(new RegularBackstageStrategy()));
                break;
        }
        return item;
    }

    public static void initialize(){
        enhancedItems = new ArrayList<>();
    }

    public static List<IEnhancedItem> getEnhancedItems(){
        return enhancedItems;
    }
}
