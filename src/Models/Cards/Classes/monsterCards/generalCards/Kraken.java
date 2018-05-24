package Models.Cards.Classes.monsterCards.generalCards;

import Control.Functions.AddOrReduce;
import Control.Functions.Operators;
import Models.Battle;
import Models.Cards.Classes.*;
import Models.Fields.Place;

import java.util.ArrayList;

public final class Kraken extends Generals {
    public Kraken() {
        super("Kraken", 1800, 2200, 8, Race.Atlantians, false, false);
        setBattleCryDetails("Titan’s Presence: Return one random enemy monster card from field to hand and reduce " +
                "\n" +
                "all enemy monsters’ AP by 200");
        setWillDetails("Titan’s Fall: Deal 400 damage to all enemy monster cards and player");
    }

    @Override
    public void doBattleCry(Battle battle) {
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(battle.getOtherField().getMonsterField().getRandomCard());
        Operators.replaceCards(battle.getOtherField(), cards, Place.MONSTERFIELD, Place.HAND);
        ArrayList<Monster> monsters = new ArrayList<>();
        cards.addAll(battle.getOtherField().getMonsterField().returnMonsters());
        if (!monsters.isEmpty()) {
            for (Monster monster : monsters) {
                monster.reduceAP(200);
            }
        }
    }

    @Override
    public void doWill(Battle battle) {
        Operators.CardsPowerChanger((ArrayList<Monster>) battle.getOtherField().getMonsterField().returnMonsters(),
                400, FunctionTargetKind.HP, AddOrReduce.REDUCE);
    }
}
