package Models.Cards.Classes.spellCards;

import Models.Battle;
import Models.Cards.Classes.SpellCards;
import Models.Cards.Classes.SpellType;

public class TakeAllYouCan extends SpellCards {
    public TakeAllYouCan() {
        super("Take All You Can", 7, SpellType.AURA);
        setSpellDetails("Increase all friendly normal monster cards’ HP and AP by 400");
    }


    @Override
    public void doSpell(Battle battle) {

    }
}
