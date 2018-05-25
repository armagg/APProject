package Models.Cards.Classes.spellCards;

import Models.Battle;
import Models.Cards.Classes.Monster;
import Models.Cards.Classes.SpellCards;
import Models.Cards.Classes.SpellType;
import Models.Cards.Classes.WhichAura;

public class WarDrum extends SpellCards {
    public WarDrum() {
        super("War Drum", 6, SpellType.AURA);
        setSpellDetails("Increase all friendly monster cards’ AP by 300");
    }

    @Override
    public void negativeSpell(Battle battle) {
        for (Monster monster : battle.getOtherField().getMonsterField().returnMonsters()) {
            if (monster.getWhichAura() == WhichAura.WARDRUM) {
                monster.setWhichAura(null);
                monster.reduceAP(300);
            }
        }
    }

    @Override
    public void doSpell(Battle battle) {
        for (Monster monster : battle.getCurrentField().getMonsterField().returnMonsters()) {
            monster.addAP(300);
            monster.setWhichAura(WhichAura.WARDRUM);
        }
    }
}
