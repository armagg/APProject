package Models.Cards.Classes.spellCards;

import Models.Battle;
import Models.Cards.Classes.Monster;
import Models.Cards.Classes.Race;
import Models.Cards.Classes.SpellCards;
import Models.Cards.Classes.SpellType;

import java.util.ArrayList;
import java.util.List;

public class LunarBlessing extends SpellCards {
    public LunarBlessing() {
        super("Lunar Blessing", 6, SpellType.AURA);
        setSpellDetails("Increase AP and HP of friendly Elven monster cards by 300");
    }

    @Override
    public void doSpell(Battle battle) {
        List<Monster> monsters = new ArrayList<>();
        monsters = battle.getCurrentField().getMonsterField().returnMonsters();
        for (Monster monster : monsters) {
            if (monster.getRace() == Race.Elves) {
                monster.addHP(300);
                monster.addAP(300);
            }
        }
    }
}
