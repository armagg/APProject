package Models.Heroes;

import Models.Eqiupments.Amulet;
import Models.Eqiupments.Item;

import java.util.ArrayList;

public class Hero {


    private String name;
    private int HP;
    private boolean isEquipped;
    private Amulet equipAmulet;
    private int gil;

    public int getGil() {
        return gil;
    }

    public void setGil(int gil) {
        this.gil = gil;
    }

    private ArrayList<Amulet> amulets = new ArrayList<>(3);

    private ArrayList<Item> items = new ArrayList<>(3);

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

    public void addItem(Item item) {
        items.add(item);
    }

    public boolean deleteItem(Item item) {
        if (items.contains(item)) {
            items.remove(item);
            return true;
        }
        return false;
    }

    public void addAmulet(Amulet amulet) {
        amulets.add(amulet);
    }

    public boolean deleteAmulet(Amulet amulet) {
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
}
