package Models.Cards.Classes.spellCards;

import Control.Functions.Operators;
import Models.Battle;
import Models.Cards.Classes.Card;
import Models.Cards.Classes.SpellCards;
import Models.Cards.Classes.SpellType;
import Models.Fields.Place;

import java.util.ArrayList;
import java.util.Random;

public class ReapersScythe extends SpellCards {
    public ReapersScythe() {
        super("Reaper's Scythe", 4, SpellType.INSTANT);
        setSpellDetails("Send an enemy monster or spell card from field to graveyard");
    }

    @Override
    public void negativeSpell(Battle battle) {

    }

    @Override
    public void doSpell(Battle battle) {
        Random random = new Random();
        ArrayList<Card> cards = new ArrayList<>();

        if (random.nextBoolean()) {
            cards.add(battle.getOtherField().getSpellField().getRandomCard());
            Operators.replaceCards(battle.getOtherField(), cards, Place.SPELLFIELD, Place.GRAVEYARD);
        } else {
            cards.add(battle.getOtherField().getMonsterField().getRandomCard());
            Operators.replaceCards(battle.getOtherField(), cards, Place.MONSTERFIELD, Place.GRAVEYARD);
        }

    }
}
