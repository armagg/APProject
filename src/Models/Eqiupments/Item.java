package Models.Eqiupments;

import Models.Battle;
import Models.Thing;

public abstract class Item extends Thing {
    protected Item(String name, int cost) {
        this.cost = cost;
        this.name = name;
    }

    protected String details;


    public abstract void doSpell(Battle battle);


    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
