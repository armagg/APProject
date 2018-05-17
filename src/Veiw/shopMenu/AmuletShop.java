package Veiw.shopMenu;

import Models.Eqiupments.Amulet;
import Veiw.MainMenu.Main;

import java.util.ArrayList;

import static java.lang.System.out;

public class AmuletShop {
    public void listPrinter(ArrayList<Amulet> shopList, ArrayList<Amulet> inventoryList) {
        Main.GilPrinter();
        out.println("   Shop list:");
        int counter = 1;
        for (Amulet amulet : shopList) {
            out.println(counter + ". " + amulet.getName() + amulet.getCost());
            counter++;
        }

        counter = 1;

        System.out.println("   Card Inventory");
        for (Amulet amulet : inventoryList) {
            System.out.println(counter + ". " + amulet.getName() /** TODO num on deck **/);
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
        out.println("Not enough amulets!");
    }

    public void info(Amulet amulet){
        System.out.println(amulet.getName() + ":");
        System.out.println(amulet.toString());
    }


}
