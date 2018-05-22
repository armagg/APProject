package Models.Store;

import Control.inShop.StaticFunctiontoHandle;
import Models.Eqiupments.Amulet;

import java.util.ArrayList;

public class AmuletShopM extends Shop {
    private ArrayList <Amulet> amulets;

    public AmuletShopM(ArrayList<Amulet> amulets) {
        this.amulets = amulets;
    }

    public ArrayList<Amulet> getAmulets() {
        return amulets;
    }

    public void setAmulets(ArrayList<Amulet> amulets) {
        this.amulets = amulets;
    }
    public void addAmulet(Amulet amulet){
        StaticFunctiontoHandle.add(numbersOfThing, amulet);
        amulets.add(amulet);

    }

    public void removeAmulet(Amulet amulet){
        StaticFunctiontoHandle.remove(numbersOfThing, amulet);
        if(amulets.contains(amulet)){
            amulets.remove(amulet);
        }
    }
}
