package Models.Cards.Classes;

public class Normal extends Monster {
    public Normal() {
    }

    public Normal(String name, int Hp, int AP, int MP, Race race, boolean isNimble, boolean isDefender) {
        this.MP = MP;
        this.AP = AP;
        this.HP = Hp;
        this.race = race;
        this.isNimble = isNimble;
        this.isDefender = isDefender;
        cost = MP * 300;
        this.name = name;
        setMonsterType(MonsterType.NORMAL);
    }

    @Override
    public String toString() {
        //TODO...
        return super.toString();
    }
}
