package Control.Functions;

import Models.Battle;
import Models.Cards.Classes.Monster;
import Models.Spell.Spell;
import Models.Spell.SpellChangeTarget;
import Models.Spell.SpellCollectionType;
import Models.Spell.Spellkind;

import java.util.ArrayList;
import java.util.List;

public class DoSpell {
    public static boolean play(Battle battle, Spell spell) {//
        if (spell.getSpellkind() == Spellkind.Increaser || spell.getSpellkind() == Spellkind.Decreaser) {
            if (spell.getSpellCollectionType() == SpellCollectionType.OwnAll) {
                List<Monster> list = new ArrayList<>(battle.getCurrentField().getMonsterField().returnMonsters());
                changeP(list, spell);
            } else if (spell.getSpellCollectionType() == SpellCollectionType.All) {
                List<Monster> monsters = new ArrayList<>(battle.getOtherField().getMonsterField().returnMonsters());
                changeP(monsters, spell);
            } else if (spell.getSpellCollectionType() == SpellCollectionType.SpecialRace) {
                ;
            }


        }
        return false;
    }


    private static void changeP(List<Monster> monsters, Spell spell) {
        for (Monster monster : monsters) {

            if (spell.getSpellChangeTarget() == SpellChangeTarget.AP && spell.getSpellkind() == Spellkind.Increaser) {
                monster.reduceAP(-spell.getAmount());
            } else if (spell.getSpellChangeTarget() == SpellChangeTarget.AP && spell.getSpellkind() == Spellkind.Decreaser)
                monster.reduceAP(spell.getAmount());
            else if (spell.getSpellChangeTarget() == SpellChangeTarget.AP && spell.getSpellkind() == Spellkind.Increaser) {
                monster.reduceHP(-spell.getAmount());
            } else if (spell.getSpellkind() == Spellkind.Decreaser && spell.getSpellChangeTarget() == SpellChangeTarget.MP) {
                monster.reduceHP(spell.getAmount());
            }
        }
    }
}