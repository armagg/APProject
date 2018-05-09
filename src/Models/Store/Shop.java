package Models.Store;

import Models.Thing;

import java.util.ArrayList;

public abstract class Shop {
    private ArrayList<Thing> things = new ArrayList<>(5);

    ArrayList<Thing> getObjects() {
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

    @Override
    public String toString() {
        String string = "";
        try {
            int i = 1;
            for (Thing thing : things) {
                string = string.concat(Integer.toString(i) + " : " + thing.toString() + "\n");
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        return string;
    }
}
