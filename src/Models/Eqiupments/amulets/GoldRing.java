package Models.Eqiupments.amulets;

import Models.Battle;
import Models.Eqiupments.Amulet;

public final class GoldRing extends Amulet {
    public GoldRing() {
        super("Gold Ring", 4000);
        setDetails("Increase Player’s Max MP by 2");
    }

    @Override
    protected void doSpell(Battle battle) {
        battle.getCurrentHero().addMaxMP(2);
    }
}
