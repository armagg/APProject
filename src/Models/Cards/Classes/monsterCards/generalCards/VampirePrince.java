package Models.Cards.Classes.monsterCards.generalCards;

import Models.Battle;
import Models.Cards.Classes.Generals;
import Models.Cards.Classes.Race;

public final class VampirePrince extends Generals {
    public VampirePrince() {
        super("Vampire Prince", 2000, 2200, 9, Race.VAMPIERS, false, false);
        setWillDetails("Darkness: Reduce all enemy monster cards’ AP by 200 and increase friendly" +
                "\n monster cards’ AP by 200");
        setBattleCryDetails("Fear: Return two random enemy monster cards from field to hand");
    }

    @Override
    public void doBattleCry(Battle battle) {

    }

    @Override
    public void doWill(Battle battle) {

    }
}
