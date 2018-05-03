package Control;

import Models.Cards.Classes.Card;
import Models.Cards.Classes.Monster;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");
        ArrayList<Card> cards = new ArrayList<>();

        Monster monster = new Monster();
        cards.add(monster);

    }
}