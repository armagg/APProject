package Models.Cards.Classes.monsterCards.generalCards;

import Models.Battle;
import Models.Cards.Classes.Generals;
import Models.Cards.Classes.Race;

public final class NobleElf extends Generals {
    public NobleElf() {
        super("Noble Elf", 2000, 2400, 9, Race.Elves, false, false);
        setWillDetails("Increase a random friendly Elven monster card on the field’s HP by 800 and AP by 600");
        setBattleCryDetails("Purge: Remove all enemy spell cards on the field and move them to hand");
    }


    @Override
    public void doBattleCry(Battle battle) {
    }

    @Override
    public void doWill(Battle battle) {
    }
}
