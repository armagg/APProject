package Control;

import Control.inShop.ShopHandle;
import Models.Cards.Classes.Card;
import Models.Cards.Classes.monsterCards.generalCards.*;
import Models.Cards.Classes.monsterCards.heroCards.Cerberus;
import Models.Cards.Classes.monsterCards.heroCards.Igneel;
import Models.Cards.Classes.monsterCards.heroCards.Neptune;
import Models.Cards.Classes.monsterCards.normalCards.*;
import Models.Cards.Classes.monsterCards.spellCasterCards.*;
import Models.Cards.Classes.spellCards.*;
import Models.Cards.Classes.monsterCards.generalCards.NobleElf;
import Models.Eqiupments.Amulet;
import Models.Eqiupments.Item;
import Models.Eqiupments.amulets.IronRing;
import Models.Eqiupments.items.SmallHPPotion;
import Models.Fields.Deck;
import Models.Heroes.Hero;
import Models.Heroes.demonHero.DarkCity;
import Models.Heroes.demonHero.MountainsideVillage;
import Models.Heroes.demonHero.TowerOfInferno;
import Models.Heroes.demonHero.TownInThePlains;
import Models.Heroes.Hero;
import Models.Store.AmuletShopM;
import Models.Store.CardShopM;
import Models.Store.EditClasees.EditAmuletM;
import Models.Store.EditClasees.EditDeckM;
import Models.Store.EditClasees.EditInventoryM;
import Models.Store.ItemShopM;
import Models.Store.Store;

import java.util.ArrayList;

import Models.Eqiupments.amulets.*;
import Models.Eqiupments.items.*;
import Models.Fields.Inventory;
import view.EditClasses.EditDeck;
import view.EditClasses.EditInventory;
import view.shopMenu.AmuletShop;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {


        Store store;
        Deck deck;
        Inventory inventory;
        CardShopM cardShopM;
        AmuletShopM amuletShopM;
        ItemShopM itemShopM;
        Hero hero;
        EditDeckM editDeckM;
        EditInventoryM editInventoryM;
        EditAmuletM editAmuletM;

        Hero townInThePlains = new TownInThePlains(inventoryOfTownInThePlains());
        Hero darkcity = new DarkCity(inventoryOfDarkCity());
        Hero towerOfInferno = new TowerOfInferno(inventoryOfTowerOfInferno());
        Hero mountainsideVillage = new MountainsideVillage(inventoryOfMountainsideVillage());

        ArrayList<Item> itemsInItemShop= returnItems();
        ArrayList<Amulet> amuletsInAmulet = returnAmulets();
        ArrayList<Card> cardsInCardShop = new ArrayList<>();

        deck = returnDeck();
        inventory = returnInventory();


        hero = new Hero(inventory);
        cardShopM = new CardShopM(cardsInCardShop);
        amuletShopM = new AmuletShopM(amuletsInAmulet);
        itemShopM = new ItemShopM(itemsInItemShop);
        store = new Store(cardShopM, amuletShopM, itemShopM);
        editDeckM = new EditDeckM(deck.getCardsOnDeck(), deck.getCards());
        editAmuletM = new EditAmuletM(hero,new AmuletShop());

        ShopHandle shopHandle = new ShopHandle(store,deck,hero,editDeckM, editAmuletM);


    }
    static Inventory returnInventory(){
        Inventory inventory = new Inventory();
        ElvenRanger elvenRanger1 = new ElvenRanger();
        inventory.addCard(elvenRanger1);
        ElvenRanger elvenRanger2 = new ElvenRanger();
        inventory.addCard(elvenRanger2);
        ElvenHunter elvenHunter1 = new ElvenHunter();
        ElvenHunter elvenHunter2 = new ElvenHunter();
        inventory.addCard(elvenHunter1);
        inventory.addCard(elvenHunter2);
        ElvenGuardsMan elvenGuardsMan1 = new ElvenGuardsMan();
        inventory.addCard(elvenGuardsMan1);
        ElvenAssassin elvenAssassin = new ElvenAssassin();
        inventory.addCard(elvenAssassin);
        inventory.addCard(new ElvenDruid());
        inventory.addCard(new LesserWhelp());
        inventory.addCard(new LesserWhelp());
        inventory.addCard(new Dragonlling());
        inventory.addCard(new Dragonlling());
        inventory.addCard(new ArmoredDragon());
        inventory.addCard(new YellowDrake());
        inventory.addCard(new BlueDragon());
        inventory.addCard(new MurlocCrawler());
        inventory.addCard(new MurlocCrawler());
        inventory.addCard(new MurlocWarrior());
        inventory.addCard(new MurlocWarrior());
        inventory.addCard(new SharkMan());
        inventory.addCard(new GiantCrab());
        inventory.addCard(new NagaSiren());
        for(int i = 0 ; i < 3 ; i++)
            inventory.addCard(new FirstAidKit());
        for(int i = 0 ; i < 3 ; i++)
            inventory.addCard(new ThrowingKnives());
        inventory.addCard(new PoisonousCauldron());
        inventory.addCard(new HealingWard());
        inventory.addCard(new WarDrum());


        return inventory;

    }

    static Deck returnDeck(){
        Inventory inventory = returnInventory();
        ArrayList<Card> cards = inventory.getCards();
        Deck deck = new Deck();
        for(Card card:cards){
            deck.addCard(card);
        }
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
        inventory.addCard(new OgreWarrior(),6);
        inventory.addCard(new OgreFrontliner(),4);
        inventory.addCard(new OgreMagi() , 2);
        inventory.addCard(new OgreWarchief(),1);
        inventory.addCard(new ThrowingKnives(),3);
        inventory.addCard(new FirstAidKit(),3);
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