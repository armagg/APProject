package Models.Cards.Classes.spellCards;

import Models.Battle;
import Models.Cards.Classes.SpellCards;
import Models.Cards.Classes.SpellType;

public class StrategicRetreat extends SpellCards {
    public StrategicRetreat() {
        super("Strategic Retreat", 6, SpellType.INSTANT);
        setSpellDetails("Select and move a monster card from field to hand and draw one card from deck");
    }


    @Override
    public void doSpell(Battle battle) {

    }
}
