package Models.Cards.Classes.monsterCards.generalCards;

import Models.Battle;
import Models.Cards.Classes.Generals;
import Models.Cards.Classes.Race;

public final class DarkKnight extends Generals {
    public DarkKnight() {
        super("Dark Knight", 2500, 2500, 8, Race.Demonic, false, false);
        setWillDetails("Loyalty: Heal your player for 1000 HP");
        setBattleCryDetails("Sacrifice: Select and move a card from hand to graveyard");
    }

    @Override
    public void doBattleCry(Battle battle) {

    }

    @Override
    public void doWill(Battle battle) {

    }
}
