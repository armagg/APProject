package Models.Eqiupments.items;

import Models.Battle;
import Models.Eqiupments.Item;

public final class GreaterRestorative extends Item {
    public GreaterRestorative() {
        super("Greator Restorative", 4000);
        setDetails("Increase Player’s HP by 1000 and MP by 4");
    }

    @Override
    public void doSpell(Battle battle) {

    }
}
