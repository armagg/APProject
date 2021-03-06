package Models;

import Models.Cards.Classes.Card;
import Models.Fields.Field;
import Models.Heroes.Hero;
import Models.Store.CardShopM;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Battle {

    private Field playerField;
    private Field rivalField;
    private Hero playerHero;
    private Hero rivalHero;


    private Turn turn;
    private int MP = 0;

    public Battle(Field playerField, Field rivalField) {
        this.playerField = playerField;
        this.rivalField = rivalField;
        Random random = new Random();
        int temp = random.nextInt(2);
        if (temp == 1) {
            turn = Turn.RIVAL;
            Card tempCard = playerField.getDeck().getRandomCard();
            playerField.getHand().addCard(tempCard);

        } else {
            turn = Turn.HUMAN;
            Card tempCard = this.rivalField.getDeck().getRandomCard();
            this.rivalField.getHand().addCard(tempCard);
        }

    }

    public Battle() {

    }

    public void nextTurn() {
        if (Turn.HUMAN == turn)
            turn = Turn.RIVAL;
        else
            turn = Turn.HUMAN;
    }

    public void initiateCardsDistribution(){
        for (int i = 0; i < 5; i++) {
            Card tempCard = playerField.getDeck().getRandomCard();
            playerField.getHand().addCard(tempCard);

            tempCard = rivalField.getDeck().getRandomCard();
            rivalField.getHand().addCard(tempCard);
        }
    }

    public Turn getTurn() {
        return turn;
    }

    public Field getPlayerField() {
        return playerField;
    }

    public void setPlayerField(Field playerField) {
        this.playerField = playerField;
    }

    public Field getRivalField() {
        return rivalField;
    }

    public void setRivalField(Field computerField) {
        this.rivalField = computerField;
    }

    public int getMP() {
        return MP;
    }

    public void setPlayerHero(Hero playerHero) {
        this.playerHero = playerHero;
    }

    public Hero getRivalHero() {
        return rivalHero;
    }

    public void setRivalHero(Hero rivalhero) {
        rivalHero = rivalhero;
    }

    public Hero getPlayerHero() {
        return playerHero;
    }

    public Field returnFieldFromTurn(Turn turn) {
        if (turn == Turn.HUMAN) {
            return playerField;
        }
        return rivalField;
    }

    public List<Card> returnCardsInGame() {
        ArrayList<Card> cards = new ArrayList<>(20);
        cards.addAll(playerField.getAllCards());
        cards.addAll(rivalField.getAllCards());

        return cards;
    }

    public Field getOtherField(){
        if(this.getTurn() == Turn.HUMAN)
            return rivalField;
        return playerField;
    }

    public Field getCurrentField(){
        if(this.getTurn() == Turn.HUMAN)
            return playerField;
        return rivalField;
    }

    public void randomInitialTurn(){
        Random random = new Random();
        if(random.nextBoolean()){
            this.turn = Turn.HUMAN;
        }
        else
            this.turn = Turn.RIVAL;
    }

    public Hero getOtherHero(){
        if(this.getTurn() == Turn.HUMAN)
            return rivalHero;
        return playerHero;
    }

    public Hero getCurrentHero(){
        if(this.getTurn() == Turn.HUMAN)
            return playerHero;
        return rivalHero;
    }

    public void takeCardFromDeckToHand(Battle battle){
        Card tempCard = battle.getCurrentField().getDeck().getRandomCard();
        CardShopM cardShopM = new CardShopM();
        Card tempCard2 = cardShopM.makeCardInShop(tempCard.getName().toLowerCase());
        battle.getCurrentField().getHand().addCard(tempCard2);
    }
}
