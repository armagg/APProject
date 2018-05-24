package Models.Cards.Classes.monsterCards.generalCards;

import Models.Battle;
import Models.Cards.Classes.Card;
import Models.Cards.Classes.Generals;
import Models.Cards.Classes.Race;

import java.util.ArrayList;
import java.util.Scanner;

public final class DarkKnight extends Generals {
    public DarkKnight() {
        super("Dark Knight", 2500, 2500, 8, Race.Demonic, false, false);
        setWillDetails("Loyalty: Heal your player for 1000 HP");
        setBattleCryDetails("Sacrifice: Select and move a card from hand to graveyard");
    }

    @Override
    public void doBattleCry(Battle battle) {
        int i = 1;
        ArrayList<Card> cards = battle.getCurrentField().getHand().getCards();
        if (!cards.isEmpty()) {
            for (Card card : cards)
                System.out.println(Integer.toString(i) + ". " + card.toString());
        }
        Scanner scanner = new Scanner(System.in);
        Card card = battle.getCurrentField().getHand().getCards().get(scanner.nextInt() - 1);
        battle.getCurrentField().getHand().deleteCard(card);
        battle.getCurrentField().getGraveYard().addCard(card);
    }


    @Override
    public void doWill(Battle battle) {
        battle.getCurrentHero().addHP(1000);
    }
}
