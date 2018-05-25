package Models.Heroes.demonHero;

import Models.Fields.Inventory;
import Models.Heroes.Hero;

public class TowerOfInferno extends Hero{
    public TowerOfInferno(Inventory inventory){
        super(inventory);
    }

    @Override
    public void reduceHP(int amount) {
        amount *= 0.8;
        super.reduceHP(amount);
    }
}


