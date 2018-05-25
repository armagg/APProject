package Models.Cards.Classes.monsterCards.spellCasterCards;

import Control.Functions.Operators;
import Models.Battle;
import Models.Cards.Classes.Card;
import Models.Cards.Classes.Monster;
import Models.Cards.Classes.Race;
import Models.Cards.Classes.SpellCasters;
import Models.Fields.Place;

import java.util.ArrayList;

public final class ElvenSorceress extends SpellCasters {
    public ElvenSorceress() {
        super("Elven sorceress", 1000, 1000, 7, Race.Elves, true, false);
        setSpellDetails("Arcane Explosion: Deal 400 damage to all enemy monster cards and remove a random spell card " +
                "\nfrom enemy field and move it to graveyard.");
    }

    @Override
    public void DoSpell(Battle battle) {
        for (Monster monster : battle.getOtherField().getMonsterField().returnMonsters()) {
            monster.reduceHP(400);
        }
        Card card = battle.getOtherField().getSpellField().getRandomCard();
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(card);
        Operators.replaceCards(battle.getOtherField(), cards, Place.SPELLFIELD, Place.GRAVEYARD);
        setSpellUsed(true);
    }
}
