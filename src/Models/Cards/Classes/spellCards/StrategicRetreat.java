package Models.Cards.Classes.spellCards;

import Models.Battle;
import Models.Cards.Classes.Card;
import Models.Cards.Classes.Monster;
import Models.Cards.Classes.SpellCards;
import Models.Cards.Classes.SpellType;

import java.util.Scanner;

public class StrategicRetreat extends SpellCards {
    public StrategicRetreat() {
        super("Strategic Retreat", 6, SpellType.INSTANT);
        setSpellDetails("Select and move a monster card from field to hand and draw one card from deck");
    }


    @Override
    public void doSpell(Battle battle) {
        Card card = battle.getCurrentField().getDeck().getRandomCard();
        battle.getCurrentField().getDeck().deleteCard(card);
        battle.getCurrentField().getHand().addCard(card);
        int i = 1;
        System.out.println("select a card from monster field to go back in your hand: ");
        for (Monster monster : battle.getCurrentField().getMonsterField().returnMonsters()) {
            System.out.println(Integer.toString(i) + ". " + monster.toString());
            i++;
        }

        Scanner scanner = new Scanner(System.in);
        Card monster = battle.getCurrentField().getMonsterField().returnMonsters().get(scanner.nextInt());
        battle.getCurrentField().getMonsterField().deleteCard(card);
        battle.getCurrentField().getHand().addCard(card);
    }
}
