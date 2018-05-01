package Models;

import Models.Fields.Field;

import java.util.Random;

public class Battle {

    private Field playerField;
    private Field computerField;


    private Turn player;
    private int MP = 0;

    public Battle(Field playerField, Field computerField) {
        this.playerField = playerField;
        this.computerField = computerField;
        Random random = new Random();
        int temp = random.nextInt(2);
        if (temp == 1)
            player = Turn.COMPUTER;
        else
            player = Turn.HUMAN;

    }

    public void nextRound() {
        MP++;

    }

    public void nextTurn() {
        if (Turn.HUMAN == player)
            player = Turn.COMPUTER;
        else
            player = Turn.HUMAN;
    }

    public Turn getPlayer() {
        return player;
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
