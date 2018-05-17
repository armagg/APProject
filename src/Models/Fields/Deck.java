package Models.Fields;


import Models.Cards.Classes.Card;

import java.util.HashMap;
import java.util.Random;

public class Deck extends SuperField {

    private final int maxLength = 30;
    private final int minLength = 25;



    @Override
    public boolean addCard(Card card) {
        if (cards.size() < maxLength) {
            cards.add(card);
            addToMap(card);
            return true;
        }

        return false;
    }

    @Override
    public boolean deleteCard(Card card) {
        if (cards.size() > minLength) {
            cards.remove(card);
            cardsOnField.remove(card.getName());
            return true;

        }
        return false;
    }

    public int getNumberOfCards() {
        return cards.size();
    }

    public Card getRandomCard() {
        Random rand = new Random();
        rand.setSeed(System.nanoTime());
        int index = rand.nextInt(cards.size());
        Card tempCard = cards.get(index);
        //ards.remove(tempCard);
        return tempCard;
    }
}
