package Models.Cards.Classes.monsterCards.spellCasterCards;

import Models.Battle;
import Models.Cards.Classes.Race;
import Models.Cards.Classes.SpellCasters;

public class ElvenDruid extends SpellCasters {
    public ElvenDruid() {
        super("Evlen Druid", 1200, 600, 5, Race.Elves, false, false);
        setSpellDetails("Rejuvenation: Increase a selected friendly monster card’s HP by 500 and AP by 300");
    }

    @Override
    public void DoSpell(Battle battle) {

    }
}
