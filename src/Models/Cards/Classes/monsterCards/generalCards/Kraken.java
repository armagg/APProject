package Models.Cards.Classes.monsterCards.generalCards;

import Models.Battle;
import Models.Cards.Classes.Generals;
import Models.Cards.Classes.Race;

public final class Kraken extends Generals {
    public Kraken() {
        super("Kraken", 1800, 2200, 8, Race.Atlantians, false, false);
        setBattleCryDetails("Titan’s Presence: Return one random enemy monster card from field to hand and reduce " +
                "\n" +
                "all enemy monsters’ AP by 200");
        setWillDetails("Titan’s Fall: Deal 400 damage to all enemy monster cards and player");
    }

    @Override
    public void doBattleCry(Battle battle) {
    }

    @Override
    public void doWill(Battle battle) {
    }
}
