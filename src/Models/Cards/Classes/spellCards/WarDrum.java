package Models.Cards.Classes.spellCards;

import Models.Battle;
import Models.Cards.Classes.Monster;
import Models.Cards.Classes.SpellCards;
import Models.Cards.Classes.SpellType;

public class WarDrum extends SpellCards {
    public WarDrum() {
        super("War Drum", 6, SpellType.AURA);
        setSpellDetails("Increase all friendly monster cards’ AP by 300");
    }

    @Override
    public void doSpell(Battle battle) {
        for (Monster monster : battle.getCurrentField().getMonsterField().returnMonsters()) {
            monster.addAP(300);
        }
    }
}
