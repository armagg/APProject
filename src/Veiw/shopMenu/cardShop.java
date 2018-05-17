package Veiw.shopMenu;

import Models.Cards.Classes.Card;
import Models.Cards.Classes.Monster;
import Models.Cards.Classes.SpellCards;
import Veiw.MainMenu.Main;

import java.util.ArrayList;

import static java.lang.System.*;

public class cardShop{
    public void listPrinter(ArrayList<Card> shopCards, ArrayList<Card> playerCards) {
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
            out.println(counter + ". " + card.getName() /**TODO num on deck **/);
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
        + "Is Defensive: " + card.isDefender() + "\n" + "Is Nimble: " + card.isNimble() + "\n";

        /**TODO**/

        System.out.println(general);
    }

    static public void spellInfo(SpellCards card){
        Main.GilPrinter();
        out.println(card.getName() + " Info");
        out.println("Name: " + card.getName());
        out.println("MP cost: " + card.getMP());
        out.println("Card Type: " + card.getSpellType().name());
        /** TODO **/
    }

    public void editDeck(){

        /**TODO **/

    }










}
