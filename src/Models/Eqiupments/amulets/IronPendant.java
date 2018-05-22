package Models.Eqiupments.amulets;

import Models.Battle;
import Models.Eqiupments.Amulet;

public  class IronPendant extends Amulet {
    public IronPendant() {
        super("Iron Pendant", 2000);
        setDetails("Increase Player’s Max HP by 500");
    }

    @Override
    public void doSpell(Battle battle) {

    }
}
