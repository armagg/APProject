package view.shopMenu;

import view.MainMenu.Main;

import java.util.Scanner;


public class ShopSelecion {
    Scanner sc = new Scanner(System.in);
    public String menu(){
        Main.GilPrinter();
        System.out.println("1. Card Shop\n" + "2. Item Shop\n" + "3. Amulet Shop\n" + "4. Exit");
        String toDo = sc.nextLine();
        return toDo;
    }

}


