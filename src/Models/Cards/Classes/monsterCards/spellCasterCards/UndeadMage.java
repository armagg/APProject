package Models.Cards.Classes.monsterCards.spellCasterCards;

import Models.Battle;
import Models.Cards.Classes.Monster;
import Models.Cards.Classes.Race;
import Models.Cards.Classes.SpellCasters;

public final class UndeadMage extends SpellCasters {
    public UndeadMage() {
        super("Undead Mage", 800, 1000, 6, Race.VAMPIERS, false, false);
        setSpellDetails("Curse: Reduce an enemy monster card’s AP by 500");
    }

    @Override
    public void DoSpell(Battle battle) {
        Monster monster = (Monster) battle.getOtherField().getMonsterField().getRandomCard();
        if (monster != null)
            monster.reduceHP(500);
        setSpellUsed(true);
    }
}
