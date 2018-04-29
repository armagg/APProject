package Models.Fields;


import Models.Cards.Card;

import java.util.Random;

public class Deck implements Cards {

    private int maxLength = 30;

    public Card getRandomCard() {
        Random rand = new Random();
        rand.setSeed(System.nanoTime());
        int index = rand.nextInt(cards.size());
        deleteCard(cards.get(index));
        return cards.get(index);
    }


}
