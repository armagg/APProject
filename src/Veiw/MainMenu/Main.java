package Veiw.MainMenu;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    static void showMenu() {
        System.out.println("1. Enter Shop : to inter shop and buy or sell Cards and Items \n " +
                "2. Edit \n" +
                "3. Next : To go to deck and amulet customization ");
    }


    static int nextMenu() {
        String s = scanner.next();
        if (s.equals("help")) {
            showMenu();
            return 0;
        } else {
            int nextMenu = Integer.parseInt(s);
            return nextMenu;
        }
    }

    public static void GilPrinter() {

    }
}
