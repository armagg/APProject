package Models.Cards.Classes.monsterCards.spellCasterCards;

import Models.Battle;
import Models.Cards.Classes.Race;
import Models.Cards.Classes.SpellCasters;

public final class VampireAcolyte extends SpellCasters {
    public VampireAcolyte() {
        super("Vampire Acolyte", 1500, 1500, 7, Race.VAMPIERS, true, false);
        setSpellDetails("Black Wave: Deal 300 damage to all enemy monster cards and heal all friendly \n" +
                "monster cards for 300 HP");
    }

    @Override
    public void DoSpell(Battle battle) {

    }
}
