package Models.Cards.Classes.spellCards;

import Models.Battle;
import Models.Cards.Classes.SpellCards;
import Models.Cards.Classes.SpellType;

public class Tsunami extends SpellCards {
    public Tsunami() {
        super("Tsunami", 6, SpellType.INSTANT);
        setSpellDetails("Deal 500 damage to all non-Atlantian monster cards on both sides of field");
    }

    @Override
    public void doSpell(Battle battle) {

    }
}
