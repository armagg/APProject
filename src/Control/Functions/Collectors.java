package Control.Functions;

import Models.Battle;
import Models.Cards.Classes.Card;
import Models.Cards.Classes.Monster;
import Models.Cards.Classes.Race;
import Models.Fields.Place;
import Models.Fields.SuperField;
import Models.Spell.Player;
import Models.Turn;
import view.actionInGame.SelectFrom;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Collectors {

    static public ArrayList<Card> ChooseAllOfOwncard(Battle battle) {
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

    public static ArrayList<Card> selectFrom(Battle battle, Place place, int number) {
        SelectFrom select = new SelectFrom();
        List<Card> list = null;
        try {
            list = battle.getCurrentField().returnField(place).getCards();
        } catch (Exception e) {
            e.printStackTrace();
        }
        select.showCards(list);
        List<Integer> numbers = select.whichNumbers(number);
        List<Card> cards = new ArrayList<>(number);
        for (int i = 0; i < number; i++) {
            cards.add(list.get(numbers.get(i)));//TODO: maybe is wrong.
        }

        return (ArrayList<Card>) cards;
    }

    static public ArrayList<Card> ToSpecialRace(Battle battle, Race race, Player player) {
        ArrayList<Card> cards = new ArrayList<>();
        ArrayList<Card> cards1 = new ArrayList<>();
        if ((battle.getTurn() == Turn.HUMAN && player == Player.hasTurn) || (battle.getTurn() == Turn.RIVAL && player == Player.notHasTurn)) {
            for (Card card : battle.getPlayerField().getMonsterField().getCards()) {
                if (card.getRace() == race)
                    cards.add(card);
            }
        } else if ((battle.getTurn() == Turn.HUMAN && player == Player.notHasTurn) || (battle.getTurn() == Turn.RIVAL && player == Player.hasTurn)) {
            for (Card card : battle.getRivalField().getMonsterField().getCards()) {
                if (card.getRace() == race)
                    cards.add(card);
            }
        }

        return cards;
    }

    private static ArrayList<Integer> randomCreator(int max, int number) {
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<>(number);
        for (int i = 0; i < number; i++) {
            numbers.add(random.nextInt(max));

        }
        return numbers;
    }

    private static ArrayList<Card> selectCards(ArrayList<Integer> numbers, SuperField field) {
        ArrayList<Card> output = new ArrayList<>();
        for (int i : numbers) {
            output.add(field.getCards().get(i));
        }
        return output;
    }

    static public ArrayList<Card> randomCards(Battle battle, int number, Place place) {
        ArrayList<Integer> numbers;
        ArrayList<Card> output;
        if (battle.getTurn() == Turn.HUMAN) {
            numbers = randomCreator(battle.getPlayerField().returnField(place).getNumberOfCards(), number);
            output = selectCards(numbers, battle.getPlayerField().returnField(place));
         /*   if (place == Place.DECK) {
                numbers = randomCreator(battle.getPlayerField().getDeck().getNumberOfCards(), number);
                output = selectCards(numbers, battle.getPlayerField().returnField(Place.DECK));
            }

            if (place == Place.GRAVEYARD) {
                numbers = randomCreator(battle.getPlayerField().getGraveYard().getNumberOfCards(), number);
                output = selectCards(numbers, battle.getPlayerField().returnField(Place.GRAVEYARD));
            }
            if (place == Place.HAND) {
                numbers = randomCreator(battle.getPlayerField().getHand().getNumberOfCards(), number);
                output = selectCards(numbers, battle.getPlayerField().returnField(Place.HAND));
            }
            if (place == Place.MONSTERFIELD) {
                numbers = randomCreator(battle.getPlayerField().getMonsterField().getNumberOfCards(), number);
                output = selectCards(numbers, battle.getPlayerField().returnField(Place.MONSTERFIELD));
            }
            if (place == Place.SPELLFIELD) {
                numbers = randomCreator(battle.getPlayerField().getSpellField().getNumberOfCards(), number);
                output = selectCards(numbers, battle.getPlayerField().returnField(Place.SPELLFIELD));
            }*/
        } else {
            numbers = randomCreator(battle.getRivalField().returnField(place).getNumberOfCards(), number);
            output = selectCards(numbers, battle.getPlayerField().returnField(place));

            /*if (place == Place.DECK) {
                numbers = randomCreator(battle.getRivalField().getDeck().getNumberOfCards(), number);
                output = selectCards(numbers, battle.getRivalField().returnField(Place.DECK));
            }

            if (place == Place.GRAVEYARD) {
                numbers = randomCreator(battle.getRivalField().getGraveYard().getNumberOfCards(), number);
                output = selectCards(numbers, battle.getRivalField().returnField(Place.GRAVEYARD));
            }
            if (place == Place.HAND) {
                numbers = randomCreator(battle.getRivalField().getHand().getNumberOfCards(), number);
                output = selectCards(numbers, battle.getRivalField().returnField(Place.HAND));
            }
            if (place == Place.MONSTERFIELD) {
                numbers = randomCreator(battle.getRivalField().getMonsterField().getNumberOfCards(), number);
                output = selectCards(numbers, battle.getRivalField().returnField(Place.MONSTERFIELD));
            }
            if (place == Place.SPELLFIELD) {
                numbers = randomCreator(battle.getRivalField().getSpellField().getNumberOfCards(), number);
                output = selectCards(numbers, battle.getRivalField().returnField(Place.SPELLFIELD));
            }*/
        }

        return output;
    }

    static public ArrayList<Card> OwnSpellCollector(Battle battle, Turn turn, Place originPlace) {
        if(turn == Turn.HUMAN)
            return battle.getPlayerField().returnField(originPlace).getCards();
        else
            return battle.getRivalField().returnField(originPlace).getCards();
    }

    static public ArrayList<Card> RivalSpellCollector(Battle battle, Turn turn, Place originPlace) {
        if(turn == Turn.RIVAL)
            return battle.getPlayerField().returnField(originPlace).getCards();
        else
            return battle.getRivalField().returnField(originPlace).getCards();
    }

    public static List<Card> enemyDefendersOfMonsterField(Battle battle) {
        ArrayList<Card> cards = new ArrayList<>();
        Monster monster;
        if(battle.getTurn() == Turn.HUMAN){
            for (Card card:battle.getRivalField().getMonsterField().getCards()) {
                monster = (Monster) card;
                if(monster.isDefender())
                    cards.add(monster);
            }
        }
        else{
            for (Card card:battle.getPlayerField().getMonsterField().getCards()) {
                monster = (Monster) card;
                if(monster.isDefender())
                    cards.add(monster);
            }
        }
        return cards;
    }
}