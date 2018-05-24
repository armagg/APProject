package Models.Cards.Classes.monsterCards.spellCasterCards;

import Control.Functions.Operators;
import Models.Battle;
import Models.Cards.Classes.Card;
import Models.Cards.Classes.Monster;
import Models.Cards.Classes.Race;
import Models.Cards.Classes.SpellCasters;
import Models.Fields.Place;

import java.util.ArrayList;
import java.util.Random;

public final class BlueDragon extends SpellCasters {
    public BlueDragon() {
        super("Blue Dragon", 800, 1200, 5, Race.DragonBreed, false, false);
        setSpellDetails("Magical Fire: Move an enemy monster card from field to graveyard");
    }

    @Override
    public void DoSpell(Battle battle) {
        Random random = new Random();
        ArrayList<Card> cards = new ArrayList<>(1);
        int temp = battle.getOtherField().getMonsterField().getNumberOfCards();
        Monster monster = battle.getOtherField().getMonsterField().returnMonsters().get(random.nextInt(temp));
        cards.add(monster);
        Operators.replaceCards(battle.getOtherField(), cards, Place.MONSTERFIELD, Place.GRAVEYARD);
    }
}
