package com.gildedrose.quality;

import com.gildedrose.Item;

public class ConjuredEvaluationer extends ItemEvaluationer {

    public int qualityChange(Item item) {
        return -2;
    }
    public int sellInChange(Item item) {
        return -1;
    }
}
