package Models.Eqiupments.amulets;

import Models.Battle;
import Models.Eqiupments.Amulet;

public class DiamondRing extends Amulet {
    public DiamondRing() {
        super("Diamond Ring", 8000);
        setDetails("Increase Player’s Max MP by 3");
    }


    @Override
    protected void doSpell(Battle battle) {
        battle.getCurrentHero().addMaxMP(3);
    }
}
