package Models;

import Models.Fields.Deck;
import Models.Fields.Field;
import Models.Fields.GraveYard;
import Models.Fields.Hand;
public class Battle {
    private Deck playerDeck;
    private Deck computerDeck;
    private GraveYard playerGraveYard;
    private GraveYard computerGraveYard;
    private Hand pleyerHand;
    private Hand computerHand;
    private Field playerField;
    private Field computerField;
    private Player player =
    private int MP = 0;

    public void nextround() {
        MP++;
    }


    public Deck getPlayerDeck() {
        return playerDeck;
    }

    public void setPlayerDeck(Deck playerDeck) {
        this.playerDeck = playerDeck;
    }

    public Deck getComputerDeck() {
        return computerDeck;
    }

    public void setComputerDeck(Deck computerDeck) {
        this.computerDeck = computerDeck;
    }

    public GraveYard getPlayerGraveYard() {
        return playerGraveYard;
    }

    public void setPlayerGraveYard(GraveYard playerGraveYard) {
        this.playerGraveYard = playerGraveYard;
    }

    public GraveYard getComputerGraveYard() {
        return computerGraveYard;
    }

    public void setComputerGraveYard(GraveYard computerGraveYard) {
        this.computerGraveYard = computerGraveYard;
    }

    public Hand getPleyerHand() {
        return pleyerHand;
    }

    public void setPleyerHand(Hand pleyerHand) {
        this.pleyerHand = pleyerHand;
    }

    public Hand getComputerHand() {
        return computerHand;
    }

    public void setComputerHand(Hand computerHand) {
        this.computerHand = computerHand;
    }

    public Field getPlayerField() {
        return playerField;
    }

    public void setPlayerField(Field playerField) {
        this.playerField = playerField;
    }

    public Field getComputerField() {
        return computerField;
    }

    public void setComputerField(Field computerField) {
        this.computerField = computerField;
    }

    public int getMP() {
        return MP;
    }
}
