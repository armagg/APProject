package Models.Cards.Classes.monsterCards.spellCasterCards;

import Models.Battle;
import Models.Cards.Classes.Monster;
import Models.Cards.Classes.Race;
import Models.Cards.Classes.SpellCasters;

import java.util.Random;

public final class BlueDragon extends SpellCasters {
    public BlueDragon() {
        super("Blue Dragon", 800, 1200, 5, Race.DragonBreed, false, false);
        setSpellDetails("Magical Fire: Move an enemy monster card from field to graveyard");
    }

    @Override
    public void DoSpell(Battle battle) {
        Random random = new Random();
        int temp = battle.getOtherField().getMonsterField().getNumberOfCards();
        Monster monster = battle.getOtherField().getMonsterField().returnMonsters().get(random.nextInt(temp));

    }
}
