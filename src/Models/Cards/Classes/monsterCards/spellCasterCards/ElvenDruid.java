package Models.Cards.Classes.monsterCards.spellCasterCards;

import Models.Battle;
import Models.Cards.Classes.Monster;
import Models.Cards.Classes.Race;
import Models.Cards.Classes.SpellCasters;
import Models.Turn;

import java.util.Random;

public class ElvenDruid extends SpellCasters {
    public ElvenDruid() {
        super("Evlen Druid", 1200, 600, 5, Race.Elves, false, false);
        setSpellDetails("Rejuvenation: Increase a selected friendly monster card’s HP by 500 and AP by 300");
    }

    @Override
    public void DoSpell(Battle battle) {
        int i = 1;
        if (battle.getTurn() == Turn.HUMAN) {
            System.out.println("select a friendly monster to heal 500 and increase hp by 300");
            for (Monster monster : battle.getCurrentField().getMonsterField().returnMonsters()) {
                System.out.println(Integer.toString(i) + monster.toString());
                i++;
            }
            battle.getCurrentField().getMonsterField().returnMonsters().get(i - 1).addAP(300);
            battle.getCurrentField().getMonsterField().returnMonsters().get(i - 1).addHP(500);
        } else {
            Random random = new Random();
            i = random.nextInt(battle.getCurrentField().getMonsterField().getNumberOfCards());
            battle.getCurrentField().getMonsterField().returnMonsters().get(i).addAP(300);
            battle.getCurrentField().getMonsterField().returnMonsters().get(i).addHP(500);

        }
        setSpellUsed(true);
    }
}
