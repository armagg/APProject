package Models.Cards.Classes.monsterCards.heroCards;

import Models.Battle;
import Models.Cards.Classes.Heroes;
import Models.Cards.Classes.Monster;
import Models.Cards.Classes.Race;

import java.util.List;

public final class Luthian extends Heroes {
    public Luthian() {
        super("Luthian", 2500, 2000, 9, Race.Elves, false, false);
        setSpellDetails("Divine Blessing: Increase HP of a friendly monster card or player by 2500");
        setWillDetails("Burst of Light: Increase HP of all friendly monster cards and player by 500 " +
                "and increase " +
                "\nAP of all friendly monster cards by 200");
        setBattleCryDetails("Revive Allies: move two random cards from your graveyard to hand");
    }

    @Override
    public void doSpell(Battle battle) {
        battle.getCurrentHero().addHP(2500);
        List<Monster> monsters = battle.getCurrentField().getMonsterField().returnMonsters();
        if (!monsters.isEmpty()) {
            for (Monster monster : monsters) {
                monster.addHP(2500);
            }
        }
    }

    @Override
    public void doWill(Battle battle) {
        battle.getCurrentHero().addHP(500);
        List<Monster> monsters = battle.getCurrentField().getMonsterField().returnMonsters();
        if (!monsters.isEmpty()) {
            for (Monster monster : monsters) {
                monster.addHP(500);
                monster.addAP(200);
            }
        }
        setSpellUsed(true);
    }

    @Override
    public void doBattleCry(Battle battle) {
        //TODO...felan in kolli kar dare.
    }
}
