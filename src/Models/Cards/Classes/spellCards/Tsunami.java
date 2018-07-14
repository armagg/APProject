package Models.Cards.Classes.spellCards;

import Models.Battle;
import Models.Cards.Classes.Monster;
import Models.Cards.Classes.Race;
import Models.Cards.Classes.SpellCards;
import Models.Cards.Classes.SpellType;

import java.util.ArrayList;

public class Tsunami extends SpellCards {
    public Tsunami() {
        super("Tsunami", 6, SpellType.INSTANT);
        setSpellDetails("Deal 500 damage to all non-Atlantian monster cards on both sides of field");
    }

    @Override
    public void negativeSpell(Battle battle) {

    }

    @Override
    public void doSpell(Battle battle) {
        ArrayList<Monster> monsters = new ArrayList<>();
        monsters.addAll(battle.getCurrentField().getMonsterField().returnMonsters());
        monsters.addAll(battle.getOtherField().getMonsterField().returnMonsters());
        for (Monster monster : monsters) {
            if (monster.getRace() != Race.Atlantians) {
                monster.reduceHP(500);
            }
        }
    }
}
