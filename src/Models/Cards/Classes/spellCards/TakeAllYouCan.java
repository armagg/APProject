package Models.Cards.Classes.spellCards;

import Models.Battle;
import Models.Cards.Classes.Monster;
import Models.Cards.Classes.MonsterType;
import Models.Cards.Classes.SpellCards;
import Models.Cards.Classes.SpellType;

import java.util.ArrayList;

public class TakeAllYouCan extends SpellCards {
    public TakeAllYouCan() {
        super("Take All You Can", 7, SpellType.AURA);
        setSpellDetails("Increase all friendly normal monster cards’ HP and AP by 400");
    }


    @Override
    public void doSpell(Battle battle) {
        ArrayList<Monster> monsters = new ArrayList<>(battle.getCurrentField().getMonsterField().returnMonsters());
        for (Monster monster : monsters) {
            if (monster.getMonsterType() == MonsterType.NORMAL) {
                monster.addAP(400);
                monster.addHP(400);
            }
        }
    }


}
