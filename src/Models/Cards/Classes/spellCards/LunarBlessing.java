package Models.Cards.Classes.spellCards;

import Models.Battle;
import Models.Cards.Classes.SpellCards;
import Models.Cards.Classes.SpellType;

public class LunarBlessing extends SpellCards {
    public LunarBlessing() {
        super("Lunar Blessing", 6, SpellType.AURA);
        setSpellDetails("Increase AP and HP of friendly Elven monster cards by 300");
    }

    @Override
    public void doSpell(Battle battle) {

    }
}
