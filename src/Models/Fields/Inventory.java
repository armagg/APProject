package Models.Fields;

import Control.inShop.StaticFunctiontoHandle;
import Models.Cards.Classes.Card;

import java.util.HashMap;

public class Inventory extends SuperField{
    private HashMap<String , Integer> numbersOfCards = new HashMap<>();

    public HashMap<String, Integer> getNumbersOfCards() {
        return numbersOfCards;
    }

    public boolean addCard(Card card, int i) {
        for(int j = 0 ; j < i ; j++) {
            StaticFunctiontoHandle.add(numbersOfCards, card);
        }
        return super.addCard(card);
    }


    public boolean deleteCard(Card card , int i) {
        for(int j = 0; j < i ; j++) {
            StaticFunctiontoHandle.remove(numbersOfCards, card);
        }
        return super.deleteCard(card);
    }
}
