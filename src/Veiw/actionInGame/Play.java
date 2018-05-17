package Veiw.actionInGame;

import Models.Battle;
import Models.Turn;

public class Play {
    Battle battle;
    public Play(Battle battle){
        this.battle = battle;
        System.out.println("Battle against" + battle.getRivalHero().getName() + "Started!");
        if(battle.getTurn() == Turn.HUMAN){
            System.out.println(battle.getPlayerHero().getName() + "starts this battle.");
        }
        else{
            System.out.println(battle.getRivalHero().getName() + "starts this battle.");
        }
    }

}