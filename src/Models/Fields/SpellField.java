package Models.Fields;

import Models.Cards.Classes.Card;

public class SpellField extends SuperField{
    private final int maxLength = 3;


    @Override
    public boolean addCard(Card card) {
        if (GetNumberOfCards() < maxLength) {
            addCard(card);
            return true;
        }
        return false;
    }

}
