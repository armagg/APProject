package Models.Spell;

import Models.Fields.Place;

public class Spell {
    private Spellkind spellkind;
    private SpellChangeTarget spellChangeTarget;
    private SpellCollectionType spellCollectionType;
    private int number;
    private Place origin;
    private Place destination;
    private int amount;


    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Spell(String details) {


    }

    public Place getOrigin() {
        return origin;
    }

    public void setOrigin(Place origin) {
        this.origin = origin;
    }

    public Place getDestination() {
        return destination;
    }

    public void setDestination(Place destination) {
        this.destination = destination;
    }

    public Spellkind getSpellkind() {
        return spellkind;
    }

    public void setSpellkind(Spellkind spellkind) {
        this.spellkind = spellkind;
    }

    public SpellChangeTarget getSpellChangeTarget() {
        return spellChangeTarget;
    }

    public void setSpellChangeTarget(SpellChangeTarget spellChangeTarget) {
        this.spellChangeTarget = spellChangeTarget;
    }

    public SpellCollectionType getSpellCollectionType() {
        return spellCollectionType;
    }

    public void setSpellCollectionType(SpellCollectionType spellCollectionType) {
        this.spellCollectionType = spellCollectionType;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getAmount() {
        return amount;
    }
}
