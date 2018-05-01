package Models.Fields;

public class PlayField {
    MonsterField monsterField;

    public void setMonsterField(MonsterField monsterField) {
        this.monsterField = monsterField;
    }

    public void setSpellField(SpellField spellField) {
        this.spellField = spellField;
    }

    SpellField spellField;

    public SpellField getSpellField(){
        return spellField;
    }

    public MonsterField getMonsterField(){
        return monsterField;
    }
}
