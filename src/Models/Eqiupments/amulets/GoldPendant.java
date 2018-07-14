package Models.Eqiupments.amulets;

import Models.Battle;
import Models.Eqiupments.Amulet;

public final class GoldPendant extends Amulet {
    public GoldPendant() {
        super("Gold Pendant", 4000);
        setDetails("Increase Player’s Max HP by 1000");
    }

    @Override
    protected void doSpell(Battle battle) {
        battle.getCurrentHero().addHP(1000);
    }
}
