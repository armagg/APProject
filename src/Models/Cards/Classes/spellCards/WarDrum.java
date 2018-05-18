package Models.Cards.Classes.spellCards;

import Models.Battle;
import Models.Cards.Classes.SpellCards;
import Models.Cards.Classes.SpellType;

public class WarDrum extends SpellCards {
    public WarDrum() {
        super("War Drum", 6, SpellType.AURA);
        setSpellDetails("Increase all friendly monster cards’ AP by 300");
    }

    @Override
    public void doSpell(Battle battle) {

    }
}
