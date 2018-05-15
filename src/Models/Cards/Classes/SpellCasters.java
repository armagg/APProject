package Models.Cards.Classes;

import Models.Spell.Spell;

public class SpellCasters extends Monster {
    private boolean isSpellUsed = false;

    Spell spell;

    public Spell getSpell() {
        return spell;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    public boolean isSpellUsed() {
        return isSpellUsed;
    }

    public void setSpellUsed(boolean spellUsed) {
        isSpellUsed = spellUsed;
    }
}
