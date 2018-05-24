package Models.Cards.Classes.monsterCards.spellCasterCards;

import Models.Battle;
import Models.Cards.Classes.Monster;
import Models.Cards.Classes.Race;
import Models.Cards.Classes.SpellCasters;

public final class EvilEye extends SpellCasters {
    public EvilEye() {
        super("Evil Eye", 400, 400, 6, Race.Demonic, false, false);
        setSpellDetails("Evil Gaze: Deal 800 damage to all enemy monster cards and player");
    }

    @Override
    public void DoSpell(Battle battle) {
        battle.getOtherHero().reduceHP(800);
        for (Monster monster : battle.getOtherField().getMonsterField().returnMonsters()) {
            monster.reduceHP(800);
        }
    }
}
