package com.gildedrose;

import com.gildedrose.quality.*;

public class EvaluationerFactory {
    private ConjuredEvaluationer conjured = new ConjuredEvaluationer();
    private AgedBrieEvaluationer aged = new AgedBrieEvaluationer();
    private BackstagePassesEvaluationer backstage = new BackstagePassesEvaluationer();
    private SulfurasEvaluationer sulfuras = new SulfurasEvaluationer();
    private ItemEvaluationer iteme = new ItemEvaluationer();

    public IItemEvaluationer getItemEvaluator(Item item){
        if(item.name.contains("Conjured"))
            return conjured;

        if(item.name.contains("Aged Brie"))
            return aged;

        if(item.name.contains("Backstage passes"))
            return backstage;

        if(item.name.contains("Sulfuras"))
            return sulfuras;

        return iteme;
    }
}
