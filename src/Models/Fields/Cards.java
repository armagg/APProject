package Models.Fields;

import Models.Cards.Card;

import java.util.ArrayList;

interface Cards {

    int test = 0;
     ArrayList<Card> cards = new ArrayList<>(5);

     default ArrayList<Card> getCards(){
         return cards;
     }

     default void addCard(Card card){
         cards.add(card);
     }

     default boolean deleteCard(Card card){
         if (cards.contains(card)){
             cards.remove(card);
             return true;

         }
         return false;
     }
}