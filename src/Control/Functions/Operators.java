package Control.Functions;

import Models.Cards.Card;
import Models.Cards.FunctionTargetKind;
import Models.Cards.Monster;
import Models.Fields.Field;
import Models.Fields.Place;
import Models.Heroes.Hero;
import java.util.ArrayList;


public class Operators {
    public void CardsPowerChanger(ArrayList<Monster> cards, int amount, FunctionTargetKind functionTargetEffect,AddOrReduce addOrReduce){
        switch (functionTargetEffect){
            case AP:
                for (Monster card : cards) {
                    card.addAP(amount*(addOrReduce.ordinal()*2-1));/*converting {0,1} to {-1,1}*/
                }
            case HP:
                for (Monster card : cards) {
                    card.addHP(amount*(addOrReduce.ordinal()*2-1));/*converting {0,1} to {-1,1}*/
                }
        }


    }


    public void HeroPowerChanger(Hero hero,int amount,AddOrReduce addOrReduce){
        hero.addHP(amount*(addOrReduce.ordinal()*2-1));/*converting {0,1} to {-1,1}*/
    }


    public void replaceCards(Field field, ArrayList<Card> cards, Place originPlace,Place destinationPlace){
        switch (originPlace){
            case DECK:
                for (Card card:cards) {
                    field.getDeck().deleteCard(card);
                }break;

            case HAND:
                for (Card card:cards) {
                    field.getHand().deleteCard(card);
                }break;

            case MONSTERFIELD:
                for (Card card:cards) {
                    field.getMonsterField().deleteCard(card);
                }break;

            case SPELLFIELD:
                for (Card card:cards) {
                    field.getSpellField().deleteCard(card);
                }break;

            case GRAVEYARD:
                for (Card card:cards) {
                    field.getSpellField().deleteCard(card);
                }break;

        }

        switch (destinationPlace){
            case DECK:
                for (Card card:cards) {
                    field.getDeck().addCard(card);
                }break;

            case HAND:
                for (Card card:cards) {
                    field.getHand().addCard(card);
                }break;

            case MONSTERFIELD:
                for (Card card:cards) {
                    field.getMonsterField().addCard(card);
                }break;

            case SPELLFIELD:
                for (Card card:cards) {
                    field.getSpellField().addCard(card);
                }break;

            case GRAVEYARD:
                for (Card card:cards) {
                    field.getSpellField().addCard(card);
                }break;

        }

    }
}