package Veiw.shopMenue;

import Models.Cards.Classes.Card;
import Models.Cards.Classes.Monster;
import Models.Cards.Classes.SpellCards;
import Veiw.MainMenu.Main;

import java.util.ArrayList;
import java.util.HashMap;

import static java.lang.System.*;

public class cardShop{
    public void listPrinter(ArrayList<Card> shopCards, ArrayList<Card> playerCards, HashMap<String, Integer> numbersOfCards) {
        Main.GilPrinter();
        out.println("   Shop list:");
        int counter = 1;
        for (Card card : shopCards) {
            out.println(counter + ". " + card.getName() + card.getCost());
            counter++;
        }

        counter = 1;

        out.println("   Card Inventory");
        for (Card card : playerCards) {
            out.println(counter + ". " + card.getName() + " / " + numbersOfCards.get(card.getName()));
        }
    }

    public void help(){
        Main.GilPrinter();
        out.println("1. Buy \"Card Name\" - #NumberToBuy: To buy a certain number of a card from shop");
        out.println("2. Sell \"Card Name\" - #NumberToSell: To sell a certain number of a card from shop inventory");
        out.println("3. Info \"Card Name\": To get more information about a card");
        out.println("4. Edit Deck: To edit Deck and remove and add  cards to it");
        out.println("5. Exit: To return to shop menu");
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

    static public void MonsterInfo(Monster card){
        Main.GilPrinter();
        out.println(card.getName() + " Info");
        String general = "Name: " + card.getName() + "\n" + "HP: " + card.getHP() + "\n" + "AP: " + card.getAP() + "\n"
        + "MP cost: " + card.getMP() + "\n" + "Card Type: " + card.getMonsterType().name() + "\n" + "Card Tribe: " + card.getRace().name() + "\n"
        + "Is Defensive: " + card.isDefender() + "\n" + "Is Nimble: " + card.isNimble() + "\n" + card.toString();

        /**TODO**/ /*فکر کنم یه تو استرینگ درستش کرده باشه*/

        System.out.println(general);
    }

    static public void spellInfo(SpellCards card){
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
