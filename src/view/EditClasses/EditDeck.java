package view.EditClasses;

import Models.Cards.Classes.Monster;
import Models.Cards.Classes.SpellCards;
import view.shopMenu.CardShop;

public class EditDeck {
    public void help(){
        System.out.println("1. Add \"Card name\" #CardSlotNum: To add cards to your deck");
        System.out.println("2. Remove \"Card name\" #CardSlotNum: To move cards from your deck");
        System.out.println("4. Info \"Card name\" To get more information about a specific card");
        System.out.println("4. Exit: To return to the previous section");
    }

    public void added(String name, int number){
        System.out.println(name + " was added to slot" + number);
    }

    public void removed(String name, int number){
        System.out.println(name + " was removed from slot" + number);
    }

    public void MonsterInfo(Monster card){
        CardShop.MonsterInfo(card);
    }

    public void spellInfo(SpellCards card){
        CardShop.spellInfo(card);
    }

}
