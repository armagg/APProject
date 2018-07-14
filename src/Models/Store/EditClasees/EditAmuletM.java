package Models.Store.EditClasees;

import Models.Eqiupments.Amulet;
import Models.Heroes.Hero;
import view.shopMenu.AmuletShop;

public class EditAmuletM {
    Hero hero;
    AmuletShop amuletShop;

    public EditAmuletM(Hero hero, AmuletShop amuletShop) {
        this.hero = hero;
        this.amuletShop = amuletShop;
    }

    public void EquipAmulet(Amulet amulet){
        hero.setEquipAmulet(amulet);
        hero.setEquipped(true);
    }

    public void removeEquippedAmulet(Amulet amulet){
        hero.setEquipped(false);
        hero.setEquipAmulet(null);

    }

    public void info(Amulet amulet){
        amuletShop.info(amulet);
    }
}
