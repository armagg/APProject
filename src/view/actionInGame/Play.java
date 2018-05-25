package view.actionInGame;

import Control.Functions.Operators;
import Control.InBattle.Methods;
import Models.Battle;
import Models.Cards.Classes.*;
import Models.Fields.MonsterField;
import Models.Heroes.Hero;
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
                int index = Integer.parseInt(command.split(" ")[1]);
                use(index);
            }

            if(command.startsWith("set")){
                int index = Integer.parseInt(command.split(" ")[1]);
                play.set(index);
            }

            if(command.startsWith("info")){

            }

            if(command.equals("done")){

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

    public void use(int index){
        Monster card = (Monster)battle.getCurrentField().getMonsterField().getCards().get(index);
        String command;
        System.out.println("using" + card.getName());
        System.out.printf("HP: %d AP: %d \n",card.getHP(),card.getAP());
        System.out.println("is sleeping: " + !card.isAwake());
        System.out.println("can attack: " + card.isAwake());
        if(card instanceof Generals || card instanceof Normal){

        }
        else{
            if (card instanceof Heroes){
                card = (Heroes)card;
                System.out.println("can cast: " + !((Heroes) card).isSpellUsed());}
            else {
                card = (SpellCasters)card;
                System.out.println("can cast: " + !((SpellCasters) card).isSpellUsed());}
        }
        while (true){
            command = scanner.nextLine();
            if(command.equals("info")){
                System.out.println("using" + card.getName());
                System.out.printf("HP: %d AP: %d \n",card.getHP(),card.getAP());
                System.out.println("is sleeping: " + !card.isAwake());
                System.out.println("can attack: " + card.isAwake());
                continue;
            }
            if(command.equals("exit")){
                System.out.println("such a waste...");
                return;
            }
            if(command.equals("cast")){
                cast(card);
            }
            if(command.equals("help")){

                System.out.println("Attack #EnemyMonsterSlot / Player: To attack the card on that slot of enemy MonsterField");
                System.out.println("Info: To get full information on card");
                System.out.println("Exit: To go back to Play Menu");
            }
            if (command.equals("attack")){
                attack(card);

            }

        }
    }

    public void cast(Card card){
        if(card instanceof Generals || card instanceof Normal){
            System.out.println("can't cast");
            return;
        }
        if((card instanceof SpellCasters && ((SpellCasters) card).isSpellUsed()) || (card instanceof Heroes && ((Heroes) card).isSpellUsed())){
            System.out.println("can't cast");
            return;
        }
        if(card instanceof SpellCasters){
            ((SpellCasters) card).DoSpell(battle);
        }
        else
            ((Heroes) card).doSpell(battle);
    }

    public void attack(Card card){
        System.out.printf("1 : attack to hero\n2 : attack to monsters");
        if(scanner.nextInt() == 1){
            Methods.attackHero(battle,(Monster)card,battle.getOtherHero());
            return;}
            else{
            System.out.println("which one???");
            for(int i = 0; i < battle.getOtherField().getMonsterField().getCards().size();i++){
                System.out.println(i + battle.getOtherField().getMonsterField().getCards().get(i).getName());
            }
            int i = scanner.nextInt();
            Methods.attackMonsters(battle,(Monster) card,(Monster) battle.getOtherField().getMonsterField().getCards().get(i));
        }
    }

}
