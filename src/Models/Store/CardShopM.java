package Models.Store;

import Control.inShop.StaticFunctiontoHandle;
import Models.Cards.Classes.Card;
import Models.Cards.Classes.monsterCards.generalCards.*;
import Models.Cards.Classes.monsterCards.heroCards.Cerberus;
import Models.Cards.Classes.monsterCards.heroCards.Igneel;
import Models.Cards.Classes.monsterCards.heroCards.Luthian;
import Models.Cards.Classes.monsterCards.heroCards.Neptune;
import Models.Cards.Classes.monsterCards.normalCards.*;
import Models.Cards.Classes.monsterCards.spellCasterCards.*;
import Models.Cards.Classes.spellCards.*;
import view.shopMenu.CardShop;

import java.util.ArrayList;

public class CardShopM extends Shop {
    private ArrayList<Card> cards;

    public CardShopM(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public CardShopM(){}

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public ArrayList<Card> getCards() {

        return cards;
    }

    public void addCard(Card card){
        StaticFunctiontoHandle.add(numbersOfThing, card);
        cards.add(card);
    }

    public void remove(Card card){
        StaticFunctiontoHandle.remove(numbersOfThing, card);
        if(cards.contains(card))
            cards.remove(card);
    }

    public static Card makeCardInShop(String name){
        switch (name){
            case "throwing knives":
                return new ThrowingKnives();
            case "poisonous cauldron":
                return new PoisonousCauldron();
            case "first aid kit":
                return new FirstAidKit();
            case "reaper's scythe":
                return new ReapersScythe();
            case "meteor shower":
                return new MeteorShower();
            case "lunar blessing":
                return new LunarBlessing();
            case "strategic retreat":
                return new StrategicRetreat();
            case "war drum":
                return new WarDrum();
            case "healing ward":
                return new HealingWard();
            case "blood feast":
                return new BloodFeast();
            case "tsunami":
                return new Tsunami();
            case "take all you can":
                return new TakeAllYouCan();
            case "arcane bolt":
                return new ArcaneBolt();
            case "greater purge":
                return new GreaterPurge();
            case "magic seal":
                return new MagicSeal();
            case "elven ranger":
                return new ElvenRanger();
            case "elven hunter":
                return new ElvenHunter();
            case "elven guardsman":
                return new ElvenGuardsMan();
            case "elven assassin":
                return new ElvenAssassin();
            case "elven druid":
                return new ElvenDruid();
            case "elven sorceress":
                return new ElvenSorceress();
            case "noble elf":
                return new NobleElf();
            case "luthien":
                return new Luthian();
            case "lesser whelp":
                return new LesserWhelp();
            case "dragonling":
                return new Dragonlling();
            case "armored dragon":
                return new ArmoredDragon();
            case "yellow drake":
                return new YellowDrake();
            case "blue dragon":
                return new BlueDragon();
            case "volcanic dragon":
                return new VolcanicDragaon();
            case "greater dragon":
                return new GreaterDragon();
            case "igneel":
                return new Igneel();
            case "murloc crawler":
                return new MurlocCrawler();
            case "murloc warrior":
                return new MurlocCrawler();
            case "giant crab":
                return new GiantCrab();
            case "shark man":
                return new SharkMan();
            case "naga siren":
                return new NagaSiren();
            case "sea serpent":
                return new SeaSerpent();
            case "kraken":
                return new Kraken();
            case "neptune":
                return new Neptune();
            case "goblin smuggler":
                return new GoblinSmuggler();
            case "goblin shaman":
                return new GoblinShaman();
            case "ogre warrior":
                return new OgreWarrior();
            case "ogre frontliner":
                return new OgreFrontliner();
            case "ogre magi":
                return new OgreMagi();
            case "ogre warchief":
                return new OgreWarchief();
            case "undead":
                return new Undead();
            case "giant bat":
                return new GiantBat();
            case "stout undead":
                return new StoutUndead();
            case "undead mage":
                return new UndeadMage();
            case "vampire acolyte":
                return new VampireAcolyte();
            case "vampire prince":
                return new VampirePrince();
            case "imp":
                return new Imp();
            case "shade":
                return new Shade();
            case "living armor":
                return new LivingArmor();
            case "hellhound":
                return new Hellhound();
            case "evil eye":
                return new EvilEye();
            case "necromancer":
                return new Necromancer();
            case "dark knight":
                return new DarkKnight();
            case "cerberus":
                return new Cerberus();

        }
        System.out.println("not found");
        return null;
    }

}
