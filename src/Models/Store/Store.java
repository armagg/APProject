package Models.Store;

import Models.Thing;

import java.util.ArrayList;

public class Store {
    private CardShopM cardShop;
    private AmuletShopM amuletShop;
    private ItemShopM itemShop;

    public Store(CardShopM cardShop, AmuletShopM amuletShop, ItemShopM itemShop) {
        this.cardShop = cardShop;
        this.amuletShop = amuletShop;
        this.itemShop = itemShop;
    }

    public ArrayList<Thing> returnAllInSsshop() {
        ArrayList<Thing> things = new ArrayList<>(50);
        things.addAll(cardShop.getCards());
        things.addAll(amuletShop.getAmulets());
        things.addAll(itemShop.getItems());

        return things;

    }

    public CardShopM getCardShop() {
        return cardShop;
    }

    public void setCardShop(CardShopM cardShop) {
        this.cardShop = cardShop;
    }

    public AmuletShopM getAmuletShop() {
        return amuletShop;
    }

    public void setAmuletShop(AmuletShopM amuletShop) {
        this.amuletShop = amuletShop;
    }

    public ItemShopM getItemShop() {
        return itemShop;
    }

    public void setItemShop(ItemShopM itemShop) {
        this.itemShop = itemShop;
    }





}