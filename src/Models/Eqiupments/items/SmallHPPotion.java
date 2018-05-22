package Models.Eqiupments.items;

import Models.Battle;
import Models.Eqiupments.Item;

public class SmallHPPotion extends Item {
    SmallHPPotion() {
        super("Small HP Potion", 1000);
    }

    @Override
    protected void doSpell(Battle battle) {

    }
}
