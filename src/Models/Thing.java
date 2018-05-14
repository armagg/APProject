package Models;

public abstract class Thing {

    protected int cost;

    protected String name;

    private String detail;

    @Override
    public String toString() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
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
