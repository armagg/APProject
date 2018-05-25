package view.shopMenu;

import Models.Eqiupments.Amulet;
import view.MainMenu.Main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import static java.lang.System.out;

public class AmuletShop {
    private ArrayList<Amulet> amuletsOfShop;
    private ArrayList<Amulet> inventoryList;
    private HashMap<String, Integer> numbersOfAmulet;
    private String Equiption;
    private Scanner sc = new Scanner(System.in);

    public AmuletShop(ArrayList<Amulet> amuletsOfShop, ArrayList<Amulet> inventoryList, HashMap<String, Integer> numbersOfAmulet, String equiption) {
        this.amuletsOfShop = amuletsOfShop;
        this.inventoryList = inventoryList;
        this.numbersOfAmulet = numbersOfAmulet;
        Equiption = equiption;
    }

    public void listPrinter() {
        Main.GilPrinter();
        out.println("   Shop list:");
        int counter = 1;
        for (Amulet amulet : amuletsOfShop) {
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

    public String help(){
        Main.GilPrinter();
        System.out.println("1. Buy \"Amulet name\": - #NumberToBuy: To buy a number of an amulet from the shop");
        System.out.println("2. Sell \"Amulet name\": - #NumberToSell: To sell a number of an amulet from amulet inventory ");
        System.out.println("3. Info \"Amulet name\": To get full info on an amulet ");
        System.out.println("4. Edit Amulets: To equip or remove your heroes amulet");
        System.out.println("5. Exit: TO exit to the shop menu");

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

    public void notEnoughCard(){
        Main.GilPrinter();
        out.println("Not enough amulets!");
    }

    public void info(Amulet amulet){
        Main.GilPrinter();
        System.out.println(amulet.getName() + ":");
        System.out.println(amulet.toString());
    }

    public void editAmulets(ArrayList<Amulet> amulets, String nameOfEquiption){
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
