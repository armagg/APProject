package Control.Functions;

import Models.Cards.Card;

import java.util.ArrayList;

import Models.Battle;
import Models.Turn;

public class Collectors {

    public ArrayList<Card> chooseAllOfOwncard(Battle battle) {
        ArrayList<Card> cards = new ArrayList<>(20);
        if (battle.getTurn() == Turn.HUMAN) {
            cards.addAll(battle.getPlayerField().getMonsterField().getCards());
            cards.addAll(battle.getPlayerField().getHand().getCards());


        }


    }
}
