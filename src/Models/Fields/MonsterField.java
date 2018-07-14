package Models.Fields;

import Models.Cards.Classes.Card;
import Models.Cards.Classes.Monster;

import java.util.ArrayList;
import java.util.List;

public class MonsterField extends SuperField{
    private final int maxLength = 5;

    public List<Monster> returnMonsters() {
        List<Monster> list = new ArrayList<>();
        for (Card card : cards) {
            list.add((Monster) card);
        }
        return list;
    }

}
