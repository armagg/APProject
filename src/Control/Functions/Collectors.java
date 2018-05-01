package Control.Functions;

import Models.Cards.Card;
import Models.Cards.Monster;
import Models.Cards.Race;
import Models.Fields.Field;

import java.util.ArrayList;

public class Collectors {

public ArrayList<Card> ToSpecialRace(Field field, Race race){
    ArrayList<Card> cards = new ArrayList<>();
    for (Card card:field.getMonsterField().getCards()) {
        if(card.getRace() == race){
            cards.add(card);
        }
    }

    return cards;
}
}
