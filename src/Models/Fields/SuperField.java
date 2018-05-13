package Models.Fields;

import Models.Cards.Classes.Card;

import java.util.ArrayList;

public class SuperField {

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

