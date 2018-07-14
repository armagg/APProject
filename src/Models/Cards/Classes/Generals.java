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
        if (isNimble) {
            setAwake(true);
        }
    }

    public abstract void doBattleCry(Battle battle);

    @Override
    public String toString() {
        //TODO...
        return "";
    }

    public abstract void doWill(Battle battle);


    public void setWillDetails(String willDetails) {
        this.willDetails = willDetails;
    }

    public void setBattleCryDetails(String battleCryDetails) {
        this.battleCryDetails = battleCryDetails;
    }

    public String getWillDetails() {
        return willDetails;
    }

    public Spell getWill() {
        return will;
    }

    private Spell battleCry;

    private Spell will;

    public String getBattleCryDetails() {
        return battleCryDetails;
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
