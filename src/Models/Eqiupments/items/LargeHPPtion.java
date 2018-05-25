package Models.Eqiupments.items;

import Models.Battle;
import Models.Eqiupments.Item;

public final class LargeHPPtion extends Item {
    public LargeHPPtion() {
        super("Large HP potion", 4000);
        setDetails("Increase Player’s HP by 2000");
    }

    @Override
    public void doSpell(Battle battle) {
        battle.getCurrentHero().addHP(2000);
    }
}
