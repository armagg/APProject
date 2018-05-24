package Models.Cards.Classes.monsterCards.generalCards;

import Control.Functions.Operators;
import Models.Battle;
import Models.Cards.Classes.Generals;
import Models.Cards.Classes.Monster;
import Models.Cards.Classes.Race;
import Models.Fields.Place;

import java.util.ArrayList;
import java.util.List;

public final class NobleElf extends Generals {
    public NobleElf() {
        super("Noble Elf", 2000, 2400, 9, Race.Elves, false, false);
        setWillDetails("Increase a random friendly Elven monster card on the field’s HP by 800 and AP by 600");
        setBattleCryDetails("Purge: Remove all enemy spell cards on the field and move them to hand");
    }


    @Override
    public void doBattleCry(Battle battle) {
        Operators.replaceCards(battle.getOtherField(), battle.getOtherField().getSpellField().getCards(), Place.SPELLFIELD, Place.HAND);
    }

    @Override
    public void doWill(Battle battle) {
        boolean hasWork = false;
        List<Monster> monsters = new ArrayList<>();
        for (Monster monster : monsters) {
            if (monster.getRace() == Race.Elves && !hasWork) {
                monster.addHP(800);
                monster.addAP(600);
                hasWork = true;
            }
        }
    }
}
