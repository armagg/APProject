package Models.Eqiupments.items;

import Models.Battle;
import Models.Eqiupments.Item;

public class SmallHPPotion extends Item {
    public SmallHPPotion() {
        super("Small HP Potion", 1000);
    }

    @Override
    public void doSpell(Battle battle) {

    }
}
