package Control.InBattle;

import Models.Battle;
import Models.Cards.Classes.Card;
import Models.Cards.Classes.Monster;
import Models.Turn;

import java.util.ArrayList;

public class Methods {
    static void toHand(Battle battle) {
        Turn turn = battle.getTurn();
        Card card = battle.returnFieldFromTurn(turn).getDeck().getRandomCard();
        battle.returnFieldFromTurn(turn).getHand().addCard(card);
    }

    public static void terminatedToGraveYard(Battle battle) {
        ArrayList<Monster> cards = battle.returnCardsInGame();
        for (Card card : cards) {


        }
    }

}
