package Models.Eqiupments;

import Models.Battle;

public class MediumMPPotion extends Item {
    public MediumMPPotion() {
        super("Medium MP potion", 2000);
        setDetails("Increase Player’s MP by 4");
    }

    @Override
    public void doSpell(Battle battle) {

    }
}
