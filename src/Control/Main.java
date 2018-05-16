package Control;

import Models.Cards.Classes.Card;
import Models.Cards.Classes.Monster;
import Models.Cards.Classes.Normal;
import Models.Cards.Classes.SpellCasters;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Normal normal = new Normal();
//        normal.setMP(23);
        //      normal.setAP(321);
        ////   SpellCasters spellCasters= (SpellCasters)(Monster) normal;
        Monster monster = new Monster();
        monster.setAP(3);
        monster.setHP(34);
        ArrayList<Card> cards = new ArrayList<>();
        Monster monster1 = new Monster();
        Normal normal1 = new Normal();
        SpellCasters spellCasters = new SpellCasters();
        cards.add(normal1);
        cards.add(monster);
        cards.add(spellCasters);
        Monster a = (Monster) cards.get(1);
        System.out.println(a.getAP());
        //SpellCasters spellCasters = (SpellCasters) monster.getClass().cast(SpellCasters.class);

        //System.out.println(spellCasters.getAP());



    }


}