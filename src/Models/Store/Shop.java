package Models.Store;

import Models.Thing;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Shop {
    protected HashMap<String,Integer> numbersOfThing = new HashMap<>();

    public HashMap<String, Integer> getNumbersOfThing() {
        return numbersOfThing;
    }
}
