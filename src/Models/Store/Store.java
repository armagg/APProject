package Models.Store;

import Models.Thing;

import java.util.ArrayList;

public class Store {
    private CardShop cardShop;
    private AmuletShop amuletShop;
    private ItemShop itemShop;


    public ArrayList<Thing> returnAllInSsshop() {
        ArrayList<Thing> things = new ArrayList<>(50);
        things.addAll(cardShop.getObjects());
        things.addAll(amuletShop.getObjects());
        things.addAll(itemShop.getObjects());

        return things;

    }

    public CardShop getCardShop() {
        return cardShop;
    }

    public void setCardShop(CardShop cardShop) {
        this.cardShop = cardShop;
    }

    public AmuletShop getAmuletShop() {
        return amuletShop;
    }

    public void setAmuletShop(AmuletShop amuletShop) {
        this.amuletShop = amuletShop;
    }

    public ItemShop getItemShop() {
        return itemShop;
    }

    public void setItemShop(ItemShop itemShop) {
        this.itemShop = itemShop;
    }





}