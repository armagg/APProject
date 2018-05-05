package Models.Fields;

import Models.Cards.Classes.Card;

public class Hand extends SuperField {

    private final int maxLength = 5;

    @Override
    public boolean addCard(Card card) {
        if (GetNumberOfCards() < maxLength) {
            addCard(card);
            return true;
        }
        return false;
    }




}
