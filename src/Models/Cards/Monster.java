package Models.Cards;

public class Monster extends Card{
    private int HP;
    private int AP;
    RaceOfArcadia raceOfArcadia;
    Race race;
    RaceOfDemonata raceOfDemonata;
    private boolean isRimble;
    private boolean isAwake;
    private boolean isDefender;

    public int getHP() {
        return HP;
    }

    public void addHP(int HP) {
        this.HP = HP;
    }

    public void reduceHp(int amount) {
        HP -= amount;
    }

    public int getAP() {
        return AP;
    }

    public void addAP(int AP) {
        if (AP >= 0)
            this.AP += AP;

    }

    public RaceOfArcadia getRaceOfArcadia() {
        return raceOfArcadia;
    }

    public Race getRace() {
        return race;
    }

    public RaceOfDemonata getRaceOfDemonata() {
        return raceOfDemonata;
    }

    public void reduceAP(int amount) {
        if (amount >= 0)
            this.AP -= amount;

    }

    public boolean isRimble() {
        return isRimble;
    }

    public void setRimble(boolean rimble) {
        isRimble = rimble;
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
