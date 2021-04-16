package com.gildedrose.quality;

import com.gildedrose.Item;

public class AgedBrieEvaluationer extends ItemEvaluationer {

    public int qualityChange(Item item) {
        if(item.quality<50)
            return 1;

        return 0;
    }
    public int sellInChange(Item item) {
        return -1;
    }
}
