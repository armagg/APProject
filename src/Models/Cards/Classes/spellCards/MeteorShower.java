package Models.Cards.Classes.spellCards;

import Models.Battle;
import Models.Cards.Classes.SpellCards;
import Models.Cards.Classes.SpellType;

public class MeteorShower extends SpellCards {
    public MeteorShower() {
        super("Meteor Shower", 8, SpellType.CONTINOUS);
        setSpellDetails("Deal 800 damage to a random enemy monster card on field or player");
    }

    @Override
    public void doSpell(Battle battle) {

    }
}
