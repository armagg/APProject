package Models.Cards.Classes.monsterCards.generalCards;

import Models.Battle;
import Models.Cards.Classes.Heroes;
import Models.Cards.Classes.Race;

public class Igneel extends Heroes {
    public Igneel() {
        super("Ignell", 4000, 800, 10, Race.DragonBreed, false, false);
        setWillDetails("King’s Wail: Decrease all enemy monster cards’ AP by 400");
        setSpellDetails("King’s Wing Slash: Deal 600 damage to all enemy monster cards and player");
        setBattleCryDetails("King’s Grace: Send all non-Hero monster cards on both sides of field to their graveyards");
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
