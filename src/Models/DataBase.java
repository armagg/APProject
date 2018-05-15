package Models;

import Models.Fields.Deck;
import Models.Store.Store;

public class DataBase {
    private Store store;
    private Deck deck;
    private boolean isUsed = false;


    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
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
