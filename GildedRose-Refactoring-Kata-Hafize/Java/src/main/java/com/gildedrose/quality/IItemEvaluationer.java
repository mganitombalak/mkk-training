package com.gildedrose.quality;

import com.gildedrose.Item;

public interface IItemEvaluationer {
    public void qualityEval(Item item);
    public int qualityChange(Item item);
    public int sellInChange(Item item);
}
