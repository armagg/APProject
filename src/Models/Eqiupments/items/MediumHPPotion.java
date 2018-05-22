package Models.Eqiupments.items;

import Models.Battle;
import Models.Eqiupments.Item;

public class MediumHPPotion extends Item {
    MediumHPPotion() {
        super("Medium HP potion", 2000);
    }

    @Override
    protected void doSpell(Battle battle) {

    }
}
