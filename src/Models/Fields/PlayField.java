package Models.Fields;

public class PlayField {
    MonsterField monsterField;
    SpellField spellField;

    public SpellField getSpellField(){
        return spellField;
    }

    public MonsterField getMonsterField(){
        return monsterField;
    }
}
