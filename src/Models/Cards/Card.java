package Models.Cards;

import Models.Thing;
import Models.Fields.Place;

public class Card extends Thing {
    private Race race;

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
