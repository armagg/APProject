package Models.Cards.Classes.spellCards;

import Models.Battle;
import Models.Cards.Classes.Card;
import Models.Cards.Classes.Monster;
import Models.Cards.Classes.SpellCards;
import Models.Cards.Classes.SpellType;

import java.util.Random;

public class MeteorShower extends SpellCards {
    public MeteorShower() {
        super("Meteor Shower", 8, SpellType.CONTINOUS);
        setSpellDetails("Deal 800 damage to a random enemy monster card on field or player");
    }

    @Override
    public void doSpell(Battle battle) {
        Card card = new Monster();
        Random random = new Random();
        boolean hero = random.nextBoolean();
        if (hero) {
            battle.getOtherHero().reduceHP(800);
        } else {
            card = battle.getOtherField().getMonsterField().getRandomCard();
        }
        Monster monster = (Monster) card;
        monster.reduceHP(800);
    }
}
