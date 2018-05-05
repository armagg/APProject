package Models.Fields;

import Models.Cards.Classes.Card;

import java.util.ArrayList;

public class SuperField {

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    private ArrayList<Card> cards = new ArrayList<>(5);

    public int GetNumberOfCards() {
        return cards.size();
    }

    public ArrayList<Card> getCards(){
        return cards;
    }

    public boolean addCard(Card card) {
        cards.add(card);
        return true;
    }

    public boolean deleteCard(Card card){
        if (cards.contains(card)){
            cards.remove(card);
            return true;

        }
        return false;
    }

     /*int cardCounterGetter();
     int maxLengthGetter();
*/

}
