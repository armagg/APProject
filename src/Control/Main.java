package Control;

import Models.Cards.Classes.Normal;
import Models.Eqiupments.Amulet;
import Models.Eqiupments.Item;
import Models.Eqiupments.amulets.*;
import Models.Eqiupments.items.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt(2));
        Normal normal = new Normal();
//        normal.setMP(23);
        //      normal.setAP(321);
        ////   SpellCasters spellCasters= (SpellCasters)(Monster) normal;
      /*  Monster monster = new Monster();
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
       */ //SpellCasters spellCasters = (SpellCasters) monster.getClass().cast(SpellCasters.class);

        //System.out.println(spellCasters.getAP());

    }
    public static ArrayList<Item> returnItems(){
        ArrayList<Item> items = new ArrayList<>();
        items.add(new GreaterRestorative());
        items.add(new LargeHPPtion());
        items.add(new LargeMPpotion());
        items.add(new LesserRestorative());
        items.add(new MediumHPPotion());
        items.add(new MediumMPPotion());
        items.add(new SmallHPPotion());
        items.add(new SmallMPPotion());
        return items;
    }
    public static ArrayList<Amulet> returnAmulets(){
        ArrayList<Amulet> amulets = new ArrayList<>();
        amulets.add(new DiamondPendant());
        amulets.add(new DiamondRing());
        amulets.add(new GoldPendant());
        amulets.add(new GoldRing());
        amulets.add(new IronPendant());
        amulets.add(new IronRing());
        return amulets;

    }


}