package Models.Fields;

import Models.Cards.Card;

import java.util.Random;

public class DeckInGame implements Cards {

    public Card getRandomCard() {
        Random rand = new Random();
        rand.setSeed(System.nanoTime());
        int index = rand.nextInt(cards.size());
        Card tempCard = cards.get(index);
        cards.remove(tempCard);
        return tempCard;
    }


}
