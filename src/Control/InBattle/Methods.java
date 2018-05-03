package Control.InBattle;

import Models.Battle;
import Models.Cards.Classes.Card;
import Models.Turn;

public class Methods {
    static void toHand(Battle battle) {
        Turn turn = battle.getTurn();
        Card card = battle.returnFieldFromTurn(turn).getDeck().getRandomCard();
        battle.returnFieldFromTurn(turn).getHand().addCard(card);
    }

    public static void terminatedToGraveYard(Battle battle) {

    }

        }



