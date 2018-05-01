package Models;

import Models.Fields.Deck;
import Models.Store.Store;

public class DataBase {
    private Store store;
    private int Gil;
    private Deck deck;
    private boolean isUsed = false;


    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public int getGil() {
        return Gil;
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
