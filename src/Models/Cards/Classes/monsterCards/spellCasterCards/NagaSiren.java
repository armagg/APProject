package Models.Cards.Classes.monsterCards.spellCasterCards;

import Models.Battle;
import Models.Cards.Classes.Race;
import Models.Cards.Classes.SpellCasters;

public final class NagaSiren extends SpellCasters {
    public NagaSiren() {
        super("Naga Siren", 1200, 600, 6, Race.Atlantians, false, false);
        setSpellDetails("Song of the Siren: Increase HP of all friendly monster cards by 300 and their AP by 200");
    }

    @Override
    public void DoSpell(Battle battle) {

    }
}
