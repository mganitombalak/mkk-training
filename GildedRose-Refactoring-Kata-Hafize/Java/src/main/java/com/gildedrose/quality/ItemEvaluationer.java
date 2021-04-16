package com.gildedrose.quality;

import com.gildedrose.Item;

public class ItemEvaluationer implements IItemEvaluationer {

    public void qualityEval(Item item){
         int change =  qualityChange( item);
         item.quality += change;

         if(item.quality > 50)
             item.quality = 50;
    }

    public int qualityChange(Item item) {
        if(item.quality > 0)
            return -1;
        else return 0;
    }

    public int sellInChange(Item item) {
        return -1;
    }
}
