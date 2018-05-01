package Models.Fields;


import Models.Cards.Card;

public class Deck implements Cards {

    private final int maxLength = 30;
    private final int minLength = 25;

    @Override
    public boolean addCard(Card card) {
        if (cards.size() < maxLength) {
            cards.add(card);
            return true;
        }

        return false;
    }

    @Override
    public boolean deleteCard(Card card) {
        if (cards.size() > minLength) {
            cards.remove(card);
            return true;

        }
        return false;
    }


    public int getNumberOfCards() {
        return cards.size();
    }


}
