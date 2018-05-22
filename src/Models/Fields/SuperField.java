package Models.Fields;

import Models.Cards.Classes.Card;

import java.util.ArrayList;
import java.util.Random;

public abstract class SuperField {

    ArrayList<Card> cards = new ArrayList<>(5);

    public int getNumberOfCards() {
        return cards.size();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public boolean addCard(Card card) {
        cards.add(card);
        return true;
    }

    public boolean deleteCard(Card card) {
        if (cards.contains(card)) {
            cards.remove(card);
            return true;

        }
        return false;
    }

    public Card getRandomCard() {
        Random random = new Random();
        try {


            return cards.get(random.nextInt(getNumberOfCards()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        String informations = "";
        for (int i = 0; i < getNumberOfCards(); i++) {
            informations = informations.concat(getCards().get(i).toString() + "\n");
        }


        return informations;
    }

     /*int cardCounterGetter();
     int maxLengthGetter();
*/


}

