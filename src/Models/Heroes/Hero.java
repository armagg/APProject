package Models.Heroes;

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

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Hero(Inventory inventory) {

        this.inventory = inventory;
    }

    public int getGil() {
        return gil;
    }

    public void setGil(int gil) {
        this.gil = gil;
    }

    private ArrayList<Amulet> amulets = new ArrayList<>(3);

    private ArrayList<Item> items = new ArrayList<>(3);

    HashMap<String, Integer> numberOfHeroThings = new HashMap<>();


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
        if(numberOfHeroThings.containsKey(item.getName())){
            int val = numberOfHeroThings.get(item.getName());
            numberOfHeroThings.remove(item.getName());
            val++;
            numberOfHeroThings.put(item.getName(),val);
        }
        else {
            numberOfHeroThings.put(item.getName(),1);
        }
    }

    public boolean deleteItem(Item item) {
        if(numberOfHeroThings.containsKey(item.getName())){
            if(numberOfHeroThings.get(item.getName()) == 1){
                numberOfHeroThings.remove(item.getName());
            }else {
                int val = numberOfHeroThings.get(item.getName());
                val--;
                numberOfHeroThings.remove(item.getName());
                numberOfHeroThings.put(item.getName(), val);
            }

        }
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
