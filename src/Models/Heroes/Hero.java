package Models.Heroes;

import Control.inShop.StaticFunctiontoHandle;
import Models.Battle;
import Models.Cards.Classes.Card;
import Models.Cards.Classes.Monster;
import Models.Cards.Classes.SpellCards;
import Models.Eqiupments.Amulet;
import Models.Eqiupments.Item;
import Models.Fields.Inventory;

import java.util.ArrayList;
import java.util.HashMap;

public class Hero {


    private String name;
    private int HP;
    private boolean isEquipped;
    private Amulet equipAmulet;
    private int gil;
    private Inventory inventory;

    private int MP = 0;
    private int maxMP = 0;
    private int maxMaxMP = 10;

    public void doRound(Battle battle) {
        ArrayList<Card> cardsTofield = new ArrayList<>();
        int mp = maxMP;
        for (int j = 1; j <= mp; j++) {
            for (Card card : battle.getCurrentField().getDeck().getCards()) {
                if (card.getMP() == j) {
                    cardsTofield.add(card);
                    mp -= j;
                }
            }
        }
        for (Card card : cardsTofield) {
            if (card instanceof SpellCards) {
                battle.getCurrentField().getHand().getCards().remove(card);
                battle.getCurrentField().getSpellField().addCard(card);
            } else if (card instanceof Monster) {
                battle.getCurrentField().getHand().getCards().remove(card);
                battle.getCurrentField().getMonsterField().addCard(card);
            }
        }


    }

    public void addMaxMP(int amount) {
        this.maxMP += amount;
    }

    public int getMaxMP() {
        return maxMP;
    }


    public void setMaxMP(int maxMP) {
        this.maxMP = maxMP;
    }

    public int getMaxMaxMP() {
        return maxMaxMP;
    }

    public void setMaxMaxMP(int maxMaxMP) {
        this.maxMaxMP = maxMaxMP;
    }

    public void setAmulets(ArrayList<Amulet> amulets) {
        this.amulets = amulets;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Hero(Inventory inventory) {

        this.inventory = inventory;
    }

    public int getMP() {
        return MP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public int getGil() {
        return gil;
    }

    public void setGil(int gil) {
        this.gil = gil;
    }

    private ArrayList<Amulet> amulets = new ArrayList<>(3);

    private ArrayList<Item> items = new ArrayList<>(3);

    private HashMap<String, Integer> numberOfHeroThings = new HashMap<>();

    public HashMap<String, Integer> getNumberOfHeroThings() {
        return numberOfHeroThings;
    }

    public void setNumberOfHeroThings(HashMap<String, Integer> numberOfHeroThings) {
        this.numberOfHeroThings = numberOfHeroThings;
    }

    public Amulet getEquipAmulet() {
        return equipAmulet;
    }

    public void setEquipAmulet(Amulet equipAmulet) {
        this.equipAmulet = equipAmulet;
    }

    public boolean isEquipped() {
        return isEquipped;
    }

    public void setEquipped(boolean equipped) {
        isEquipped = equipped;
    }

    public void addItem(Item item,int i) {
        items.add(item);
        for(int j = 0 ; j < i ; j++)
            StaticFunctiontoHandle.add(numberOfHeroThings, item);
    }

    public boolean deleteItem(Item item, int i) {
        for(int j = 0 ; j < i ; j++)
            StaticFunctiontoHandle.remove(numberOfHeroThings, item);

        if (items.contains(item)) {
            items.remove(item);
            return true;
        }
        return false;
    }

    public void addAmulet(Amulet amulet, int i) {
        amulets.add(amulet);
        for(int j = 0 ; j < i ; j++)
            StaticFunctiontoHandle.add(numberOfHeroThings, amulet);
    }

    public boolean deleteAmulet(Amulet amulet, int i) {
        for(int j = 0 ; j < i ; j++)
            StaticFunctiontoHandle.remove(numberOfHeroThings, amulet);
        if (amulets.contains(amulet)) {
            amulets.remove(amulet);
            return true;
        }
        return false;
    }

    public ArrayList<Amulet> getAmulets() {
        return amulets;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void addHP(int amount) {
        HP+=amount;
    }

    public void reduceHP(int amount) {
        HP -= amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addMP(int amount){
        MP+=amount;
    }

    public void reduceMP(int amount){
        MP-=amount;
    }

    public void resetMP(){
        if(maxMP < maxMaxMP)
            maxMP ++;
        MP = maxMP;
    }

}
