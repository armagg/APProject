package Models.Cards.Classes.spellCards;

import Models.Battle;
import Models.Cards.Classes.SpellCards;
import Models.Cards.Classes.SpellType;

public class ThrowingKnives extends SpellCards {
    public ThrowingKnives() {
        super("Throwing Knives", 3, SpellType.INSTANT);
        setSpellDetails("Deal 500 damage to a selected enemy monster card on the field or to enemy player");
    }

    @Override
    public void doSpell(Battle battle) {

    }
}
