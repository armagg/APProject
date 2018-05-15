package Control.interpreter;

import Models.Cards.Classes.Monster;
import Models.Cards.Classes.Normal;
import Models.Cards.Classes.Race;
import Models.Cards.Classes.SpellCasters;


public class Interpreter {
    final int normalCost = 300;
    final int spellCasterCost = 500;
    final int heroCost = 1000;
    final int generalCost = 700;

    public Normal creatNormal(String details) {
        Normal normal = (Normal) publicattributes(details);
        int cost = normalCost * normal.getMP();
        normal.setCost(cost);
        return normal;
    }

    public SpellCasters creatSpellcaster(String details, String spell) {
        SpellCasters spellCaster = new SpellCasters();

        Normal normal = (Normal) publicattributes(details);
        spellCaster.setAP(normal.getAP());

        return spellCaster;
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
            name = splited[0].substring(1, splited.length + 1);
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

