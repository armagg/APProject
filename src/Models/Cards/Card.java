package Models.Cards;

import Models.Fields.Place;
import Models.Thing;

public class Card extends Thing {
    private Place place;

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }
}
