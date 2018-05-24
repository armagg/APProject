package Models.Cards.Classes.monsterCards.spellCasterCards;

import Models.Battle;
import Models.Cards.Classes.Race;
import Models.Cards.Classes.SpellCasters;

import java.util.Random;

public final class OgreMagi extends SpellCasters {
    public OgreMagi() {
        super("Orge Magi", 1500, 800, 5, Race.ORGES, false, false);
        setSpellDetails("Enrage: Increase a friendly monster card’s AP by 400");
    }

    @Override
    public void DoSpell(Battle battle) {
        Random random = new Random();

        int index = random.nextInt(battle.getCurrentField().getMonsterField().getNumberOfCards());
        battle.getCurrentField().getMonsterField().returnMonsters().get(index).addHP(400);
    }
}
