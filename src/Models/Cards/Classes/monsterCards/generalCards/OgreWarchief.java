package Models.Cards.Classes.monsterCards.generalCards;

import Models.Battle;
import Models.Cards.Classes.Generals;
import Models.Cards.Classes.Monster;
import Models.Cards.Classes.Race;

import java.util.ArrayList;
import java.util.List;

public final class OgreWarchief extends Generals {
    public OgreWarchief() {
        super("Orge Warchief", 2500, 1500, 700, Race.ORGES, false, false);
        setBattleCryDetails("Titan’s Fall: Deal 400 damage to all enemy monster cards and player");
        setWillDetails("Last Order: Increase all friendly monster cards’ AP by 300");
    }

    @Override
    public void doBattleCry(Battle battle) {
        ArrayList<Monster> monsters = (ArrayList<Monster>) battle.getOtherField().getMonsterField().returnMonsters();
        if (!monsters.isEmpty()) {
            for (Monster monster : monsters) {
                monster.reduceHP(400);
            }
        }
        battle.getOtherHero().reduceHP(400);
    }

    @Override
    public void doWill(Battle battle) {
        List<Monster> monsters = battle.getCurrentField().getMonsterField().returnMonsters();
        if (!monsters.isEmpty()) {
            for (Monster monster : monsters) {
                monster.addAP(300);
            }
        }
    }
}
