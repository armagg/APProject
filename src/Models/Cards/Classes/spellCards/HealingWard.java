package Models.Cards.Classes.spellCards;

import Models.Battle;
import Models.Cards.Classes.Monster;
import Models.Cards.Classes.SpellCards;
import Models.Cards.Classes.SpellType;

import java.util.ArrayList;
import java.util.List;

public class HealingWard extends SpellCards {
    public HealingWard() {
        super("Healing Ward", 5, SpellType.CONTINOUS);
        setSpellDetails("Increase all friendly monster cards’ HP by 200");
    }

    @Override
    public void doSpell(Battle battle) {
        List<Monster> monsters = new ArrayList<>();
        monsters = battle.getCurrentField().getMonsterField().returnMonsters();
        for (Monster monster : monsters) {
            monster.addHP(200);
        }
    }
}
