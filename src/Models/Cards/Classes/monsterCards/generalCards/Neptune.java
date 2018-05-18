package Models.Cards.Classes.monsterCards.generalCards;

import Models.Battle;
import Models.Cards.Classes.Heroes;
import Models.Cards.Classes.Race;

public class Neptune extends Heroes {
    public Neptune() {
        super("Neptune", 2200, 2500, 10, Race.Atlantians, true, false);
        setBattleCryDetails("Call to Arms: Select and move a card from hand to play field");
        setSpellDetails("Trident Beam: Deal 800 damage to three random enemy monster cards or player");
        setWillDetails("Ocean’s Cry: Deal 400 damage to all enemy monster cards and player and increase" +
                "\nall friendly Atlantian monster cards’ AP by 500");
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
