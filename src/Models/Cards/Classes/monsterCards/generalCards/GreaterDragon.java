package Models.Cards.Classes.monsterCards.generalCards;

import Control.Functions.Operators;
import Models.Battle;
import Models.Cards.Classes.Card;
import Models.Cards.Classes.Generals;
import Models.Cards.Classes.Race;
import Models.Fields.Place;

import java.util.ArrayList;

public final class GreaterDragon extends Generals {
    public GreaterDragon() {
        super("Greater Dragon", 2000, 1800, 8, Race.DragonBreed, false, false);
        setWillDetails("Dragon’s Call: draw two cards from deck to hand");
        setBattleCryDetails("Devour: Send a random enemy monster card from field to graveyard");
    }

    @Override
    public void doBattleCry(Battle battle) {
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(battle.getOtherField().getMonsterField().getRandomCard());
        Operators.replaceCards(battle.getOtherField(), cards, Place.MONSTERFIELD, Place.GRAVEYARD);
    }

    @Override
    public void doWill(Battle battle) {
        Card card1 = battle.getCurrentField().getDeck().getRandomCard();
        Card card2 = battle.getCurrentField().getDeck().getRandomCard();
        battle.getCurrentField().getHand().addCard(card1);
        battle.getCurrentField().getHand().addCard(card2);

    }
}
