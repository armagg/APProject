package Models.Fields;

import Models.Cards.Card;

public class SpellField extends SuperField{
    private final int maxLength = 3;


    @Override
    public boolean addCard(Card card) {
        if (cards.size() < maxLength) {
            cards.add(card);
            return true;
        }
        return false;
    }

}
