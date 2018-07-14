package Models.Cards.Classes.monsterCards.spellCasterCards;

import Models.Battle;
import Models.Cards.Classes.Monster;
import Models.Cards.Classes.Race;
import Models.Cards.Classes.SpellCasters;

import java.util.Random;

public class GoblinShaman extends SpellCasters {
    public GoblinShaman() {
        super("Goblin Shaman", 1000, 700, 2, Race.GOBLIN, false, false);
        setSpellDetails("Mend: Increase a friendly monster card or player’s HP by 400");
    }

    @Override
    public void DoSpell(Battle battle) {
        Random random = new Random();
        if (random.nextBoolean()) {
            battle.getCurrentHero().addHP(400);
        } else {
            Monster monster = (Monster) battle.getCurrentField().getMonsterField().getRandomCard();
            monster.addHP(400);
        }
        setSpellUsed(true);
    }
}

