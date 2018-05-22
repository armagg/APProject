package Control.inShop;
import Models.Cards.Classes.Card;
import Models.Eqiupments.Amulet;
import Models.Eqiupments.Item;
import Models.Fields.Deck;
import Models.Fields.Inventory;
import Models.Heroes.Hero;
import Models.Store.AmuletShopM;
import Models.Store.CardShopM;
import Models.Store.ItemShopM;
import Models.Store.Store;
import view.MainMenu.Main;
import view.shopMenu.AmuletShop;
import view.shopMenu.ItemShop;
import view.shopMenu.ShopSelecion;
import view.shopMenu.cardShop;

import java.util.ArrayList;
import java.util.HashMap;

public class ShopHandle {

    private AmuletShop amuletShop;
    private cardShop cardShop;
    private ItemShop itemShop;
    private Store store;
    private Deck deck;

    private ShopSelecion shopSelecion;
    private String command;
    private Hero hero;

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public ShopHandle(Store store, Deck deck, Hero hero) {
        this.hero = hero;
        this.store = store;
        this.deck = deck;
        shopEntrance();
    }

    private void toHandleUndefiend(){
        System.out.println("The input is unknown please write the true command");

    }

    private void shopEntrance() {
        Main.setHero(this.hero);
        command = Main.showMenu();
        switch (command) {
            case "help":
                shopEntrance();
                break;
            case "enter shop":
                shopSelecion = new ShopSelecion();
                shopSelectionMethod();
                break;
            case "edit":
                //TODO
                break;
            case "next":
                //TODO
                break;
            default:
                toHandleUndefiend();
                shopEntrance();

        }
    }

    private void shopSelectionMethod (){
        command = shopSelecion.menu();
        switch (command){
            case "card shop":
                cardShop = new cardShop(store.getCardShop().getCards(), hero.getInventory().getCards(), deck.getCardsOnDeck());
                inCardShop();
                break;
            case "item shop":
                itemShop = new ItemShop();
                break;
            case "amulet shop":
                amuletShop = new AmuletShop();
                break;
            case"exit":
                shopEntrance();
                break;
            default:
                toHandleUndefiend();
                command = shopSelecion.menu();
                shopSelectionMethod();
        }
    }

    private void inCardShop() {
        cardShop.listPrinter();
        command = cardShop.help();
        String cardName;
        if(command.contains(" ")){
            cardName = command.substring(command.indexOf(" "), command.length());
            command = command.substring(0, command.indexOf(" "));
        }
        switch (command){
            case "help":
                inCardShop();
                break;
            case "buy":
                proccessBuying();
                break;
            case "sell":
                break;
            case "info":
                break;

        }
    }

    private void proccessBuying(){

    }


}

