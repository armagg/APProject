package Models.Cards.Classes.spellCards;

import Models.Battle;
import Models.Cards.Classes.SpellCards;
import Models.Cards.Classes.SpellType;

public class FirstAidKit extends SpellCards {
    public FirstAidKit() {
        super("First Aid Kit", 3, SpellType.INSTANT);
        setSpellDetails("Increase HP of a selected friendly monster card or player by 500");
    }

    @Override
    public void doSpell(Battle battle) {

    }
}
