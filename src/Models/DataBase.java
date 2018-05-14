package Models;

import Models.Fields.Deck;
import Models.Store.Store;

public class DataBase {
    private Store store;
    static private int Gil;
    private Deck deck;
    private boolean isUsed = false;


    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    static public int getGil() {
        return Gil;
    }

    static public void gilPrinter() {
        System.out.println("Remaining Gil:" + getGil()) ;
    }


    public void setGil(int gil) {
        Gil = gil;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }
}
