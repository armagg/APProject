package Models.Cards.Classes.spellCards;

import Models.Battle;
import Models.Cards.Classes.SpellCards;
import Models.Cards.Classes.SpellType;

public class BloodFeast extends SpellCards {
    public BloodFeast() {
        super("Blood Feast", 4, SpellType.INSTANT);
        setSpellDetails("Deal 500 damage to enemy player and heal your player for 500 HP");
    }

    @Override
    public void doSpell(Battle battle) {
        battle.getCurrentHero().addHP(500);
        battle.getOtherHero().reduceHP(500);
    }
}
