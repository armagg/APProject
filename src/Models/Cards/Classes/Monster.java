package Models.Cards.Classes;

public class Monster extends Card{

    protected int HP;



    boolean hasAttacked = false;
    int AP;
    boolean isNimble;
    private boolean isAwake = false;
    boolean isDefender;
    protected MonsterType monsterType;

    WhichAura whichAura;

    public WhichAura getWhichAura() {
        return whichAura;
    }

    public void setWhichAura(WhichAura whichAura) {
        this.whichAura = whichAura;
    }
    @Override
    public String toString() {
        return name + ", AP:" + Integer.toString(getAP()) + ", HP: " + Integer.toString(getHP())
                + ", MP: " + Integer.toString(getMP()) + "\n" + "race: " + getRace() + "\n" +
                "type: " + getMonsterType();
    }


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

    public boolean isHasAttacked() {
        return hasAttacked;
    }

    public void setHasAttacked(boolean hasAttacked) {
        this.hasAttacked = hasAttacked;
    }




}
