package Models.Fields;


import Control.inShop.StaticFunctiontoHandle;
import Models.Cards.Classes.Card;

import java.util.HashMap;
import java.util.Random;

public class Deck extends SuperField {

    private final int maxLength = 30;
    private final int minLength = 25;

    private HashMap<String, Integer> cardsOnDeck = new HashMap<>();

    public HashMap<String, Integer> getCardsOnDeck() {
        return cardsOnDeck;
    }

    public void fillingMap(){
        for(Card card : cards){
            addCard(card);
        }
    }

    @Override
    public boolean addCard(Card card) {
        StaticFunctiontoHandle.add(cardsOnDeck, card);
        if (cards.size() < maxLength) {
            cards.add(card);
                return true;
        }

        return false;
    }

    @Override
    public boolean deleteCard(Card card) {
        StaticFunctiontoHandle.remove(cardsOnDeck, card);
        if (cards.size() > minLength) {
            cards.remove(card);
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
//      cards.remove(tempCard);
        return tempCard;
    }
}