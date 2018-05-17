package Veiw.shopMenu;

import Models.Eqiupments.Amulet;
import Veiw.MainMenu.Main;

import java.util.ArrayList;
import java.util.HashMap;

import static java.lang.System.out;
import static java.lang.System.setOut;

public class AmuletShop {
    public void listPrinter(ArrayList<Amulet> shopList, ArrayList<Amulet> inventoryList, HashMap<String, Integer> numbersOfAmulet,String Equiption) {
        Main.GilPrinter();
        out.println("   Shop list:");
        int counter = 1;
        for (Amulet amulet : shopList) {
            out.println(counter + ". " + amulet.getName() + amulet.getCost());
            counter++;
        }

        if(Equiption != null){
            System.out.println();
            System.out.println("Equipped Amulet: " + Equiption);
            System.out.println( );
        }

        counter = 1;

        System.out.println("   Card Inventory");
        for (Amulet amulet : inventoryList) {
            System.out.println(counter + ". " + numbersOfAmulet.get(amulet.getName()) + amulet.getName());
        }
    }

    public void help(){
        Main.GilPrinter();
        System.out.println("1. Buy \"Amulet name\": - #NumberToBuy: To buy a number of an amulet from the shop");
        System.out.println("2. Sell \"Amulet name\": - #NumberToSell: To sell a number of an amulet from amulet inventory ");
        System.out.println("3. Info \"Amulet name\": To get full info on an amulet ");
        System.out.println("4. Edit Amulets: To equip or remove your heroes amulet");
        System.out.println("5. Exit: TO exit to the shop menu");
        /**TODO you should know that the telesm shouldn't be equiped on hero for selling**/
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
        Main.GilPrinter();
        out.println("Not enough amulets!");
    }

    public void info(Amulet amulet){
        Main.GilPrinter();
        System.out.println(amulet.getName() + ":");
        System.out.println(amulet.toString());
    }

    public void EditAmulets(ArrayList<Amulet> amulets, String nameOfEquiption){
        Main.GilPrinter();
        int count = 1;
        for(Amulet amulet: amulets){
            System.out.println(count + "." + amulet.getName());
            count++;
        }
        if(nameOfEquiption != null){
            System.out.println("Player is equipped with" + nameOfEquiption);
        }
    }


}
