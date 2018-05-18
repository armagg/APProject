package Models.Cards.Classes.monsterCards.spellCasterCards;

import Models.Battle;
import Models.Cards.Classes.Race;
import Models.Cards.Classes.SpellCasters;

public final class ElvenSorceress extends SpellCasters {
    public ElvenSorceress() {
        super("Elven sorceress", 1000, 1000, 7, Race.Elves, true, false);
        setSpellDetails("Arcane Explosion: Deal 400 damage to all enemy monster cards and remove a random spell card " +
                "\nfrom enemy field and move it to graveyard.");
    }

    @Override
    public void DoSpell(Battle battle) {

    }
}
