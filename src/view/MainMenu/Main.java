package view.MainMenu;

import Models.Battle;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    private static Battle battle = new Battle();
    static void showMenu() {
        System.out.println("1. Enter Shop : to enter shop and buy or sell Cards and Items \n " +
                "2. Edit \n" +
                "3. Next : To go to deck and amulet customization ");
    }


    static int nextMenu() {
        String s = scanner.next();
        if (s.equals("help")) {
            showMenu();
            return 0;
        } else {
            return Integer.parseInt(s);
        }
    }

    public static void GilPrinter() {
        System.out.println(battle.getPlayerHero().getGil());
    }

}
