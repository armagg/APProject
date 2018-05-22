package Models.Cards.Classes.monsterCards.generalCards;

import Models.Battle;
import Models.Cards.Classes.Generals;
import Models.Cards.Classes.Race;

public final class OgreWarchief extends Generals {
    public OgreWarchief() {
        super("Orge Warchief", 2500, 1500, 700, Race.ORGES, false, false);
        setBattleCryDetails("Titan’s Fall: Deal 400 damage to all enemy monster cards and player");
        setWillDetails("Last Order: Increase all friendly monster cards’ AP by 300");
    }

    @Override
    public void doBattleCry(Battle battle) {

    }

    @Override
    public void doWill(Battle battle) {

    }
}
