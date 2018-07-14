package Models.Cards.Classes.spellCards;

import Models.Battle;
import Models.Cards.Classes.Monster;
import Models.Cards.Classes.SpellCards;
import Models.Cards.Classes.SpellType;
import Models.Turn;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;

public class ThrowingKnives extends SpellCards {
    public ThrowingKnives() {
        super("Throwing Knives", 3, SpellType.INSTANT);
        setSpellDetails("Deal 500 damage to a selected enemy monster card on the field or to enemy player");
    }

    @Override
    public void negativeSpell(Battle battle) {

    }

    @Override
    public void doSpell(Battle battle) {
        Random random = new Random();
        if (battle.getTurn() == Turn.HUMAN) {
            out.println("select wat you want to damage:");
            out.println("1." + battle.getOtherHero().getName());
            int i = 2;
            for (Monster monster : battle.getOtherField().getMonsterField().returnMonsters()) {
                out.println(Integer.toString(i) + ". " + monster.toString());
                i++;
            }
            Scanner scanner = new Scanner(System.in);
            int temp = scanner.nextInt();
            if (temp == 1) {
                battle.getOtherHero().reduceHP(500);
            } else {
                battle.getCurrentField().getMonsterField().returnMonsters().get(temp - 2).reduceHP(500);
            }
        }
    }
}
