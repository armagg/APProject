package Models.Cards.Classes.monsterCards.generalCards;

import Models.Battle;
import Models.Cards.Classes.Generals;
import Models.Cards.Classes.Race;

public final class GreaterDragon extends Generals {
    public GreaterDragon() {
        super("Greater Dragon", 2000, 1800, 8, Race.DragonBreed, false, false);
        setWillDetails("Dragon’s Call: draw two cards from deck to hand");
        setBattleCryDetails("Devour: Send a random enemy monster card from field to graveyard");
    }

    @Override
    public void doBattleCry(Battle battle) {
    }

    @Override
    public void doWill(Battle battle) {
    }
}
