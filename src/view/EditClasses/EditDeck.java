package view.EditClasses;

import Models.Cards.Classes.Card;
import Models.Cards.Classes.Monster;
import Models.Cards.Classes.SpellCards;
import Models.Fields.Deck;
import Models.Store.CardShopM;
import view.shopMenu.CardShop;
import view.shopMenu.CardShop;

import java.util.Scanner;

public class EditDeck {
    private CardShop cardShop;
    private Scanner sc = new Scanner (System.in);

    public EditDeck(CardShop cardShop) {
        this.cardShop = cardShop;
    }

    public String help(){
        System.out.println("1. Add \"Card name\" #CardSlotNum: To add cards to your deck");
        System.out.println("2. Remove \"Card name\" #CardSlotNum: To move cards from your deck");
        System.out.println("4. Info \"Card name\" To get more information about a specific card");
        System.out.println("4. Exit: To return to the previous section");
        return sc.nextLine();
    }
    public void added(String name){
        System.out.println(name + " was added");
    }

    public void removed(String name){
        System.out.println(name + " was removed");
    }

    public void info(Card card){
        if(card instanceof SpellCards){
            cardShop.spellInfo((SpellCards)card);
        }
        else if(card instanceof Monster){
            cardShop.MonsterInfo((Monster) card);
        }

    }

}
