package com.khangld.scrollingscreenshotissuse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by khangld on Dec 12, 2022.
 */
public class ItemUtil {

    public enum ItemType {
        ItemHorizontal, ItemBigThumb, ItemList
    }

    public static ArrayList<ItemType> getData() {
        ArrayList<ItemType> data = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            data.add(ItemType.ItemHorizontal);
        }

        data.add(ItemType.ItemBigThumb);

        for (int i = 0; i < 10; i++) {
            data.add(ItemType.ItemHorizontal);
        }

        data.add(ItemType.ItemList);

        return data;
    }
}
