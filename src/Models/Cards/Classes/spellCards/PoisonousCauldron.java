package Models.Cards.Classes.spellCards;

import Models.Battle;
import Models.Cards.Classes.Monster;
import Models.Cards.Classes.SpellCards;
import Models.Cards.Classes.SpellType;

import java.util.ArrayList;

public class PoisonousCauldron extends SpellCards {
    public PoisonousCauldron() {
        super("Poisonous Cauldron", 4, SpellType.CONTINOUS);
        setSpellDetails("Deal 100 damage to all enemy monster cards and enemy player");
    }

    @Override
    public void negativeSpell(Battle battle) {

    }

    @Override
    public void doSpell(Battle battle) {
        ArrayList<Monster> monsters = new ArrayList<>();
        monsters.addAll(battle.getOtherField().getMonsterField().returnMonsters());
        for (Monster monster : monsters) {
            monster.reduceHP(100);
        }
        battle.getOtherHero().reduceHP(100);
    }
}
