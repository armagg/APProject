package Veiw.shopMenu;

import Models.Eqiupments.Item;
import Veiw.MainMenu.Main;


import java.util.ArrayList;
import java.util.HashMap;

import static java.lang.System.out;

public class ItemShop {
    public void itemPrinter(ArrayList<Item> inventoryList, ArrayList<Item> shopList, HashMap<String, Integer> numbersOfItem) {
        Main.GilPrinter();
        System.out.println(" Shop List:");
        int count = 1;
        for (Item item: shopList){
            System.out.println(count+". " + item.getName() + " " + item.getCost());
            count++;
        }
        count = 1;

        for(Item item: inventoryList){
            System.out.println(" Item Inventory");
            System.out.println(count + ". " + numbersOfItem.get(item.getName()) + item.getName());
        }

    }

    public void help(){
        Main.GilPrinter();
        System.out.println("1. Buy \"item name\" - #NumberToBuy: To by an item from the shop");
        System.out.println("2. Sell \"item name\" - #Nu mberToSell: To sell an item from your item inventory");
        System.out.println("3. Sell \"item name\": To view the full information of the item");
        System.out.println("4. Exit: To exit back to the shop menu");
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
