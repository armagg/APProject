package view.EditClasses;

import Models.Cards.Classes.Card;
import Models.Eqiupments.Amulet;
import Models.Eqiupments.Item;
import view.MainMenu.Main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class EditInventory {
    private Scanner sc = new Scanner(System.in);
    public String help(){
        Main.GilPrinter();
        System.out.println("1. Card Inventory: To view  your cards");
        System.out.println("2. Item Inventory: To view your items");
        System.out.println("3. Amulet Inventory: To view your amulets");
        System.out.println("4. Edit Deck: To edit your card deck");
        System.out.println("5. Edit Amulets: To equip or remove  your amulets");
        System.out.println("6. Exit: To exit to previous menu");
        return sc.nextLine();
    }

    /**TODO handle again an these methods**/

    public void cardInventory(ArrayList<Card> cards, HashMap<String, Integer> allWeHave, HashMap<String, Integer> onDeck){
        Main.GilPrinter();
        System.out.println("Card Inventory:");
        int count = 1;
        for(Card card : cards){
            System.out.println(count + ". " + card.getName() + "/" + (onDeck.containsKey(card.getName()) ? onDeck.get(card.getName()) : "0") + " on deck");
            count++;
        }


    }

    public void ItemInventory(ArrayList<Item> items , HashMap<String, Integer> nums ){
        Main.GilPrinter();
        int count = 1;
        for(Item item: items){
            System.out.println(count + ". " + nums.get(item.getName()) + " "+ item.getName());
            count++;
        }


    }

    public void AmuletInventory(ArrayList<Amulet> amulets, HashMap<String, Integer> nums){
        Main.GilPrinter();
        int count = 1;
        for(Amulet amulet : amulets){
            System.out.println(count + ". " + nums.get(amulet.getName()) + " " + amulet.getName());
            count++;
        }
    }
}
