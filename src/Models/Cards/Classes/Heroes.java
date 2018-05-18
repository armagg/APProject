package Models.Cards.Classes;

import Models.Battle;
import Models.Spell.Spell;

public abstract class Heroes extends Monster {
    private boolean isSpellUsed = false;

    public Heroes() {
    }

    public Heroes(String name, int HP, int AP, int MP, Race race, boolean isNimble, boolean isDefender) {
        this.name = name;
        this.HP = HP;
        this.MP = MP;
        this.AP = AP;
        this.race = race;
        this.isNimble = isNimble;
        this.isDefender = isDefender;
        this.cost = MP * 1000;
        monsterType = MonsterType.HERO;
    }

    abstract public boolean doSpell(Battle battle);

    abstract public boolean doWill(Battle battle);

    abstract public boolean doBattleCry(Battle battle);

    @Override
    public String toString() {
        //TODO...
        return super.toString();
    }

    public String getSpellDetails() {
        return spellDetails;
    }

    public void setSpellDetails(String spellDetails) {
        this.spellDetails = spellDetails;
    }

    private Spell spell;
    private Spell will;
    private Spell BattleCry;
    private String spellDetails, willDetails, battleCryDetails;

    public String getWillDetails() {
        return willDetails;
    }

    public void setWillDetails(String willDetails) {
        this.willDetails = willDetails;
    }

    public String getBattleCryDetails() {
        return battleCryDetails;
    }

    public void setBattleCryDetails(String battleCryDetails) {
        this.battleCryDetails = battleCryDetails;
    }

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
