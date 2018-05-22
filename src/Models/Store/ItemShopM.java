package Models.Store;

import Control.inShop.StaticFunctiontoHandle;
import Models.Eqiupments.Item;

import java.util.ArrayList;

public class ItemShopM extends Shop {
    ArrayList<Item> items;

    public ItemShopM(ArrayList<Item> items) {
        this.items = items;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public void addItem(Item item){
        StaticFunctiontoHandle.add(numbersOfThing, item);
        items.add(item);
    }

    public void removeItem(Item item){
        StaticFunctiontoHandle.remove(numbersOfThing, item);
        if(items.contains(item)) {
            items.remove(item);
        }

    }
}
