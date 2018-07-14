package Control.inShop;
import Models.Cards.Classes.Card;
import Models.Cards.Classes.Monster;
import Models.Cards.Classes.SpellCards;
import Models.Eqiupments.Amulet;
import Models.Eqiupments.Item;
import Models.Fields.Deck;
import Models.Heroes.Hero;
import Models.Store.EditClasees.EditAmuletM;
import Models.Store.EditClasees.EditDeckM;
import Models.Store.EditClasees.EditInventoryM;
import Models.Store.Store;
import view.EditClasses.EditAmulets;
import view.EditClasses.EditDeck;
import view.EditClasses.EditInventory;
import view.MainMenu.Main;
import view.shopMenu.AmuletShop;
import view.shopMenu.CardShop;
import view.shopMenu.ItemShop;
import view.shopMenu.ShopSelecion;

import java.util.Scanner;

import static java.lang.System.exit;

public class ShopHandle {

    private AmuletShop amuletShop;
    private CardShop cardShop;
    private ItemShop itemShop;
    private Store store;
    private Deck deck;
    private EditAmulets editAmulets;
    private EditDeck editDeck;
    private EditInventory editInventory;

    private EditDeckM editDeckM;
    private EditInventoryM editInventoryM;
    private EditAmuletM editAmuletM;


    private ShopSelecion shopSelecion;
    private String command;
    private Hero hero;

    private String previous = null;

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public ShopHandle(Store store, Deck deck, Hero hero, EditDeckM editDeckM,
                      EditAmuletM editAmuletM) {
        this.hero = hero;
        this.store = store;
        this.deck = deck;
        this.editDeckM = editDeckM;
        this.editInventoryM = editInventoryM;
        this.editAmuletM = editAmuletM;
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
            case "edit inventory":
                editInventory = new EditInventory();
                handelEditInventory();
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
            case "help":
                shopSelectionMethod();
                return;
            case "card shop":
                cardShop = new CardShop(store.getCardShop().getCards(), hero.getInventory().getCards(), deck.getCardsOnDeck());
                cardShop.listPrinter();
                inCardShop();
                break;
            case "item shop":
                itemShop = new ItemShop(null, store.getItemShop().getItems(), hero.getNumberOfHeroThings());
                itemShop.itemPrinter();
                inItemShop();
                break;
            case "amulet shop":
             /*   System.out.println(hero.getName());
                System.out.println(hero.getNumberOfHeroThings() );
*/

                amuletShop = new AmuletShop(store.getAmuletShop().getAmulets(), hero.getAmulets(), hero.getNumberOfHeroThings(), null);
                amuletShop.listPrinter();
                inAmuletShop();
                break;
            case"exit":
                shopEntrance();
                break;
            default:
                toHandleUndefiend();
                shopSelectionMethod();
        }
    }

    private void  inCardShop() {
        command = cardShop.help();
        String informationToDo = null;
        if(command.contains(" ")){
            informationToDo = processInformationToDo();
            command = processCommand();
        }
        switch (command){
            case "help":
                inCardShop();
                return;
            case "buy":
                processBuyingInCardShop(informationToDo);
                break;
            case "edit":
                cardShop.editDeck(deck.getCardsOnDeck(), deck.getCards(), hero.getInventory().getCards(), hero.getInventory().getNumbersOfCards() );
                EditDeck editDeck = new EditDeck(cardShop);
                previous = "cardShop";
                HandleEditDeck();
                //TODO
                break;
            case "sell":
                processSellingInCardShop(informationToDo);
                break;
            case "info":
                processInfoInCardShop(informationToDo);
                break;
            case "exit":
                shopSelectionMethod();
                return;
            default:
                toHandleUndefiend();
                inCardShop();
                return;

        }
        inCardShop();
    }

    private void processBuyingInCardShop(String buyInformation){

        try{
            String[] stringsOfBuy = processStringForExchange(buyInformation);
            Card card = store.getCardShop().makeCardInShop(stringsOfBuy[0]);
            int val = Integer.valueOf(stringsOfBuy[1]);
            if(hero.getGil() >= card.getCost() * val){
                cardShop.successBuy(val, stringsOfBuy[0]);
                hero.setGil(hero.getGil() - val * card.getCost());
                hero.getInventory().addCard(card,val);
            }
            else {
                cardShop.notEnoughGil();
            }

        }catch (Exception e){
            e.printStackTrace();
        }



    }

    private void processSellingInCardShop(String informationToDo) {
        String[] stringsOfSell = processStringForExchange(informationToDo);
        Card card = store.getCardShop().makeCardInShop(stringsOfSell[0]);
        int val = Integer.valueOf(stringsOfSell[1]);
        if(hero.getInventory().getNumbersOfCards().get(card.getName()) >= val){
            if(!card.getPlace().name().equals("DECK")) {
                cardShop.successSell(val, card.getName());
                hero.setGil(hero.getGil() + val * card.getCost());
                hero.getInventory().deleteCard(card, val);
            }
            else {
                System.out.println("Your card is on the deck, you can't sell it baby!");
            }

        }
        else {
            cardShop.notEnoughCard();
        }
    }

    private void processInfoInCardShop(String informationToDo) {
        Card card = store.getCardShop().makeCardInShop(informationToDo);
        if(card instanceof Monster){
            cardShop.MonsterInfo((Monster) card);
        }
        else if(card instanceof SpellCards){
            cardShop.spellInfo((SpellCards)card);
        }

    }

    private void inItemShop() {
        command = itemShop.help();
        String informationToDo = null;
        if( command.contains(" ")){
            informationToDo = processInformationToDo();
            command = processCommand();
        }
        switch (command){
            case "help":
                inItemShop();
                return;
            case "buy":
                processBuyingInItemShop(informationToDo);
                break;
            case "sell":
                processSellingInItemShop(informationToDo);
                break;
            case "info":
                processInfoInItemShop(informationToDo);
                break;
            case "exit":
                shopSelectionMethod();
                return;
            default:
                toHandleUndefiend();
                inItemShop();
                return;
        }
        inItemShop();
    }

    private void processBuyingInItemShop(String informationToDo) {
        String[] strsOfBuy = processStringForExchange(informationToDo);
        Item item = store.getItemShop().makeItemInShop(strsOfBuy[0]);
        int val = Integer.valueOf(strsOfBuy[1]);
        if(hero.getGil() >= val*item.getCost()){
            itemShop.successBuy(val, item.getName());
            hero.setGil(hero.getGil() - val*item.getCost());
            hero.addItem(item, val);
        }
        else{
            itemShop.notEnoughGil();
        }

    }

    private void processSellingInItemShop(String informationToDo) {
        String[] strsOfSell = processStringForExchange(informationToDo);
        Item item = store.getItemShop().makeItemInShop(strsOfSell[0]);
        int val = Integer.valueOf(strsOfSell[1]);
        if(hero.getNumberOfHeroThings().get(item.getName()) >= val){
            itemShop.successSell(val, item.getName());
            hero.setGil(hero.getGil() + val*item.getCost());
            hero.deleteItem(item, val);
        }
        else{
            itemShop.notEnoughItem();
        }

    }

    private void processInfoInItemShop(String informationToDo) {
        Item item = store.getItemShop().makeItemInShop(informationToDo);
        itemShop.infoPrinter(item);
    }

    private void inAmuletShop() {
        command = amuletShop.help();
        String informationToDo = null;
        if(command.contains(" ")){
            informationToDo = processInformationToDo();
            command = processCommand();
        }
        switch (command){
            case "help":
                inAmuletShop();
                break;
            case "buy":
                processBuyingInAmuletShop(informationToDo);
                break;
            case "sell":
                processSellingInAmuletShop(informationToDo);
                break;
            case "exit":
                shopSelectionMethod();
                return;
            case "info":
                processInfoInAmuletShop(informationToDo);
                break;
            case "edit amulets":
                previous = "amulet shop";
                amuletShop.editAmulets(hero.getAmulets(), hero.getEquipAmulet().getName());
                handleEditAmulet();
                break;



        }
        inAmuletShop();
    }

    private void processBuyingInAmuletShop(String informationToDo) {
        String[] strsOfBuys = processStringForExchange(informationToDo);
        Amulet amulet = store.getAmuletShop().makeAmuletInS(strsOfBuys[0]);
        int val = Integer.valueOf(strsOfBuys[1]);
        if(hero.getGil() >= val * amulet.getCost()){
            cardShop.successBuy(val, amulet.getName());
            hero.setGil(hero.getGil() - val * amulet.getCost());
            hero.addAmulet(amulet, val);
        }
        else{
            amuletShop.notEnoughGil();
        }
    }

    private void processSellingInAmuletShop(String informationToDo) {
        String[] strsOfSelling = processStringForExchange(informationToDo);
        Amulet amulet = store.getAmuletShop().makeAmuletInS(strsOfSelling[0]);
        int val = Integer.valueOf(strsOfSelling[1]);

        if(hero.getNumberOfHeroThings().get(amulet.getName()) >= val){
            if(!hero.getEquipAmulet().getName().equals(amulet.getName())){
                amuletShop.successSell(val, amulet.getName());
                hero.setGil(hero.getGil() + val * amulet.getCost());
                hero.deleteAmulet(amulet, val);
            }
            else{
                System.out.println("this amulet is equip is on hero , you can not sell it babe");
            }
        }

    }

    private void processInfoInAmuletShop(String informationToDo) {
        Amulet amulet = store.getAmuletShop().makeAmuletInS(informationToDo);
        amuletShop.info(amulet);
    }

    private String processInformationToDo() {
        String s = command.substring(command.indexOf(" "), command.length());
        return s.trim();
    }

    private String processCommand() {
        String s = command.substring(0, command.indexOf(" "));
        return s.trim();
    }

    private String[] processStringForExchange(String str) {
        String[] s = str.split("-");
        s[0] = s[0].trim();
        s[1] = s[1].trim();
        return s;
    }

    private Scanner scanner = new Scanner(System.in);
    private void handelEditInventory() {
        command = editInventory.help();
        switch (command){
            case "card inventory":
                String s;
                editInventory.cardInventory(hero.getInventory().getCards(), hero.getInventory().getNumbersOfCards(),deck.getCardsOnDeck());
                try{
                    do {
                        System.out.println("you can see the info by typing card name or exit");
                        s = scanner.nextLine();
                        if(s.equals("exit"))
                            break;
                        processInfoInCardShop(s);
                    }while (!s.equals("exit"));
                }catch (Exception e){
                    System.out.println("invalid input");
                }
                handelEditInventory();
                break;
            case "item inventory":
                editInventory.ItemInventory(hero.getItems(), hero.getNumberOfHeroThings());
                do {
                    System.out.println("you can see the info by typing item name or exit");
                    s = scanner.nextLine();
                    processInfoInItemShop(s);
                }while (!s.equals("exit"));
                break;
            case "amulet inventory":
                editInventory.AmuletInventory(hero.getAmulets(), hero.getNumberOfHeroThings());
                do {
                    System.out.println("you can see the info by typing amulet name or exit");
                    s = scanner.nextLine();
                    processInfoInAmuletShop(s);
                }while (!s.equals("exit"));
                break;
            case "edit deck":
                previous = "Inventory";
                HandleEditDeck();
                return;
            case "edit Amulet":
                previous = "Inventory";
                handleEditAmulet();
                return;
            case "exit":
                shopEntrance();
                break;

        }
    }

    private void HandleEditDeck() {
        editDeck = new EditDeck(cardShop);
        command = editDeck.help();
        String informationToDo = null;
        if(command.contains(" ")) {
            informationToDo = processInformationToDo();
            command = processCommand();
        }
        switch (command){
            case "Add":
                addInEditDecK(informationToDo);
                break;
            case "again":
                cardShop.editDeck(deck.getCardsOnDeck(), deck.getCards(), hero.getInventory().getCards(), hero.getInventory().getNumbersOfCards());
            case "remove":
                Card card = store.getCardShop().makeCardInShop(informationToDo);
                editDeckM.remover(card);
                editDeck.removed(card.getName());
                break;
            case "info":
                Card card2 = store.getCardShop().makeCardInShop(informationToDo);
                editDeck.info(card2);
                break;
            case "exit":
                if(previous.equals("cardShop")){
                    inCardShop();
                }
                else if(previous.equals("inventory"))
                    handelEditInventory();
                return;

        }

        HandleEditDeck();
    }

    private void addInEditDecK(String informationToDo) {
        Card card = store.getCardShop().makeCardInShop(informationToDo);
        editDeckM.add(card);
        editDeck.added(card.getName());
    }

    public void handleEditAmulet(){
        command = editAmulets.help();
        String informationToDo = null;
        if(command.contains(" ")) {
            informationToDo = processInformationToDo();
            command = processCommand();
        }
        switch (command){
            case "equip":
                Amulet amulet = store.getAmuletShop().makeAmuletInS(informationToDo);
                editAmuletM.EquipAmulet(amulet);
                editAmulets.equipped(amulet.getName());
            case "remove":
                Amulet amulet2 = store.getAmuletShop().makeAmuletInS(informationToDo);
                editAmuletM.removeEquippedAmulet(amulet2);
                editAmulets.rmoveEquiption(amulet2.getName());
            case "info":
                Amulet amulet3 = store.getAmuletShop().makeAmuletInS(informationToDo);
                amuletShop.info(amulet3);
            case "exit":
                if(previous.equals("inventory")){
                    handelEditInventory();
                }
                else if(previous.equals("amulet shop")){
                    inAmuletShop();
                }
        }

    }

}

