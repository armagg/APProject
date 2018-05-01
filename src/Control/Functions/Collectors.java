package Control.Functions;

import Models.Battle;
import Models.Cards.Card;
import Models.Cards.Race;
import Models.Fields.Place;
import Models.Turn;

import java.util.ArrayList;
import java.util.Random;

public class Collectors {

    public ArrayList<Card> ChooseAllOfOwncard(Battle battle) {
        ArrayList<Card> cards = new ArrayList<>(20);
        if (battle.getTurn() == Turn.HUMAN) {
            cards.addAll(battle.getPlayerField().getMonsterField().getCards());
            cards.addAll(battle.getPlayerField().getHand().getCards());

        } else {
            cards.addAll(battle.getRivalField().getHand().getCards());
            cards.addAll(battle.getRivalField().getMonsterField().getCards());
        }
        return cards;

    }

    public ArrayList<Card> ToSpecialRace(Battle battle, Race race){
        ArrayList<Card> cards = new ArrayList<>();
        if(battle.getTurn() == Turn.HUMAN){
            for (Card card:battle.getPlayerField().getMonsterField().getCards()) {
                if(card.getRace() == race)
                    cards.add(card);
            }
        }
        else{
            for (Card card:battle.getRivalField().getMonsterField().getCards()) {
                if(card.getRace() == race)
                    cards.add(card);
            }
        }

        return cards;
    }

    private static ArrayList<Integer> randomCreater(Place place,)

    public ArrayList<Card> randomCards(Battle battle, int number, Place place) {
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<>(number);

        for (int i = 0; i < number; i++) {
            numbers.set(i, )
        }
    }
}
