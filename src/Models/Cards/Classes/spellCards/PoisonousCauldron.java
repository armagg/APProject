package Models.Cards.Classes.spellCards;

import Models.Battle;
import Models.Cards.Classes.SpellCards;
import Models.Cards.Classes.SpellType;

public class PoisonousCauldron extends SpellCards {
    public PoisonousCauldron() {
        super("Poisonous Cauldron", 4, SpellType.CONTINOUS);
        setSpellDetails("Deal 100 damage to all enemy monster cards and enemy player");
    }

    @Override
    public void doSpell(Battle battle) {

    }
}
