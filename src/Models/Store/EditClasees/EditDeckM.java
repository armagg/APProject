package Models.Store.EditClasees;

import Models.Cards.Classes.Card;
import Models.Cards.Classes.Monster;
import Models.Cards.Classes.SpellCards;
import view.shopMenu.CardShop;

import java.util.ArrayList;
import java.util.HashMap;

public class EditDeckM {
    private HashMap<String, Integer> cardSOnDeck;
    private ArrayList<Card> cards;
    private CardShop cardShop;

    public EditDeckM(HashMap<String, Integer> cardSOnDeck, ArrayList<Card> cards, view.shopMenu.CardShop cardShop) {
        this.cardSOnDeck = cardSOnDeck;
        this.cards = cards;
        this.cardShop = cardShop;
    }

    public void add(Card card){
        //TODO /*از جایی هم باید کم بشه*/
        cards.add(card);
    }

    public void remover(Card card){
        cards.remove(card);
    }


}