package Models.Heroes;

public class Hero {
    private int HP;

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void changeHP(int amount){
        HP+=amount;
    }
}
