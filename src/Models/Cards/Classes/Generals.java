package Models.Cards.Classes;

import Models.Battle;
import Models.Spell.Spell;

public abstract class Generals extends Monster {
    private String willDetails, battleCryDetails;

    public Generals(String name, int HP, int AP, int MP, Race race, boolean isNimble, boolean isDefender) {
        this.name = name;
        this.HP = HP;
        this.MP = MP;
        this.AP = AP;
        this.race = race;
        this.isNimble = isNimble;
        this.isDefender = isDefender;
        this.cost = MP * 700;
        monsterType = MonsterType.GENERAL;
    }

    public abstract void doBattleCry(Battle battle);

    public abstract void doWill(Battle battle);


    public String getWillDetails() {
        return willDetails;
    }

    @Override
    public String toString() {
        //TODO...
        return "";
    }

    public Spell getWill() {
        return will;
    }

    private Spell battleCry;

    public void setWillDetails(String willDetails) {
        this.willDetails = willDetails;
    }

    private Spell will;

    public String getBattleCryDetails() {
        return battleCryDetails;
    }

    public void setBattleCryDetails(String battleCryDetails) {
        this.battleCryDetails = battleCryDetails;
    }

    public void setWill(Spell will) {
        this.will = will;
    }

    public Spell getBattleCry() {
        return battleCry;
    }

    public void setBattleCry(Spell battleCry) {
        this.battleCry = battleCry;
    }
}
