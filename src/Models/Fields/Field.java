package Models.Fields;

public class Field {
    private Deck deck;
    private GraveYard graveYard;
    private Hand hand;
    private PlayField playField;
    private Gamer gamer;

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

    public PlayField getPlayField() {
        return playField;
    }

    public void setPlayField(PlayField playField) {
        this.playField = playField;
    }

    public Gamer getGamer() {
        return gamer;
    }

    public void setGamer(Gamer gamer) {
        this.gamer = gamer;
    }
}
