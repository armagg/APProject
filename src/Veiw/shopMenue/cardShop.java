package Veiw.shopMenue;

import Models.Cards.Classes.Card;
import Models.Cards.Classes.Monster;
import Models.Cards.Classes.SpellCards;

import java.util.ArrayList;

import static java.lang.System.*;

public class cardShop {

    static public void cardPrinter(ArrayList<Card> shopCards, ArrayList<Card> playerCards) {
        out.println("   Shop list:");
        int counter = 1;
        for (Card card : shopCards) {
            out.println(counter + ". " + card.getName() + card.getCost());
            counter++;
        }

        counter = 1;

        out.println("   Card Inventory");
        for (Card card : playerCards) {
            out.println(counter + ". " + card.getName() /**num on deck **/);
        }
    }

    static public void help(){

        out.println("1. Buy \"Card Name\" - #NumberToBuy: To buy a certain number of a card from shop");
        out.println("2. Sell \"Card Name\" - #NumberToSell: To sell a certain number of a card from shop inventory");
        out.println("3. Info \"Card Name\": To get more information about a card");
        out.println("4. Edit Deck: To edit Deck and remove and add  cards to it");
        out.println("5. Exit: To return to shop menu");
    }

    static public void successBuy(int number, Card card){
        out.println("Successfully bought" + number + "of" + card.getName());
    }

    static public void notEnoughGil(){
        out.println("Not enough Gil!");
    }

    static public void successSell(int number, Card card){
        out.println("Successfully bought" + number + "of" + card.getName());
    }

    static public void notEnoughCard(){
        out.println("Not enough cards!");
    }

    static public void MonsterInfo(Monster card){
        out.println(card.getName() + " Info");
        String general = "Name: " + card.getName() + "\n" + "HP: " + card.getHP() + "\n" + "AP: " + card.getAP() + "\n"
        + "MP cost: " + card.getMP() + "\n" + "Card Type: " + card.getMonsterType().name() + "\n" + "Card Tribe: " + card.getRace().name() + "\n"
        + "Is Defensive: " + card.isDefender() + "\n" + "Is Nimble: " + card.isNimble() + "\n";

        /**TODO**/

        out.println(general);
    }

    static public void spellInfo(SpellCards card){
        out.println(card.getName() + " Info");
        out.println("Name: " + card.getName());
        out.println("MP cost: " + card.getMP());
        out.println("Card Type: " + card.getSpellType().name());
        /** TODO **/
    }









}
