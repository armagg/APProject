package view.EditClasses;

import Models.Eqiupments.Amulet;

public class EditAmulets {
    public void help(){
        System.out.println("1. equip \"Amulets name\": To equip the palyer with an amulet");
        System.out.println("2. remove amulet: To remove an amulet equipped with the player (if is equipped)");
        /**TODO if is not**/
        System.out.println("3.Info \"amulet name\": To get more information about a specific amulet");
        System.out.println("4.Exit: To return to the previous section");
    }

    public void equipped(String name){
        System.out.println(name + " was equipped on the player");

    }

    public void rmoveEquiption(String name){
        System.out.println(name + " was removed!");
    }

    public void info(Amulet amulet){
        System.out.println(amulet.getName() + ":");
        System.out.println(amulet.toString());
    }
}
