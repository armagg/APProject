package Models.Cards.Classes;

import Models.Battle;
import Models.Spell.Spell;

public abstract class SpellCasters extends Monster {
    private boolean isSpellUsed = false;
    private String spellDetails;


    public SpellCasters(String name, int HP, int AP, int MP, Race race, boolean isNimble, boolean isDefender) {
        this.name = name;
        this.HP = HP;
        this.MP = MP;
        this.AP = AP;
        this.race = race;
        this.isNimble = isNimble;
        this.isDefender = isDefender;
        this.cost = MP * 500;
        monsterType = MonsterType.SPELLCASTER;
    }

    public abstract void DoSpell(Battle battle);

    @Override
    public String toString() {
        //TODO...
        return super.toString();
    }

    private Spell spell;

    public String getSpellDetails() {
        return spellDetails;
    }

    public void setSpellDetails(String spellDetails) {
        this.spellDetails = spellDetails;
    }

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
