package view.MainMenu;

import Models.Battle;
import Models.Heroes.Hero;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    private static Hero hero;

    public static void setHero(Hero hero) {
        Main.hero = hero;
    }

    //TODO

    static public String showMenu() {
        System.out.println("1. Enter Shop : to enter shop and buy or sell Cards and Items \n " +
                "2. Edit \n" +
                "3. Next : To go to deck and amulet customization ");
        String s = scanner.nextLine();
        return s;
    }


    public static int nextMenu() {
        String s = scanner.next();
        if (s.equals("help")) {
            showMenu();
            return 0;
        } else {
            return Integer.parseInt(s);
        }
    }

    public static void GilPrinter() {
        System.out.println(hero.getGil());
    }

}
