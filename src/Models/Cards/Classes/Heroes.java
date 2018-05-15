package Models.Cards.Classes;

import Models.Spell.Spell;

public class Heroes extends Monster {
    private boolean isSpellUsed = false;

    Spell spell;
    Spell will;
    Spell BattleCry;

    public Spell getSpell() {
        return spell;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    public Spell getWill() {
        return will;
    }

    public void setWill(Spell will) {
        this.will = will;
    }

    public Spell getBattleCry() {
        return BattleCry;
    }

    public void setBattleCry(Spell battleCry) {
        BattleCry = battleCry;
    }

    public boolean isInGraveYard() {
        return inGraveYard;
    }

    public void setInGraveYard(boolean inGraveYard) {
        this.inGraveYard = inGraveYard;
    }

    private boolean inGraveYard;

    public boolean isSpellUsed() {
        return isSpellUsed;
    }

    public void setSpellUsed(boolean spellUsed) {
        isSpellUsed = spellUsed;
    }
}
