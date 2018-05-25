package Models.Eqiupments.amulets;

import Models.Battle;
import Models.Eqiupments.Amulet;

public class IronRing extends Amulet {
    public IronRing() {
        super("Iron Ring", 2000);
        setDetails("Increase Player’s Max MP by 1");
    }

    @Override
    protected void doSpell(Battle battle) {
        battle.getCurrentHero().addMaxMP(1);
    }
}
