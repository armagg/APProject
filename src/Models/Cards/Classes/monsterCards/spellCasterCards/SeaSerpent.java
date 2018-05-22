package Models.Cards.Classes.monsterCards.spellCasterCards;

import Models.Battle;
import Models.Cards.Classes.Race;
import Models.Cards.Classes.SpellCasters;

public final class SeaSerpent extends SpellCasters {
    public SeaSerpent() {
        super("Sea Sesrpent", 1500, 1200, 7, Race.Atlantians, true, false);
        setSpellDetails("Serpent’s Bite: Deal 1000 damage to an enemy monster card or player");
    }

    @Override
    public void DoSpell(Battle battle) {

    }
}
