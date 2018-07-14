package Models.Cards.Classes.monsterCards.spellCasterCards;

import Models.Battle;
import Models.Cards.Classes.Monster;
import Models.Cards.Classes.Race;
import Models.Cards.Classes.SpellCasters;

public final class VolcanicDragaon extends SpellCasters {
    public VolcanicDragaon() {
        super("Volcanic Dragon", 2500, 700, 8, Race.DragonBreed, false, true);
        setSpellDetails("Lava Spit: Deal 500 damage to an enemy monster card and reduce its AP by 500");
    }

    @Override
    public void DoSpell(Battle battle) {
        Monster monster = (Monster) battle.getOtherField().getMonsterField().getRandomCard();
        if (monster != null) {
            monster.reduceHP(500);
            monster.reduceAP(500);
        }
        setSpellUsed(true);
    }
}
