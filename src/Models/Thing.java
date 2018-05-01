package Models;

public abstract class Thing {

    protected int cost;
    protected int MP;
    protected String name;

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getMP() {
        return MP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Thing thing) {
        return thing.getName().equals(name);
    }


}
