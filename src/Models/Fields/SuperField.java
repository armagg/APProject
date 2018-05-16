package Models.Fields;

import Models.Cards.Classes.Card;

import java.util.ArrayList;
import java.util.HashMap;

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
        addToMap(card);
        return true;
    }

    HashMap<String, Integer> cardsOnField = new HashMap<>();

    void addToMap(Card card){
        if(cardsOnField.containsKey(card.getName())){
            int num = cardsOnField.get(card.getName());
            num++;
            cardsOnField.put(card.getName(),num);
        }
        else{
            cardsOnField.put(card.getName(),1);
        }
    }

    public int getNumberOfSpeicialCard(Card card){
        return cardsOnField.get(card.getName());
    }

    public boolean deleteCard(Card card) {
        if (cards.contains(card)) {
            cards.remove(card);
            cardsOnField.remove(card.getName());
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
