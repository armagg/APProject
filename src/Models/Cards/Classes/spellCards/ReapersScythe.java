package Models.Cards.Classes.spellCards;

import Models.Battle;
import Models.Cards.Classes.SpellCards;
import Models.Cards.Classes.SpellType;

public class ReapersScythe extends SpellCards {
    public ReapersScythe() {
        super("Reaper's Scythe", 4, SpellType.INSTANT);
        setSpellDetails("Send an enemy monster or spell card from field to graveyard");
    }

    @Override
    public void doSpell(Battle battle) {

    }
}
