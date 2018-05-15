package Models.Cards.Classes;

import Models.Spell.Spell;

public class Generals extends Monster {

    Spell will;
    Spell battleCry;

    public Spell getWill() {
        return will;
    }

    public void setWill(Spell will) {
        this.will = will;
    }

    public Spell getBattleCry() {
        return battleCry;
    }

    public void setBattleCry(Spell battleCry) {
        this.battleCry = battleCry;
    }
}
