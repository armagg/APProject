package Control.InBattle;

import Models.Battle;
import Models.Cards.Classes.Card;
import Models.Cards.Classes.Monster;


public class Methods {

    public static void terminatedToGraveYard(Battle battle) {
        for (Card card : battle.returnCardsInGame()){
            if(card instanceof Monster){
                Monster monster;
                monster = (Monster) card;
                if(monster.getHP() <= 0){
                    if(battle.getRivalField().getMonsterField().getCards().contains(card)) {
                        battle.getRivalField().getMonsterField().getCards().remove(card);
                        battle.getRivalField().getGraveYard().getCards().add(card);
                    }
                    else if(battle.getPlayerField().getMonsterField().getCards().contains(card)){
                        battle.getPlayerField().getMonsterField().getCards().remove(card);
                        battle.getRivalField().getGraveYard().getCards().add(card);
                    }
                }
            }
        }
    }

}