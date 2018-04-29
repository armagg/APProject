package Models.Cards;

public class SpellCasters extends Monster {
    private boolean isSpellUsed = false;


    public boolean isSpellUsed() {
        return isSpellUsed;
    }

    public void setSpellUsed(boolean spellUsed) {
        isSpellUsed = spellUsed;
    }
}
