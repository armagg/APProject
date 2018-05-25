package Models.Cards.Classes.spellCards;

import Models.Battle;
import Models.Cards.Classes.*;

import java.util.ArrayList;

public class TakeAllYouCan extends SpellCards {
    public TakeAllYouCan() {
        super("Take All You Can", 7, SpellType.AURA);
        setSpellDetails("Increase all friendly normal monster cards’ HP and AP by 400");
    }


    @Override
    public void negativeSpell(Battle battle) {
        for (Monster monster : battle.getOtherField().getMonsterField().returnMonsters()) {
            if (monster.getWhichAura() == WhichAura.TAKEALLYOUCAN) {
                monster.reduceAP(400);
                monster.reduceHP(400);
                monster.setWhichAura(null);
            }
        }

    }

    @Override
    public void doSpell(Battle battle) {
        ArrayList<Monster> monsters = new ArrayList<>(battle.getCurrentField().getMonsterField().returnMonsters());
        for (Monster monster : monsters) {
            if (monster.getMonsterType() == MonsterType.NORMAL) {
                monster.addAP(400);
                monster.addHP(400);
                monster.setWhichAura(WhichAura.TAKEALLYOUCAN);
            }
        }
    }


}
