package Models.Cards.Classes.monsterCards.spellCasterCards;

import Models.Battle;
import Models.Cards.Classes.Monster;
import Models.Cards.Classes.Race;
import Models.Cards.Classes.SpellCasters;

import java.util.ArrayList;
import java.util.List;

public final class VampireAcolyte extends SpellCasters {
    public VampireAcolyte() {
        super("Vampire Acolyte", 1500, 1500, 7, Race.VAMPIERS, true, false);
        setSpellDetails("Black Wave: Deal 300 damage to all enemy monster cards and heal all friendly \n" +
                "monster cards for 300 HP");
    }

    @Override
    public void DoSpell(Battle battle) {
        ArrayList<Monster> otherMonsters = (ArrayList<Monster>) battle.getOtherField().getMonsterField().returnMonsters();
        List<Monster> thisMonsters = battle.getCurrentField().getMonsterField().returnMonsters();
        if (!otherMonsters.isEmpty())
            for (Monster monster : otherMonsters) {
                monster.reduceHP(300);
            }
        if (!thisMonsters.isEmpty())
            for (Monster monster : thisMonsters) {
                monster.addHP(300);
            }
        setSpellUsed(true);
    }
}
