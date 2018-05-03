package Models.Cards.Classes;

public class Heroes extends Monster {
    private boolean isSpellUsed = false;

    private boolean inGraveYard;

    public boolean isSpellUsed() {
        return isSpellUsed;
    }

    public void setSpellUsed(boolean spellUsed) {
        isSpellUsed = spellUsed;
    }
}
