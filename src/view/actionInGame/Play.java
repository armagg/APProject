package view.actionInGame;

import Control.Functions.Operators;
import Models.Battle;
import Models.Cards.Classes.Card;
import Models.Fields.MonsterField;
import Models.Turn;

import java.util.Scanner;

public class Play {
    Scanner scanner = new Scanner(System.in);
    Battle battle;
    String command;
    Control.InBattle.Play play;
    public Play(Battle battle, Control.InBattle.Play play){
        this.play = play;
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
        while(true){
            command = scanner.nextLine();
            if(command.equals("help")){
                help();
                continue;
            }

            if(command.equals("view graveyard")){
                viewGraveYard(battle);
                continue;
            }

            if(command.equals("view hand")){
                viewHand(battle);
                continue;
            }

            if(command.equals("view spellfield")){
                viewSpellField(battle);
                continue;
            }

            if(command.equals("view monsterfield")){
                viewMonsterField(battle);
                continue;
            }

            if(command.startsWith("use")){

            }

            if(command.startsWith("set")){
                int index = Integer.parseInt(command.split(" ")[1]);
                play.set(index);
            }

            if(command.startsWith("info")){

            }

            if(command.equals("done")){

            }

            if(command.startsWith("exit")){

            }
        }
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

    public void viewGraveYard(Battle battle){
        System.out.println("Your Graveyard");
        for (Card card:battle.getCurrentField().getGraveYard().getCards()) {
            System.out.println(card.getName());
        }
        System.out.println("Enemys Graveyard");
        for (Card card:battle.getOtherField().getGraveYard().getCards()) {
            System.out.println(card.getName());
        }
    }

    public void viewHand(Battle battle){
        System.out.println("Your Hand:");
        for (Card card:battle.getCurrentField().getHand().getCards()) {
            System.out.println(card.getName());
        }
    }

    public void viewSpellField(Battle battle){
        System.out.println("Your Spellfield");
        for (Card card:battle.getCurrentField().getSpellField().getCards()) {
            System.out.println(card.getName());
        }
        System.out.println("Enemys Spellfield");
        for (Card card:battle.getOtherField().getSpellField().getCards()) {
            System.out.println(card.getName());
        }
    }

    public void viewMonsterField(Battle battle){
        System.out.println("Your Monsterfield");
        for (Card card:battle.getCurrentField().getMonsterField().getCards()) {
            System.out.println(card.getName());
        }
        System.out.println("Enemys Monsterfield");
        for (Card card:battle.getOtherField().getMonsterField().getCards()) {
            System.out.println(card.getName());
        }
    }

}