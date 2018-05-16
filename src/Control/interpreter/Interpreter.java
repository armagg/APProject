package Control.interpreter;

import Models.Cards.Classes.*;
import Models.Spell.Spell;


public class Interpreter {
    final int normalCost = 300;
    final int spellCasterCost = 500;
    final int heroCost = 1000;
    final int generalCost = 700;

    public Normal creatNormal(String details) {
        Normal normal = (Normal) publicattributes(details);
        normal.setCost(normalCost * normal.getMP());
        return normal;
    }

    public SpellCasters creatSpellcaster(String details, String spell) {
        SpellCasters spellCaster = new SpellCasters();
        try {
            Normal normal = (Normal) publicattributes(details);
            spellCaster = (SpellCasters) setMonster(normal, MonsterType.SPELLCASTER);
            spellCaster.setCost(spellCasterCost * spellCaster.getMP());
            spellCaster.setSpell(new Spell(spell));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return spellCaster;
    }

    public Heroes creatHeros(String details, String spell, String battleCry, String will) {
        Normal normal = (Normal) publicattributes(details);
        Heroes hero = (Heroes) setMonster(normal, MonsterType.HERO);
        hero.setCost(heroCost * hero.getMP());
        hero.setSpell(new Spell(spell));
        hero.setBattleCry(new Spell(battleCry));
        hero.setWill(new Spell(will));

        return hero;
    }

    public Generals craetGenerals(String details, String battleCry, String will) {
        Normal normal = (Normal) publicattributes(details);
        Generals general = (Generals) setMonster(normal, MonsterType.GENERAL);
        general.setCost(generalCost * general.getMP());
        general.setBattleCry(new Spell(battleCry));
        general.setWill(new Spell(will));

        return general;
    }

    private static Monster setMonster(Monster normal, MonsterType monsterType) {
        Monster monster;
        if (monsterType == MonsterType.SPELLCASTER) {
            monster = new SpellCasters();
        } else if (monsterType == MonsterType.GENERAL) {
            monster = new Generals();
        } else {
            monster = new Heroes();
        }
        monster.setHP(normal.getHP());
        monster.setAP(normal.getAP());
        monster.setAwake(normal.isAwake());
        monster.setDefender(normal.isDefender());
        monster.setMP(normal.getMP());
        monster.setNimble(normal.isNimble());
        monster.setMonsterType(monsterType);
        return (Monster) monster;
    }
    private static Monster publicattributes(String details) {
        Normal normal = new Normal();
        String name = null;
        Race race = Race.Atlantians;
        boolean isNimble = false;
        boolean isDefender = false;
        String[] splited = new String[6];
        try {
            splited = details.split(" ");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            name = splited[0].substring(1, splited.length + 1);//maybe have a wrong structure.
        } catch (Exception e) {
            e.printStackTrace();
        }
        normal.setMP(Integer.valueOf(splited[1]));
        normal.setAP(Integer.valueOf(splited[2]));
        normal.setMP(Integer.valueOf(splited[3]));

        if (splited[4].equals("Defender")) {
            isDefender = true;
        } else if (splited[4].equals("Nimble")) {
            isNimble = true;
        }

        normal.setDefender(isDefender);
        normal.setNimble(isNimble);
        if (isNimble) {
            normal.setAwake(true);
        }

        if (splited[5].equals("DragonBreed")) {
            race = Race.DragonBreed;
        } else if (splited[5].equals("Elven")) {
            race = Race.Elves;
        } else if (splited.equals("Atlantian")) {
            race = Race.Atlantians;
        } else if (splited[5].equals("Goblin")) {
            race = Race.GOBLIN;
        } else if (splited[5].equals("Ogre")) {
            race = Race.ORGES;
        } else {
            race = Race.Demonic;
        }

        normal.setRace(race);

        return (Monster) normal;
    }

}

