package Models.Eqiupments.items;

import Models.Battle;
import Models.Eqiupments.Item;

public final class LargeHPPtion extends Item {
    LargeHPPtion() {
        super("Large HP potion", 4000);
    }

    @Override
    protected void doSpell(Battle battle) {

    }
}
