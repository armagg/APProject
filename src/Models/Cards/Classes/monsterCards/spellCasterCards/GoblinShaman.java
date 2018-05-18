package Models.Cards.Classes.monsterCards.spellCasterCards;

import Models.Battle;
import Models.Cards.Classes.Race;
import Models.Cards.Classes.SpellCasters;

public class GoblinShaman extends SpellCasters {
    public GoblinShaman() {
        super("Goblin Shaman", 1000, 700, 2, Race.GOBLIN, false, false);
        setSpellDetails("Mend: Increase a friendly monster card or player’s HP by 400");
    }

    @Override
    public void DoSpell(Battle battle) {

    }
}
