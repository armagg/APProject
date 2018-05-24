package Models.Cards.Classes.monsterCards.generalCards;

import Control.Functions.Operators;
import Models.Battle;
import Models.Cards.Classes.Card;
import Models.Cards.Classes.Generals;
import Models.Cards.Classes.Monster;
import Models.Cards.Classes.Race;
import Models.Fields.Place;

import java.util.ArrayList;
import java.util.List;

public final class VampirePrince extends Generals {
    public VampirePrince() {
        super("Vampire Prince", 2000, 2200, 9, Race.VAMPIERS, false, false);
        setWillDetails("Darkness: Reduce all enemy monster cards’ AP by 200 and increase friendly" +
                "\n monster cards’ AP by 200");
        setBattleCryDetails("Fear: Return two random enemy monster cards from field to hand");
    }

    @Override
    public void doBattleCry(Battle battle) {
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(battle.getOtherField().getMonsterField().getRandomCard());
        cards.add(battle.getOtherField().getMonsterField().getRandomCard());
        Operators.replaceCards(battle.getOtherField(), cards, Place.MONSTERFIELD, Place.HAND);
    }

    @Override
    public void doWill(Battle battle) {
        List<Monster> enemyMonster = battle.getOtherField().getMonsterField().returnMonsters();
        List<Monster> monsters = battle.getCurrentField().getMonsterField().returnMonsters();
        if (!monsters.isEmpty()) {
            for (Monster monster : monsters) {
                monster.addAP(200);
            }
        }
        if (!enemyMonster.isEmpty()) {
            for (Monster monster : enemyMonster) {
                monster.reduceAP(200);
            }
        }

    }

}
