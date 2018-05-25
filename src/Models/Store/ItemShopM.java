package Models.Store;

import Control.inShop.StaticFunctiontoHandle;
import Models.Eqiupments.Item;
import Models.Eqiupments.items.*;

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

    public static Item makeItemInShop(String name){
        switch (name){
            case "small hp potion":
                return new SmallHPPotion();
            case "medium hp potion":
                return new MediumHPPotion();
            case "large hp potion":
                return new LargeHPPtion();
            case "small mp potion":
                return new SmallMPPotion();
            case "medium mp potion":
                return new MediumMPPotion();
            case "large mp potion":
                return new LargeMPpotion();
            case "lesser restorative":
                return new LesserRestorative();
            case "greater restorative":
                return new GreaterRestorative();
        }
        return null;
    }

    public void removeItem(Item item){
        StaticFunctiontoHandle.remove(numbersOfThing, item);
        if(items.contains(item)) {
            items.remove(item);
        }

    }
}
