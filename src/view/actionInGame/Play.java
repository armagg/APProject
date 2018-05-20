package view.actionInGame;

import Models.Battle;
import Models.Turn;

import java.util.Scanner;

public class Play {
    Scanner scanner = new Scanner(System.in);
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
        System.out.print("Player drew");
        for (int i = 0; i < 5; i++) {
            System.out.print(" "+battle.getPlayerField().getHand().getCards().get(i).getName());
        }
        System.out.println("");
    }
    public void nextMove(){

    }
    public void help(){
        System.out.println("1. Use #SlotNum: To use a specific card which is on the Monster Field");
        System.out.println("2. Set HandIndex to #SlotNum: To set a card which is on the hand, in the field");
        System.out.println("3. View Hand: To view the cards in your hand");
        System.out.println("4. View Graveyard: To view the cards in your graveyard");
        System.out.println("5. View SpellField: To view the cards in both ’players spell fields");
        System.out.println("6. View MonsterField: To view the cards in both ’players monster fields");
        System.out.println("7. Info \"Card Name\": To view full information about a card");
        System.out.println("8. Done: To end your turn");

    }


}