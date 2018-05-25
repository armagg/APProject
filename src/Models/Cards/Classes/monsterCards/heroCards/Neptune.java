package Models.Cards.Classes.monsterCards.heroCards;

import Control.Functions.Operators;
import Models.Battle;
import Models.Cards.Classes.*;
import Models.Fields.Place;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Neptune extends Heroes {
    public Neptune() {
        super("Neptune", 2200, 2500, 10, Race.Atlantians, true, false);
        setBattleCryDetails("Call to Arms: Select and move a card from hand to play field");
        setSpellDetails("Trident Beam: Deal 800 damage to three random enemy monster cards " +
                "or player");
        setWillDetails("Ocean’s Cry: Deal 400 damage to all enemy monster cards and player" +
                " and increase" +
                "\nall friendly Atlantian monster cards’ AP by 500");
    }

    @Override
    public void doSpell(Battle battle) {
        Random random = new Random();
        int number = battle.getOtherField().getMonsterField().getNumberOfCards();
        if (number == 0) {
            battle.getOtherHero().reduceHP(800);
        } else if (number == 1) {
            battle.getOtherHero().reduceHP(800);
            battle.getOtherField().getMonsterField().returnMonsters().get(0).reduceHP(800);
        } else if (number == 2) {
            battle.getOtherHero().reduceHP(800);
            battle.getOtherField().getMonsterField().returnMonsters().get(0).reduceHP(800);
            battle.getOtherField().getMonsterField().returnMonsters().get(1).reduceHP(800);
        } else {
            if (random.nextBoolean()) {
                battle.getOtherHero().reduceHP(800);
                int rand = random.nextInt(number);
                int rand2 = random.nextInt(number);
                while (rand == rand2) {
                    rand2 = random.nextInt(number);
                }
                battle.getOtherField().getMonsterField().returnMonsters().get(rand).reduceHP(800);
                battle.getOtherField().getMonsterField().returnMonsters().get(rand2).reduceHP(800);
            } else {
                int rand = random.nextInt(number);
                int rand2 = random.nextInt(number);
                int rand1 = random.nextInt(number);
                while (rand == rand1 || rand1 == rand2) {
                    rand1 = random.nextInt(number);
                    rand2 = random.nextInt(number);
                }
                battle.getOtherField().getMonsterField().returnMonsters().get(rand).reduceHP(800);
                battle.getOtherField().getMonsterField().returnMonsters().get(rand2).reduceHP(800);
                battle.getOtherField().getMonsterField().returnMonsters().get(rand1).reduceHP(800);

            }
        }
    }

    @Override
    public void doWill(Battle battle) {
        battle.getOtherHero().reduceHP(400);
        List<Monster> monsters = battle.getOtherField().getMonsterField().returnMonsters();
        if (!monsters.isEmpty()) {
            for (Monster monster : monsters) {
                monster.reduceHP(400);
            }
        }

        monsters.clear();
        monsters = battle.getCurrentField().getMonsterField().returnMonsters();
        if (!monsters.isEmpty()) {
            for (Monster monster : monsters) {
                if (monster.getRace() == Race.Atlantians) {
                    monster.addAP(500);
                }
            }
        }
    }

    @Override
    public void doBattleCry(Battle battle) {
        ArrayList<Card> cards = battle.getCurrentField().getHand().getCards();
        Scanner scanner = new Scanner(System.in);
        System.out.println("choose which card you want to put in field :");
        int i = 1;
        for (Card card : cards) {
            if (card instanceof SpellCards) {
                SpellCards spell = (SpellCards) card;
                System.out.println(Integer.toString(i) + ".:spell : " + spell);
            } else if (card instanceof Monster) {
                Monster monster = (Monster) card;
                System.out.println(Integer.toString(i) + ". :monster : " + monster);
            }
            i++;
        }
        ArrayList<Card> forTransfer = new ArrayList<>();
        int index = scanner.nextInt();
        try {
            forTransfer.add(cards.get(index));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {


            if (cards.get(index) instanceof SpellCards)
                Operators.replaceCards(battle.getCurrentField(), forTransfer, Place.HAND, Place.SPELLFIELD);
            else if (cards.get(index) instanceof Monster)
                Operators.replaceCards(battle.getCurrentField(), forTransfer, Place.HAND, Place.MONSTERFIELD);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
