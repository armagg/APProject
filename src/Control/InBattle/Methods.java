package Control.InBattle;

import Models.Battle;
import Models.Cards.Classes.Card;
import Models.Cards.Classes.Monster;
import Models.Turn;

import java.util.ArrayList;
import java.util.Arrays;

public class Methods {
    static void toHand(Battle battle) {
        Turn turn = battle.getTurn();
        Card card = battle.returnFieldFromTurn(turn).getDeck().getRandomCard();
        battle.returnFieldFromTurn(turn).getHand().addCard(card);

    }

    public static void terminatedToGraveYard(Battle battle) {
        for (Card card : battle.returnCardsInGame()) {
            if (card instanceof Monster) {
                Monster monster;
                monster = (Monster) card;
                if (monster.getHP() <= 0) {
                    if (battle.getRivalField().getMonsterField().getCards().contains(card)) {
                        battle.getRivalField().getMonsterField().getCards().remove(card);
                        battle.getRivalField().getGraveYard().getCards().add(card);
                    } else if (battle.getPlayerField().getMonsterField().getCards().contains(card)) {
                        battle.getPlayerField().getMonsterField().getCards().remove(card);
                        battle.getRivalField().getGraveYard().getCards().add(card);
                    }
                }
            }
        }
    }

    public static boolean attackMonsters(Battle battle, Monster attacker, Monster goal) {
        ArrayList<Card> cardArrayList;
        boolean haveDefender = false;
        Monster defender = null;
        if (attacker.isAwake() && attacker.isDefender()) {
            if (battle.getTurn() == Turn.HUMAN) {
                cardArrayList = battle.getPlayerField().getMonsterField().getCards();
            } else {
                cardArrayList = battle.getRivalField().getMonsterField().getCards();
            }

            for (Card card : cardArrayList) {
                Monster monsterCard = (Monster) card;
                if (monsterCard.isDefender()) {
                    haveDefender = true;
                    defender = monsterCard;
                    break;
                }
            }
            try {
                if (haveDefender) {
                    defender.reduceHP(attacker.getAP());
                    attacker.reduceHP(defender.getAP());
                    return true;
                } else {
                    goal.reduceHP(attacker.getAP());
                    attacker.reduceHP(goal.getAP());
                    return true;
                }

            } catch (Exception e) {
                System.out.println(Arrays.toString(e.getStackTrace()));
            }

        }
            return false;
    }


}
