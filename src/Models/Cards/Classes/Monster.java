package Models.Cards.Classes;

public class Monster extends Card{

    protected int HP;

    int AP;
    boolean isNimble;
    private boolean isAwake;
    boolean isDefender;
    protected MonsterType monsterType;


    public MonsterType getMonsterType() {
        return monsterType;
    }

    public void setMonsterType(MonsterType monsterType) {
        this.monsterType = monsterType;
    }

    public int getHP() {
        return HP;
    }

    public void addHP(int HP) {
        this.HP = HP;
    }

    public void reduceHP(int amount) {
        HP -= amount;
    }

    public int getAP() {
        return AP;
    }

    public void addAP(int AP) {
        if (AP >= 0)
            this.AP += AP;

    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void setAP(int AP) {
        this.AP = AP;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public Race getRace() {
        return race;
    }


    public void reduceAP(int amount) {
        if (amount >= 0)
            this.AP -= amount;

    }

    public boolean isNimble() {
        return isNimble;
    }

    public void setNimble(boolean Nimble) {
        isNimble = Nimble;
    }

    public boolean isAwake() {
        return isAwake;
    }

    public void setAwake(boolean awake) {
        isAwake = awake;
    }

    public boolean isDefender() {
        return isDefender;
    }

    public void setDefender(boolean defender) {
        isDefender = defender;
    }
}
