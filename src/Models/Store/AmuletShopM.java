package Models.Store;

import Control.inShop.StaticFunctiontoHandle;
import Models.Eqiupments.Amulet;
import Models.Eqiupments.amulets.*;

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

    public static Amulet makeAmuletInS(String name){
        switch (name){
            case "iron pendant":
                return new IronPendant();
            case "gold pendant":
                return new GoldPendant();
            case "diamond pendant":
                return new DiamondPendant();
            case "iron ring":
                return new IronRing();
            case "gold ring":
                return new GoldRing();
            case "diamond ring":
                return new DiamondRing();
        }
        return null;
    }
}
