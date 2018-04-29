package Models.Store;

import Models.Thing;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Thing> things = new ArrayList<>(5);

    public ArrayList<Thing> getObjects() {
        return things;
    }

    public boolean deleteThing(Thing thing) {
        if (things.contains(thing)) {
            things.remove(thing);
            return true;
        }
        return false;
    }

    public int getCost(Thing thing) {
        return thing.getCost();
    }


}
