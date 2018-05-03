package Models.Fields;

import Models.Cards.Classes.Card;

import java.util.ArrayList;

interface Cards {


    ArrayList<Card> cards = new ArrayList<>(5);

    default int GetNumberOfCards() {
        return cards.size();
    }
     default ArrayList<Card> getCards(){
         return cards;
     }

    default boolean addCard(Card card) {
         cards.add(card);
        return true;
     }

     default boolean deleteCard(Card card){
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