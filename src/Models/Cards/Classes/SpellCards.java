package Models.Cards.Classes;

import Models.Battle;
import Models.Spell.Spell;

public abstract class SpellCards extends Card {
    public SpellCards(String name, int MP, SpellType spellType) {
        this.name = name;
        this.MP = MP;
        this.spellType = spellType;
        this.cost = 700 * MP;
    }
    private SpellType spellType;
    private String SpellDetails;

    public abstract void doSpell(Battle battle);

    public String getSpellDetails() {
        return SpellDetails;
    }

    public void setSpellDetails(String spellDetails) {
        SpellDetails = spellDetails;
    }

    public SpellType getSpellType() {
        return spellType;
    }

    public void setSpellType(SpellType spellType) {
        this.spellType = spellType;
    }

    public Spell getSpell() {
        return spell;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    Spell spell;
}
