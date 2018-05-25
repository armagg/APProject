package Models.Cards.Classes.monsterCards.spellCasterCards;

import Models.Battle;
import Models.Cards.Classes.Race;
import Models.Cards.Classes.SpellCasters;

import java.util.Random;

public final class Necromancer extends SpellCasters {
    public Necromancer() {
        super("Necromancer", 1200, 1500, 7, Race.Demonic, true, false);
        setSpellDetails("Raise Dead: Move a random card from your graveyard to hand");
    }


    @Override
    public void DoSpell(Battle battle) {
        Random random = new Random();
        //TODO : tabe' ali ro inja bayad estefede bokoni.
        setSpellUsed(true);
    }
}
