package Veiw.shopMenue;

import Models.Cards.Classes.Card;
import Models.Cards.Classes.Monster;
import Models.Cards.Classes.SpellCards;
import Models.DataBase;

import java.util.ArrayList;

public class cardShop {

    static public void cardPrinter(ArrayList<Card> shopCards, ArrayList<Card> playerCards) {
        DataBase.gilPrinter();
        System.out.println("   Shop list:");
        int counter = 1;
        for (Card card : shopCards) {
            System.out.println(counter + ". " + card.getName() + card.getCost());
            counter++;
        }

        counter = 1;

        System.out.println("   Card Inventory");
        for (Card card : playerCards) {
            System.out.println(counter + ". " + card.getName() /**num on deck **/);
        }
    }

    static public void help(){
        DataBase.gilPrinter();
        System.out.println("1. Buy \"Card Name\" - #NumberToBuy: To buy a certain number of a card from shop" );
        System.out.println("2. Sell \"Card Name\" - #NumberToSell: To sell a certain number of a card from shop inventory" );
        System.out.println("3. Info \"Card Name\": To get more information about a card");
        System.out.println("4. Edit Deck: To edit Deck and remove and add  cards to it");
        System.out.println("5. Exit: To return to shop menu");
    }

    static public void successBuy(int number, Card card){
        System.out.println("Successfully bought" + number + "of" + card.getName());
    }

    static public void notEnoughGil(){
        System.out.println("Not enough Gil!");
    }

    static public void successSell(int number, Card card){
        System.out.println("Successfully bought" + number + "of" + card.getName());
    }

    static public void notEnoughCard(){
        System.out.println("Not enough cards!");
    }

    static public void MonsterInfo(Monster card){
        DataBase.gilPrinter();
        System.out.println(card.getName() + " Info");
        String general = "Name: " + card.getName() + "\n" + "HP: " + card.getHP() + "\n" + "AP: " + card.getAP() + "\n"
        + "MP cost: " + card.getMP() + "\n" + "Card Type: " + card.getMonsterType().name() + "\n" + "Card Tribe: " + card.getRace().name() + "\n"
        + "Is Defensive: " + card.isDefender() + "\n" + "Is Nimble: " + card.isNimble() + "\n";

        /**some are not done **/

        System.out.println(general);
    }

    static public void spellInfo(SpellCards card){
        DataBase.gilPrinter();
        System.out.println(card.getName() + " Info");
        System.out.println("Name: " + card.getName());
        System.out.println("MP cost: " + card.getMP());
        System.out.println("Card Type: " + card.getSpellType().name());
        /** To Do **/
    }









}
