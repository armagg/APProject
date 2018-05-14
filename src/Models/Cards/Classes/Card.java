package Models.Cards.Classes;

import Models.Thing;
import Models.Fields.Place;

public class Card extends Thing {
    protected int MP;

    private Race race;


    public int getMP() {
        return MP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public Race getRace() {
        return race;
    }

    private Place place;

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }
}
