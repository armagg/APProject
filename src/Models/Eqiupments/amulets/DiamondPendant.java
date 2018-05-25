package Models.Eqiupments.amulets;

import Models.Battle;
import Models.Eqiupments.Amulet;

public class DiamondPendant extends Amulet {
    public DiamondPendant() {
        super("Diamond Pendant", 8000);
        setDetails("Increase Player’s Max HP by 2000");
    }

    @Override
    protected void doSpell(Battle battle) {
        battle.getCurrentHero().addHP(2000);
    }
}
