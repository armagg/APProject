package Control.Functions;

import Models.Battle;
import Models.Cards.Card;
import Models.Turn;

import java.util.ArrayList;

public class Collectors {

    public ArrayList<Card> chooseAllOfOwncard(Battle battle) {
        ArrayList<Card> cards = new ArrayList<>(20);
        if (battle.getTurn() == Turn.HUMAN) {
            cards.addAll(battle.getPlayerField().getMonsterField().getCards());
            cards.addAll(battle.getPlayerField().getHand().getCards());

        } else {
            cards.addAll(battle.getRivalField().getHand().getCards());
            cards.addAll(battle.getRivalField().getMonsterField().getCards());
        }
        return cards;

    }
}
