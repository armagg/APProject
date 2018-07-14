package Models.Cards.Classes.spellCards;

import Models.Battle;
import Models.Cards.Classes.SpellCards;
import Models.Cards.Classes.SpellType;

public class MagicSeal extends SpellCards {
    public MagicSeal() {
        super("Magic Seal", 9, SpellType.CONTINOUS);
        setSpellDetails("Remove all enemy spell cards from field and move them to graveyard");
    }

    @Override
    public void negativeSpell(Battle battle) {

    }

    @Override
    public void doSpell(Battle battle) {
        //ToDo
    }
}
