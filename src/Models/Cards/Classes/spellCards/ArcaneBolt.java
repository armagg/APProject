package Models.Cards.Classes.spellCards;

import Models.Battle;
import Models.Cards.Classes.SpellCards;
import Models.Cards.Classes.SpellType;

public class ArcaneBolt extends SpellCards {
    public ArcaneBolt() {
        super("Arcane Bolt", 5, SpellType.INSTANT);
        setSpellDetails("Deal 500 damage to enemy player and select and move an enemy spell" +
                "\ncard from field to graveyard");
    }

    @Override
    public void doSpell(Battle battle) {

    }
}
