package com.gildedrose.quality;

import com.gildedrose.Item;

public class BackstagePassesEvaluationer extends ItemEvaluationer {

    public int qualityChange(Item item) {
        if(item.sellIn<11)
            return 2;
        if(item.sellIn<6)
            return 3;
        if(item.sellIn<1)
            return item.quality;
        return 1;
    }

}
