package Models.Fields;

import Models.Cards.Classes.Monster;

import java.util.ArrayList;

public class MonsterField extends SuperField{
    private final int maxLength = 5;


    private ArrayList<Monster> monsters = new ArrayList<>(5);

    public ArrayList<Monster> getMonsters() {
        return monsters;
    }

    public void setMonsters(ArrayList<Monster> monsters) {
        this.monsters = monsters;
    }


}
