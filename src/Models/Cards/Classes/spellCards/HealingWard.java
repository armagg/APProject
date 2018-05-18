package Models.Cards.Classes.spellCards;

import Models.Battle;
import Models.Cards.Classes.SpellCards;
import Models.Cards.Classes.SpellType;

public class HealingWard extends SpellCards {
    public HealingWard() {
        super("Healing Ward", 5, SpellType.CONTINOUS);
        setSpellDetails("Increase all friendly monster cards’ HP by 200");
    }

    @Override
    public void doSpell(Battle battle) {

    }
}
