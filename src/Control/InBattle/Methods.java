package Control.InBattle;
import Control.Functions.AddOrReduce;
import Control.Functions.Operators;

import Models.Battle;
import Models.Cards.Classes.Card;
import Models.Cards.Classes.Generals;
import Models.Cards.Classes.Heroes;
import Models.Cards.Classes.Monster;
import Models.Heroes.Hero;
import Models.Turn;

import java.util.ArrayList;
import java.util.Arrays;

import static Control.Functions.Collectors.enemyDefendersOfMonsterField;

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
                    if(monster instanceof Generals)
                        ((Generals) monster).doWill(battle);
                    if(monster instanceof Generals)
                        ((Heroes) monster).doWill(battle);

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
        attacker.setHasAttacked(true);
        ArrayList<Card> cardArrayList;
        boolean haveDefender = false;
        Monster defender = null;
        if (attacker.isAwake()) {
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
    //TODO

    public static boolean attackHero(Battle battle, Monster attacker, Hero hero){
        attacker.setHasAttacked(true);
        if(enemyDefendersOfMonsterField(battle) == null){
            Operators.HeroPowerChanger(hero,attacker.getAP(), AddOrReduce.REDUCE);
            return true;
        }
        else{
            return attackMonsters(battle,attacker,(Monster)enemyDefendersOfMonsterField(battle).get(0));
        }
    }

    public static ArrayList<Card> showPlayerGraveYard(Battle battle){
        return battle.getPlayerField().getGraveYard().getCards();
    }

    public static ArrayList<Card> showRivalGraveYard(Battle battle){
        return battle.getRivalField().getGraveYard().getCards();
    }

    public static boolean handOver(Battle battle){
        battle.nextTurn();
        return true;
    }


}