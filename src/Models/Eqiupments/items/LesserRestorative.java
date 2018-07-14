package Models.Eqiupments.items;

import Models.Battle;
import Models.Eqiupments.Item;

public class LesserRestorative extends Item {
    public LesserRestorative() {
        super("Lesser Restorative", 2000);
        setDetails("Increase Player’s HP by 500 and MP by 2");
    }

    @Override
    public void doSpell(Battle battle) {
        battle.getCurrentHero().addMaxMP(2);
        battle.getCurrentHero().addHP(500);
    }
}
