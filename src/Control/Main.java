package Control;

import Models.Cards.Classes.Card;
import Models.Cards.Classes.monsterCards.generalCards.*;
import Models.Cards.Classes.monsterCards.heroCards.Cerberus;
import Models.Cards.Classes.monsterCards.heroCards.Igneel;
import Models.Cards.Classes.monsterCards.heroCards.Neptune;
import Models.Cards.Classes.monsterCards.normalCards.*;
import Models.Cards.Classes.monsterCards.spellCasterCards.*;
import Models.Cards.Classes.spellCards.*;
import Models.Eqiupments.Amulet;
import Models.Eqiupments.Item;
import Models.Eqiupments.amulets.*;
import Models.Eqiupments.items.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

    }

    static ArrayList<Card> cards() {
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new ArmoredDragon());
        cards.add(new Dragonlling());
        cards.add(new ElvenAssassin());
        cards.add(new ElvenGuardsMan());
        cards.add(new ElvenHunter());
        cards.add(new ElvenRanger());
        cards.add(new GiantCrab());
        cards.add(new GiantBat());
        cards.add(new GoblinSmuggler());
        cards.add(new Hellhound());
        cards.add(new Imp());
        cards.add(new LesserWhelp());
        cards.add(new LivingArmor());
        cards.add(new MurlocCrawler());
        cards.add(new MurlocWarrior());
        cards.add(new OgreFrontliner());
        cards.add(new OgreWarrior());
        cards.add(new Shade());
        cards.add(new SharkMan());
        cards.add(new StoutUndead());
        cards.add(new Undead());
        cards.add(new YellowDrake());
        cards.add(new BlueDragon());
        cards.add(new ElvenDruid());
        cards.add(new ElvenSorceress());
        cards.add(new EvilEye());
        cards.add(new GoblinShaman());
        cards.add(new NagaSiren());
        cards.add(new Necromancer());
        cards.add(new OgreMagi());
        cards.add(new SeaSerpent());
        cards.add(new UndeadMage());
        cards.add(new VampireAcolyte());
        cards.add(new VolcanicDragaon());
        cards.add(new DarkKnight());
        cards.add(new GreaterDragon());
        cards.add(new Kraken());
        cards.add(new NobleElf());
        cards.add(new OgreWarchief());
        cards.add(new VampirePrince());
        cards.add(new Cerberus());
        cards.add(new Igneel());
        cards.add(new Neptune());
        cards.add(new ArcaneBolt());
        cards.add(new BloodFeast());
        cards.add(new FirstAidKit());
        cards.add(new GreaterPurge());
        cards.add(new HealingWard());
        cards.add(new LunarBlessing());
        cards.add(new MagicSeal());
        cards.add(new MeteorShower());
        cards.add(new PoisonousCauldron());
        cards.add(new ReapersScythe());
        cards.add(new StrategicRetreat());
        cards.add(new TakeAllYouCan());
        cards.add(new ThrowingKnives());
        cards.add(new Tsunami());
        cards.add(new WarDrum());

        return cards;
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