package Models.Eqiupments.items;

import Models.Battle;
import Models.Eqiupments.Item;

public class SmallMPPotion extends Item {
    public SmallMPPotion() {
        super("Small MP potion", 1000);
        setDetails("Increase Player’s MP by 2");
    }

    @Override
    public void doSpell(Battle battle) {

    }
}
