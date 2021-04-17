package com.gildedrose;

public class TexttestFixture {
    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        GildedRose.items = new Item[] {
                RegisterItem.createItem(ItemTypeEnum.REGULAR, ItemCategoryEnum.DEFAULT,"+5 Dexterity Vest", 10, 20), //
                RegisterItem.createItem(ItemTypeEnum.REGULAR, ItemCategoryEnum.AGED_BRIE,"Aged Brie", 2, 0), //
                RegisterItem.createItem(ItemTypeEnum.REGULAR, ItemCategoryEnum.DEFAULT,"Elixir of the Mongoose", 5, 7), //
                RegisterItem.createItem(ItemTypeEnum.REGULAR, ItemCategoryEnum.SULFURAS,"Hand of Ragnaros", 0, 80), //
                RegisterItem.createItem(ItemTypeEnum.REGULAR, ItemCategoryEnum.SULFURAS,"Sulfuras, Hand of Ragnaros", -1, 80),
                RegisterItem.createItem(ItemTypeEnum.REGULAR, ItemCategoryEnum.BACKSTAGE_PASSES,"TAFKAL80ETC concert", 15, 20),
                RegisterItem.createItem(ItemTypeEnum.REGULAR, ItemCategoryEnum.BACKSTAGE_PASSES,"TAFKAL80ETC concert", 10, 49),
                RegisterItem.createItem(ItemTypeEnum.REGULAR, ItemCategoryEnum.BACKSTAGE_PASSES,"TAFKAL80ETC concert", 5, 49),
                // this conjured item does not work properly yet
                RegisterItem.createItem(ItemTypeEnum.CONJURED, ItemCategoryEnum.DEFAULT,"Conjured Mana Cake", 3, 6) };

        int days = 2;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : GildedRose.items) {
                System.out.println(item);
            }
            System.out.println();
            GildedRose.updateQuality();
        }
    }

}
