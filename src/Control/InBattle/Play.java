package Control.InBattle;
import Control.Functions.Operators;

import Models.Battle;
import Models.Cards.Classes.Card;
import Models.Cards.Classes.Generals;
import Models.Cards.Classes.Heroes;
import Models.Cards.Classes.Monster;
import Models.Fields.Place;

import java.util.ArrayList;

public class Play {
    view.actionInGame.Play play;
    Battle battle;
    boolean isGameFinished = false;
    Play(Battle battle){
        this.battle = battle;
        battle.initiateCardsDistribution();
        battle.randomInitialTurn();
        play = new view.actionInGame.Play(battle,this);
        startGame();
    }

    public void startGame(){
        do {
            play.nextMove();
        } while (!isGameFinished);
    }

    public void set(int index) {

        Place place;
        Card card = battle.getCurrentField().getHand().getCards().get(index);
        if (battle.getCurrentHero().getMP() >= card.getMP()) {
            if (card instanceof Monster)
                place = Place.MONSTERFIELD;
            else
                place = Place.SPELLFIELD;
            ArrayList<Card> cards = new ArrayList<>();
            cards.add(battle.getCurrentField().getHand().getCards().get(index));
            Operators.replaceCards(battle.getCurrentField(), cards, Place.HAND, place);
            battle.getCurrentHero().reduceMP(card.getMP());
            if(card instanceof Heroes)
                ((Heroes) card).doBattleCry(battle);
            if (card instanceof Generals)
                ((Generals) card).doBattleCry(battle);
            System.out.println(card.getName()+ "was set in playfield");

        }
        else
            System.out.println("MP not enough");
    }

    public void finish(){
        isGameFinished = true;
    }
}
