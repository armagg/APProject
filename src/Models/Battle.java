package Models;

import Models.Fields.Deck;
import Models.Fields.Field;
import Models.Fields.GraveYard;
import Models.Fields.Hand;
public class Battle {

    private Field playerField;
    private Field computerField;
    private Player player =
    private int MP = 0;

    public void nextround() {
        MP++;
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
