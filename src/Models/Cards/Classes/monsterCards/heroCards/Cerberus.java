package Models.Cards.Classes.monsterCards.heroCards;

import Models.Battle;
import Models.Cards.Classes.Heroes;
import Models.Cards.Classes.Race;

public class Cerberus extends Heroes {
    public Cerberus() {
        super("Cerberus", 3000, 2000, 10, Race.Demonic, true, false);
        setBattleCryDetails("Open the Gate: Draw three cards from deck to hand");
        setSpellDetails("Hellfire: Deal 300 damage to all enemy monster cards and Increase HP and AP of" +
                "\nall friendly monster cards by 300");
        setWillDetails("Revenge of the Two Heads: Send two random enemy monster cards from field to garveyard");
    }

    @Override
    public void doSpell(Battle battle) {

    }

    @Override
    public void doWill(Battle battle) {

    }

    @Override
    public void doBattleCry(Battle battle) {

    }
}
