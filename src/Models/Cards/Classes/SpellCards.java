package Models.Cards.Classes;

import Models.Spell.Spell;

public class SpellCards extends Card {
    public Spell getSpell() {
        return spell;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    Spell spell;
    private SpellType spellType;


    public SpellType getSpellType() {
        return spellType;
    }

    public void setSpellType(SpellType spellType) {
        this.spellType = spellType;
    }
}
