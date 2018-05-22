package Models.Eqiupments;

import Models.Battle;

public class LargeMPpotion extends Item {
    public LargeMPpotion() {
        super("Large MP Potion", 4000);
        setDetails("Increase Player’s MP by 8");
    }

    @Override
    public void doSpell(Battle battle) {

    }
}
