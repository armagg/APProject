package Control.inShop;
import Models.Cards.Classes.Card;
import Models.Fields.Deck;
import Models.Heroes.Hero;
import Models.Store.Store;
import view.MainMenu.Main;
import view.shopMenu.AmuletShop;
import view.shopMenu.ItemShop;
import view.shopMenu.ShopSelecion;
import view.shopMenu.CardShop;

public class ShopHandle {

    private AmuletShop amuletShop;
    private CardShop cardShop;
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
                cardShop = new CardShop(store.getCardShop().getCards(), hero.getInventory().getCards(), deck.getCardsOnDeck());
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
        String informationToBuy = null;
        if(command.contains(" ")){
            informationToBuy = command.substring(command.indexOf(" "), command.length());
            informationToBuy.trim();
            command = command.substring(0, command.indexOf(" "));
            informationToBuy.trim();
        }
        switch (command){
            case "help":
                inCardShop();
                break;
            case "buy":
                processBuyingInCardShop(informationToBuy);
                break;
            case "sell":
                break;
            case "info":
                break;

        }
    }

    private void processBuyingInCardShop(String buyInformation){

        try{
            String[] stringsOfBuy = buyInformation.split("-");
            stringsOfBuy[0].trim();
            stringsOfBuy[1].trim();
            Card card = store.getCardShop().makeCardInShop(stringsOfBuy[0]);
            if(hero.getGil() >= card.getCost()){
                hero.getInventory().getCards().add(card);
                int val = Integer.valueOf(stringsOfBuy[1]);
                cardShop.successBuy(val, stringsOfBuy[0]);
            }
            else {
                cardShop.notEnoughGil();
            }

        }catch (Exception e){
            e.printStackTrace();
        }



    }


}

