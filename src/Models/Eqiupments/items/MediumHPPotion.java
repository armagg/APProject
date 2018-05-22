package Models.Eqiupments.items;

import Models.Battle;
import Models.Eqiupments.Item;

public class MediumHPPotion extends Item {
    public MediumHPPotion() {
        super("Medium HP potion", 2000);
    }

    @Override
    public void doSpell(Battle battle) {

    }
}
