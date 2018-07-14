package Models.Eqiupments;

import Models.Battle;
import Models.Thing;

public abstract class Amulet extends Thing {
    protected Amulet(String name, int cost) {
        this.cost = cost;
        this.name = name;
        isEquiped = false;
    }

    protected abstract void doSpell(Battle battle);

    private String details;
    private boolean isEquiped;

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public boolean isEquiped() {
        return isEquiped;
    }

    public void setEquiped(boolean equiped) {
        isEquiped = equiped;
    }
}
