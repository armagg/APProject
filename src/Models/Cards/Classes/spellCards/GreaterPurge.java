package Models.Cards.Classes.spellCards;

import Models.Battle;
import Models.Cards.Classes.SpellCards;
import Models.Cards.Classes.SpellType;

public class GreaterPurge extends SpellCards {
    public GreaterPurge() {
        super("Greater Purge", 7, SpellType.INSTANT);
        setSpellDetails("Remove all spell cards on field from both sides and move them to hand");
    }

    @Override
    public void negativeSpell(Battle battle) {

    }

    @Override
    public void doSpell(Battle battle) {
        //ToDo:should call the methods of cards to go to graveyard
    }
}
