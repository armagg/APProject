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

    public ArrayList<Card> ToSpecialRace(Battle battle, Race race) {
        ArrayList<Card> cards = new ArrayList<>();
        if (battle.getTurn() == Turn.HUMAN) {
            for (Card card : battle.getPlayerField().getMonsterField().getCards()) {
                if (card.getRace() == race)
                    cards.add(card);
            }
        } else {
            for (Card card : battle.getRivalField().getMonsterField().getCards()) {
                if (card.getRace() == race)
                    cards.add(card);
            }
        }

        return cards;
    }

    private static ArrayList<Integer> randomCreater(int max, int number) {
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<>(number);
        for (int i = 0; i < number; i++) {
            numbers.add(random.nextInt(max));

        }
        return numbers;
    }

    public ArrayList<Card> randomCards(Battle battle, int number, Place place) {
        ArrayList<Integer> numbers = new ArrayList<>(10);

        if (battle.getTurn() == Turn.HUMAN) {
            if (place == Place.DECK) {
                numbers = randomCreater(battle.getPlayerField().getDeck().getNumberOfCards(), number);
            }

            if (place == Place.GRAVEYARD)
                numbers = randomCreater(battle.getPlayerField().getGraveYard().GetNumberOfCards(), number);
            if (place == Place.HAND)
                numbers = randomCreater(battle.getPlayerField().getHand().GetNumberOfCards(), number);
            if (place == Place.MONSTERFIELD)
                numbers = randomCreater(battle.getPlayerField().getMonsterField().GetNumberOfCards(), number);
            if (place == Place.SPELLFIELD)
                numbers = randomCreater(battle.getPlayerField().getSpellField().GetNumberOfCards(), number);
        } else {
            if (place == Place.DECK) {
                numbers = randomCreater(battle.getRivalField().getDeck().getNumberOfCards(), number);
            }

            if (place == Place.GRAVEYARD)
                numbers = randomCreater(battle.getRivalField().getGraveYard().GetNumberOfCards(), number);
            if (place == Place.HAND)
                numbers = randomCreater(battle.getRivalField().getHand().GetNumberOfCards(), number);
            if (place == Place.MONSTERFIELD)
                numbers = randomCreater(battle.getRivalField().getMonsterField().GetNumberOfCards(), number);
            if (place == Place.SPELLFIELD)
                numbers = randomCreater(battle.getRivalField().getSpellField().GetNumberOfCards(), number);
        }

        ArrayList<Card> output = new ArrayList<>(number);
        for (int i : numbers) {
            //TODO
        }

        return output;
    }
}
