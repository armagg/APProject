package Models.Cards.Classes.monsterCards.heroCards;

import Control.Functions.Operators;
import Models.Battle;
import Models.Cards.Classes.Card;
import Models.Cards.Classes.Heroes;
import Models.Cards.Classes.Monster;
import Models.Cards.Classes.Race;
import Models.Fields.Place;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cerberus extends Heroes {
    public Cerberus() {
        super("Cerberus", 3000, 2000, 10, Race.Demonic, true, false);
        setBattleCryDetails("Open the Gate: Draw three cards from deck to hand");
        setSpellDetails("Hellfire: Deal 300 damage to all enemy monster cards and Increase HP and AP of" +
                "\nall friendly monster cards by 300");
        setWillDetails("Revenge of the Two Heads: Send two random enemy monster cards from field to garveyard");
    }

    @Override
    public void doSpell(Battle battle) {
        List<Monster> enemyMonster = new ArrayList<>();
        List<Monster> monsters = new ArrayList<>();
        enemyMonster = battle.getOtherField().getMonsterField().returnMonsters();
        monsters = battle.getCurrentField().getMonsterField().returnMonsters();
        if (!monsters.isEmpty()) {
            for (Monster monster : monsters) {
                monster.addHP(300);
                monster.addHP(300);
            }
        }

        if (!enemyMonster.isEmpty()) {
            for (Monster monster : monsters) {
                monster.reduceHP(300);
            }
        }

    }

    @Override
    public void doWill(Battle battle) {
        Random random = new Random();
        int number = battle.getOtherField().getMonsterField().getNumberOfCards();
        int rand1 = random.nextInt(number);
        int rand2 = random.nextInt(number);
        while (rand1 == rand2) {
            rand2 = random.nextInt(number);
        }
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(battle.getOtherField().getMonsterField().getCards().get(rand1));
        cards.add(battle.getOtherField().getMonsterField().getCards().get(rand2));
        Operators.replaceCards(battle.getOtherField(), cards, Place.MONSTERFIELD, Place.GRAVEYARD);
    }

    @Override
    public void doBattleCry(Battle battle) {
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(battle.getCurrentField().getDeck().getRandomCard());
        cards.add(battle.getCurrentField().getDeck().getRandomCard());
        cards.add(battle.getCurrentField().getDeck().getRandomCard());
        for (Card card : cards) {
            battle.getCurrentField().getHand().addCard(card);
        }
    }
}
