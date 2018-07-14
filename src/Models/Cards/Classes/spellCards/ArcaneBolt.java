package Models.Cards.Classes.spellCards;

import Control.Functions.Operators;
import Models.Battle;
import Models.Cards.Classes.Card;
import Models.Cards.Classes.SpellCards;
import Models.Cards.Classes.SpellType;
import Models.Fields.Place;
import Models.Turn;

import java.util.ArrayList;

public class ArcaneBolt extends SpellCards {
    public ArcaneBolt() {
        super("Arcane Bolt", 5, SpellType.INSTANT);
        setSpellDetails("Deal 500 damage to enemy player and select and move an enemy spell" +
                "\ncard from field to graveyard");
    }

    @Override
    public void doSpell(Battle battle) {
        if (battle.getTurn() == Turn.HUMAN) {
            battle.getRivalHero().reduceHP(500);
        } else
            battle.getPlayerHero().reduceHP(500);

        Card card = battle.getCurrentField().getSpellField().getRandomCard();
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(card);
        Operators.replaceCards(battle.getOtherField(), cards, Place.SPELLFIELD, Place.GRAVEYARD);
    }

    @Override
    public void negativeSpell(Battle battle) {
    }
}
