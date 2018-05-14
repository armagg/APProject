package Models;

import Models.Cards.Classes.Card;
import Models.Fields.Field;
import Models.Heroes.Hero;

import java.util.ArrayList;
import java.util.Random;

public class Battle {

    private Field playerField;
    private Field RivalField;
    private Hero playerHero;
    private Hero RivalHero;



    private Turn player;
    private int MP = 0;

    public Battle(Field playerField, Field rivalField) {
        this.playerField = playerField;
        this.RivalField = rivalField;
        Random random = new Random();
        int temp = random.nextInt(2);
        if (temp == 1) {
            player = Turn.RIVAL;
            Card tempCard = playerField.getDeck().getRandomCard();
            playerField.getHand().addCard(tempCard);

        } else {
            player = Turn.HUMAN;
            Card tempCard = RivalField.getDeck().getRandomCard();
            RivalField.getHand().addCard(tempCard);
        }

    }

    public void nextRound() {
        MP++;
        nextTurn();

    }

    public void nextTurn() {
        if (Turn.HUMAN == player)
            player = Turn.RIVAL;
        else
            player = Turn.HUMAN;
    }

    public void initiateCardsDistribution(){
        for (int i = 0; i < 3; i++) {
            Card tempCard = playerField.getDeck().getRandomCard();
            playerField.getHand().addCard(tempCard);

            tempCard = RivalField.getDeck().getRandomCard();
            RivalField.getHand().addCard(tempCard);
        }
    }

    public Turn getTurn() {
        return player;
    }

    public Field getPlayerField() {
        return playerField;
    }

    public void setPlayerField(Field playerField) {
        this.playerField = playerField;
    }

    public Field getRivalField() {
        return RivalField;
    }

    public void setRivalField(Field computerField) {
        this.RivalField = computerField;
    }

    public int getMP() {
        return MP;
    }

    public void setPlayerHero(Hero playerHero) {
        this.playerHero = playerHero;
    }

    public Hero getRivalHero() {
        return RivalHero;
    }

    public void setRivalHero(Hero rivalhero) {
        RivalHero = rivalhero;
    }

    public Hero getPlayerHero() {
        return playerHero;
    }

    public Field returnFieldFromTurn(Turn turn) {
        if (turn == Turn.HUMAN) {
            return playerField;
        }
        return RivalField;
    }

    public ArrayList<Card> returnCardsInGame() {
        ArrayList<Card> cards = new ArrayList<>(20);
        cards.addAll(playerField.getAllCards());
        cards.addAll(RivalField.getAllCards());

        return cards;
    }

    public Field getOtherField(){
        if(this.getTurn() == Turn.HUMAN)
            return RivalField;
        return playerField;
    }
}
