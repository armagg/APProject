package view.shopMenu;

import Models.Cards.Classes.Card;
import Models.Cards.Classes.Monster;
import Models.Cards.Classes.SpellCards;
import view.MainMenu.Main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import static java.lang.System.*;

public class cardShop{
    private ArrayList<Card> shopCards;
    private ArrayList<Card> playerCards;
    private HashMap<String, Integer> numbersOfCards;
    private Scanner scanner = new Scanner(System.in);

    public cardShop(ArrayList<Card> shopCards, ArrayList<Card> playerCards, HashMap<String, Integer> numbersOfCards) {
        this.shopCards = shopCards;
        this.playerCards = playerCards;
        this.numbersOfCards = numbersOfCards;
    }

    public void listPrinter() {
        Main.GilPrinter();
        System.out.println("   Shop list:");
        int counter = 1;
        for (Card card : shopCards) {
            out.println(counter + ". " + card.getName() + card.getCost());
            counter++;
        }

        counter = 1;

        out.println("   Card Inventory");
        for (Card card : playerCards) {
            System.out.println(counter + ". " + card.getName() + " / " + numbersOfCards.get(card.getName()));
        }
    }

    public String help(){
        Main.GilPrinter();
        System.out.println("1. Buy \"Card Name\" - #NumberToBuy: To buy a certain number of a card from shop");
        System.out.println("2. Sell \"Card Name\" - #NumberToSell: To sell a certain number of a card from shop inventory");
        System.out.println("3. Info \"Card Name\": To get more information about a card");
        System.out.println("4. Edit Deck: To edit Deck and remove and add  cards to it");
        System.out.println("5. Exit: To return to shop menu");
        String s = scanner.nextLine();
        return s;
    }

    public void successBuy(int number, String name){
        Main.GilPrinter();
        out.println("Successfully bought" + number + "of" + name);
    }

    public void notEnoughGil(){
        Main.GilPrinter();
        out.println("Not enough Gil!");
    }

    public void successSell(int number, String name){
        Main.GilPrinter();
        out.println("Successfully bought" + number + "of" + name);
    }

    public void notEnoughCard(){
        out.println("Not enough cards!");
    }

    public void MonsterInfo(Monster card){
        Main.GilPrinter();
        out.println(card.getName() + " Info");
        String general = "Name: " + card.getName() + "\n" + "HP: " + card.getHP() + "\n" + "AP: " + card.getAP() + "\n"
        + "MP cost: " + card.getMP() + "\n" + "Card Type: " + card.getMonsterType().name() + "\n" + "Card Tribe: " + card.getRace().name() + "\n"
        + "Is Defensive: " + card.isDefender() + "\n" + "Is Nimble: " + card.isNimble() + "\n" + card.toString();

        /**TODO**/ /*فکر کنم یه تو استرینگ درستش کرده باشه*/

        System.out.println(general);
    }

    public void spellInfo(SpellCards card){
        Main.GilPrinter();
        out.println(card.getName() + " Info");
        out.println("Name: " + card.getName());
        out.println("MP cost: " + card.getMP());
        out.println("Card Type: " + card.getSpellType().name());
        System.out.println(card.toString());
    }

    public void editDeck(HashMap<String, Integer> numOnDeck, ArrayList<Card> cards){

/*ببین اینجوری زدم که اسلاتای خالی بیفتن ته دک ... از پایان تعداد کارتا تا شماره ی 30 خالی بودن چاپ کنه*/
        Main.GilPrinter();
        System.out.println("Deck:");
        int count = 1 ;
        for(Card card: cards){
            System.out.print("Slot" + count + ": " + card.getName());
            count++;
        }
        int numbersOfEmpty = 30 - cards.size();
        for(int i = 0 ; i < numbersOfEmpty ; i++){
            System.out.print("Slot" + count + ": Empty");
            count++;
        }

         /*آقا ناموسا نمیفهم منظورش از آدرکارت چیه */
         /**TODO **/

    }










}
