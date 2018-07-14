package view.shopMenu;

import Models.Eqiupments.Item;
import view.MainMenu.Main;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import static java.lang.System.out;

public class ItemShop {
    private ArrayList<Item> playerItems;
    private ArrayList<Item> shopItems;
    private HashMap<String, Integer> numsOfItemsInShop;
    private Scanner sc = new Scanner(System.in);

    public ItemShop(ArrayList<Item> playerItems, ArrayList<Item> shopItems, HashMap<String, Integer> numsOfItemsInShop) {
        this.playerItems = playerItems;
        this.shopItems = shopItems;
        this.numsOfItemsInShop = numsOfItemsInShop;
    }

    public void itemPrinter() {
        Main.GilPrinter();
        System.out.println(" Shop List:");
        int count = 1;
        for (Item item: shopItems){
            System.out.println(count+". " + item.getName() + " " + item.getCost());
            count++;
        }
        count = 1;

        if(playerItems != null) {
            for (Item item : playerItems) {
                System.out.println(" Item Inventory");
                System.out.println(count + ". " + numsOfItemsInShop.get(item.getName()) + item.getName());
            }
        }

    }

    public String help(){
        Main.GilPrinter();
        System.out.println("1. Buy \"item name\" - #NumberToBuy: To by an item from the shop");
        System.out.println("2. Sell \"item name\" - #NumberToSell: To sell an item from your item inventory");
        System.out.println("3. Info \"item name\": To view the full information of the item");
        System.out.println("4. Exit: To exit back to the shop menu");
        return sc.nextLine();
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

    public void notEnoughItem(){
        out.println("Not enough items!");
    }

    public void infoPrinter(Item item){
        System.out.println(item.getName() + "Info:");
        System.out.println(item.toString());
    }

}
