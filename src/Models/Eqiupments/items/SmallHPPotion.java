package Models.Eqiupments.items;

import Models.Battle;
import Models.Eqiupments.Item;

public class SmallHPPotion extends Item {
    public SmallHPPotion() {
        super("Small HP Potion", 1000);
        setDetails("Increase Player’s HP by 500");
    }

    @Override
    public void doSpell(Battle battle) {
        battle.getCurrentHero().addHP(500);
    }
}
