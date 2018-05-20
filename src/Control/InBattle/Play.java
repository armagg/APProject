package Control.InBattle;

import Models.Battle;

public class Play {
    view.actionInGame.Play play;
    Battle battle;
    Play(Battle battle){
        this.battle = battle;
        battle.initiateCardsDistribution();
        battle.randomInitialTurn();
        play = new view.actionInGame.Play(battle);
    }
    public void startGame(){
        do {
            play.nextMove();
        } while (true);
    }
}