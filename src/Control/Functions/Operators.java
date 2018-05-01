package Control.Functions;

import Models.Cards.Card;
import Models.Cards.FunctionTargetKind;
import Models.Cards.Monster;
import Models.Fields.Field;
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


    public void SendToGraveYard(Field field,ArrayList<Card> cards){

    }
}