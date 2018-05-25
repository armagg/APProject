package Models.Cards.Classes.monsterCards.heroCards;

import Control.Functions.Operators;
import Models.Battle;
import Models.Cards.Classes.*;
import Models.Fields.Place;

import java.util.ArrayList;
import java.util.List;

public class Igneel extends Heroes {
    public Igneel() {
        super("Ignell", 4000, 800, 10, Race.DragonBreed, false, false);
        setWillDetails("King’s Wail: Decrease all enemy monster cards’ AP by 400");
        setSpellDetails("King’s Wing Slash: Deal 600 damage to all enemy monster cards and player");
        setBattleCryDetails("King’s Grace: Send all non-Hero monster cards on both sides of field to their graveyards");
    }

    @Override
    public void doSpell(Battle battle) {
        battle.getOtherHero().reduceHP(600);
        List<Monster> monsters = battle.getOtherField().getMonsterField().returnMonsters();
        if (!monsters.isEmpty()) {
            for (Monster monster : monsters) {
                monster.reduceHP(600);
            }
        }
        setSpellUsed(true);
    }

    @Override
    public void doWill(Battle battle) {
        List<Monster> monsters = new ArrayList<>();
        monsters.addAll(battle.getOtherField().getMonsterField().returnMonsters());
        if (!monsters.isEmpty()) {
            for (Monster monster : monsters) {
                monster.reduceAP(400);
            }
        }
    }

    @Override
    public void doBattleCry(Battle battle) {
        ArrayList<Monster> cards = (ArrayList<Monster>) battle.getCurrentField().getMonsterField().returnMonsters();
        ArrayList<Card> forReplace = new ArrayList<>();
        if (!cards.isEmpty()) {
            for (Monster card : cards) {
                if (card.getMonsterType() != MonsterType.HERO) {
                    forReplace.add(card);
                }
            }
        }
        Operators.replaceCards(battle.getCurrentField(), forReplace, Place.MONSTERFIELD, Place.GRAVEYARD);
        forReplace.clear();
        cards.clear();
        cards = (ArrayList<Monster>) battle.getOtherField().getMonsterField().returnMonsters();
        if (!cards.isEmpty()) {
            for (Monster monster : cards) {
                if (monster.getMonsterType() != MonsterType.HERO) {
                    forReplace.add(monster);
                }

            }
        }

        Operators.replaceCards(battle.getOtherField(), forReplace, Place.MONSTERFIELD, Place.GRAVEYARD);

    }
}
