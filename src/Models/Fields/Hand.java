package Models.Fields;

import Models.Cards.Classes.Card;

public class Hand extends SuperField {



    @Override
    public boolean addCard(Card card) {
        cards.add(card);
        addToMap(card);
        return true;
    }




}
