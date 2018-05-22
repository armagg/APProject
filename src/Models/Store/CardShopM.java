package Models.Store;

import Control.inShop.StaticFunctiontoHandle;
import Models.Cards.Classes.Card;

import java.util.ArrayList;

public class CardShopM extends Shop {
    private ArrayList<Card> cards;

    public CardShopM(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public ArrayList<Card> getCards() {

        return cards;
    }

    public void addCard(Card card){
        StaticFunctiontoHandle.add(numbersOfThing, card);
        cards.add(card);
    }

    public void remove(Card card){
        StaticFunctiontoHandle.remove(numbersOfThing, card);
        if(cards.contains(card))
            cards.remove(card);
    }

}
