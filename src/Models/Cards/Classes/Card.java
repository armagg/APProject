package Models.Cards.Classes;

import Models.Thing;
import Models.Fields.Place;

public abstract class Card extends Thing {
    int MP;

    protected Race race;
    protected Place place;



    public int getMP() {
        return MP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public Race getRace() {
        return race;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }


}
