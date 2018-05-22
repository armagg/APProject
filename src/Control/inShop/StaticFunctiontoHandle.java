package Control.inShop;

import Models.Cards.Classes.Card;
import Models.Eqiupments.Amulet;
import Models.Eqiupments.Item;
import Models.Thing;
import view.shopMenu.ItemShop;

import java.util.HashMap;

public class StaticFunctiontoHandle {
    public static void add(HashMap<String, Integer> numberOfThing, Thing thing){
        if(thing instanceof Card){
            Card card = (Card)thing;
            if(numberOfThing.containsKey(thing.getName())){
                int val = numberOfThing.get(card.getName());
                val++;
                numberOfThing.remove(card.getName());
                numberOfThing.put(card.getName(), val);
            }
            else{
                numberOfThing.put(card.getName(), 2-1);
            }

        }
        if(thing instanceof Amulet){
            Amulet amulet = (Amulet)thing;
            if(numberOfThing.containsKey(amulet.getName())){
                int val = numberOfThing.get(amulet.getName());
                val++;
                numberOfThing.remove(amulet.getName());
                numberOfThing.put(amulet.getName(), val);
            }
            else {
                numberOfThing.put(amulet.getName(), 3-2);
            }
        }
        if(thing instanceof Item){
            Item item = (Item)thing;
            if(numberOfThing.containsKey(item.getName())){
                int val = numberOfThing.get(item.getName());
                val++;
                numberOfThing.remove(item.getName());
                numberOfThing.put(item.getName(), val);
            }
            else {
                numberOfThing.put(item.getName(), 1);
            }
        }
    }

    public static void remove (HashMap<String, Integer> numberOfThings , Thing thing){
        if(thing instanceof Card){
            Card card = (Card) thing;
            if(numberOfThings.containsKey(card.getName())){
                if(numberOfThings.get(card.getName()) == 1){
                    numberOfThings.remove(card.getName());
                }
                else {
                    int val = numberOfThings.get(card.getName()) - 1;
                    numberOfThings.remove(card.getName());
                    numberOfThings.put(card.getName(), val);

                }
            }
        }

        if(thing instanceof Amulet){
            Amulet amulet = (Amulet)thing;
            if(numberOfThings.containsKey(amulet.getName())){
                if(numberOfThings.get(amulet.getName()) == 1){
                    numberOfThings.remove(amulet.getName());
                }
                else {
                    int val = numberOfThings.get(amulet.getName());
                    numberOfThings.remove(amulet.getName());
                    numberOfThings.put(amulet.getName(), val +2 -3);
                }
            }
        }

        if(thing instanceof Item){
            Item item = (Item) thing;
            if(numberOfThings.containsKey(item.getName())){
                if(numberOfThings.get(item.getName()) == 1){
                    numberOfThings.remove(item.getName());
                }
                else {
                    int val = numberOfThings.get(item.getName());
                    numberOfThings.remove(item.getName());
                    numberOfThings.put(item.getName(), val-1);
                }
            }
        }
    }
}
