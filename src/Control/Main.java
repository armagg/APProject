package Control;

import Models.Cards.Classes.Card;
import Models.Cards.Classes.monsterCards.generalCards.*;
import Models.Cards.Classes.monsterCards.heroCards.Cerberus;
import Models.Cards.Classes.monsterCards.heroCards.Igneel;
import Models.Cards.Classes.monsterCards.heroCards.Neptune;
import Models.Cards.Classes.monsterCards.normalCards.*;
import Models.Cards.Classes.monsterCards.spellCasterCards.*;
import Models.Cards.Classes.spellCards.*;
import Models.Cards.Classes.Card;
import Models.Cards.Classes.monsterCards.generalCards.NobleElf;
import Models.Eqiupments.Amulet;
import Models.Eqiupments.Item;
import Models.Eqiupments.amulets.IronRing;
import Models.Eqiupments.items.SmallHPPotion;
import Models.Fields.Deck;
import Models.Store.AmuletShopM;
import Models.Store.CardShopM;
import Models.Store.ItemShopM;
import Models.Store.Store;

import java.lang.reflect.Array;
import java.util.ArrayList;

import Models.Cards.Classes.Normal;
import Models.Eqiupments.Amulet;
import Models.Eqiupments.Item;
import Models.Eqiupments.amulets.*;
import Models.Eqiupments.items.*;
import Models.Fields.Inventory;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
       Store store;
       Deck deck;
       CardShopM cardShopM;
       AmuletShopM amuletShopM;
       ItemShopM itemShopM;

       ArrayList<Item> itemsInItemShop= returnItems();
       ArrayList<Amulet> amuletsInAmulet = returnAmulets();
       ArrayList<Card> cardsInCardShop = new ArrayList<>();

       deck = returnDeck();
       cardShopM = new CardShopM(cardsInCardShop);
       amuletShopM = new AmuletShopM(amuletsInAmulet);
       itemShopM = new ItemShopM(itemsInItemShop);
       store = new Store(cardShopM, amuletShopM, itemShopM);


    }
    static Deck returnDeck(){
        Deck deck = new Deck();
        ElvenRanger elvenRanger1 = new ElvenRanger();
        deck.addCard(elvenRanger1);
        ElvenRanger elvenRanger2 = new ElvenRanger();
        deck.addCard(elvenRanger2);
        ElvenHunter elvenHunter1 = new ElvenHunter();
        ElvenHunter elvenHunter2 = new ElvenHunter();
        deck.addCard(elvenHunter1);
        deck.addCard(elvenHunter2);
        ElvenGuardsMan elvenGuardsMan1 = new ElvenGuardsMan();
        deck.addCard(elvenGuardsMan1);
        ElvenAssassin elvenAssassin; = new ElvenAssassin();
        deck.addCard(elvenAssassin);
        deck.addCard(new ElvenDruid());
        deck.addCard(new LesserWhelp());
        deck.addCard(new LesserWhelp());
        deck.addCard(new Dragonlling());
        deck.addCard(new Dragonlling());
        deck.addCard(new ArmoredDragon());
        deck.addCard(new YellowDrake());
        deck.addCard(new BlueDragon());
        deck.addCard(new MurlocCrawler());
        deck.addCard(new MurlocCrawler());
        deck.addCard(new MurlocWarrior());
        deck.addCard(new MurlocWarrior());
        deck.addCard(new SharkMan());
        deck.addCard(new GiantCrab());
        deck.addCard(new NagaSiren());
        for(int i = 0 ; i < 3 ; i++)
            deck.addCard(new FirstAidKit());
        for(int i = 0 ; i < 3 ; i++)
            deck.addCard(new ThrowingKnives());
        deck.addCard(new PoisonousCauldron());
        deck.addCard(new HealingWard());
        deck.addCard(new WarDrum());

        return deck;

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

    public static Inventory inventoryOfMountainsideVillage(){
        Inventory inventory = new Inventory();
        inventory.addCard(new GoblinSmuggler(),10);
        inventory.addCard(new ThrowingKnives(),5);
        inventory.addCard(new GoblinShaman(),5);
        return inventory;
    }

    public static Inventory inventoryOfTownInThePlains(){
        Inventory inventory = new Inventory();
        inventory.addCard(new OgreWarrior,6);
        inventory.addCard(new OgreFrontliner(),4);
        inventory.addCard(new OgreMagi() , 2);
        inventory.addCard(new OgreWarchief(),1);
        inventory.addCard(new ThrowingKnives(),3);
        inventory.addCard(new FirstAidKit,3);
        inventory.addCard(new PoisonousCauldron(),1);
        return inventory;
    }

    public static Inventory inventoryOfDarkCity(){
        Inventory inventory = new Inventory();
        inventory.addCard(new Undead(),4);
        inventory.addCard(new GiantBat(),3);
        inventory.addCard(new StoutUndead(),3);
        inventory.addCard(new UndeadMage() , 2);
        inventory.addCard(new VampireAcolyte(),1);
        inventory.addCard(new VampirePrince(),1);
        inventory.addCard(new BloodFeast() , 3);
        inventory.addCard(new FirstAidKit(),2);
        inventory.addCard(new WarDrum(),1);
        inventory.addCard(new PoisonousCauldron(),1);
        inventory.addCard(new HealingWard(),1);
        inventory.addCard(new GreaterPurge(),1);
        return inventory;
    }

    public static Inventory inventoryOfTowerOfInferno(){
        Inventory inventory = new Inventory();
        inventory.addCard(new Imp(),4);
        inventory.addCard(new Shade(), 3);
        inventory.addCard(new LivingArmor(),3);
        inventory.addCard(new Hellhound(),2);
        inventory.addCard(new EvilEye(),2);
        inventory.addCard(new Necromancer(),2);
        inventory.addCard(new DarkKnight(),1);
        inventory.addCard(new Cerberus(),1);
        inventory.addCard(new ReapersScythe(),3);
        inventory.addCard(new FirstAidKit(),3);
        inventory.addCard(new StrategicRetreat(),1);
        inventory.addCard(new HealingWard(),2);
        inventory.addCard(new WarDrum(),1);
        inventory.addCard(new MeteorShower(),1);
        inventory.addCard(new MagicSeal(),1);
        return inventory;
    }

}