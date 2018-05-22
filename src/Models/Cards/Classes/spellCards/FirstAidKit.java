package Models.Cards.Classes.spellCards;

import Models.Battle;
import Models.Cards.Classes.Monster;
import Models.Cards.Classes.SpellCards;
import Models.Cards.Classes.SpellType;
import Models.Turn;

import java.util.Random;
import java.util.Scanner;

public class FirstAidKit extends SpellCards {
    public FirstAidKit() {
        super("First Aid Kit", 3, SpellType.INSTANT);
        setSpellDetails("Increase HP of a selected friendly monster card or player by 500");
    }

    @Override
    public void doSpell(Battle battle) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int which;
        if (battle.getTurn() == Turn.HUMAN) {
            System.out.println("choose what do you want to heal" +
                    "\n1.hero");
            int i = 1;
            for (Monster monster : battle.getPlayerField().getMonsterField().returnMonsters()) {
                System.out.println(Integer.toString(i) + ". " + monster.getName());
                i++;
            }
            which = scanner.nextInt();
            if (which == 1)
                battle.getPlayerHero().addHP(500);
            else {
                battle.getPlayerField().getMonsterField().returnMonsters().get(which - 2).addHP(500);
            }
        } else {
            which = random.nextInt(battle.getRivalField().getMonsterField().getNumberOfCards() + 1);
            if (which == 1)
                battle.getRivalHero().addHP(500);
            else {
                battle.getRivalField().getMonsterField().returnMonsters().get(which - 2).addHP(500);
            }
        }

    }
}
