package Models.Fields;

import Models.Cards.Classes.Card;

import java.util.ArrayList;

public class Field {
    private Deck deck;
    private GraveYard graveYard;
    private Hand hand;
    private MonsterField monsterField;
    private SpellField spellField;
    private Gamer gamer;


    public ArrayList<Card> getAllCards() {
        ArrayList<Card> cards = new ArrayList<>(15);
        cards.addAll(hand.getCards());
        cards.addAll(monsterField.getCards());
        cards.addAll(spellField.getCards());

        return cards;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public GraveYard getGraveYard() {
        return graveYard;
    }

    public void setGraveYard(GraveYard graveYard) {
        this.graveYard = graveYard;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public MonsterField getMonsterField() {
        return monsterField;
    }

    public SpellField getSpellField() {
        return spellField;
    }

    public void setSpellField(SpellField spellField) {
        this.spellField = spellField;
    }

    public void setMonsterField(MonsterField monsterField) {
        this.monsterField = monsterField;
    }

    public Gamer getGamer() {
        return gamer;
    }

    public void setGamer(Gamer gamer) {
        this.gamer = gamer;
    }

    public SuperField returnField(Place place){
        switch (place){
            case DECK:
                return this.getDeck();
            case HAND:
                return this.getHand();
            case GRAVEYARD:
                return this.getGraveYard();
            case SPELLFIELD:
                return this.getSpellField();
            default:
                return this.getMonsterField();
        }
    }


}