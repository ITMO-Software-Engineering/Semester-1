package Characters.OtherCharacters;

import Characters.Character;
import Environment.Places.*;
import Environment.Weather;

public class People extends Character {

    @Override
    public void showMood() {
        System.out.print(" feels " + this.mood.toString().replace('_', ' ').toLowerCase() + ".\n");
    }

    public People(Place place) {
        this.name = "people";
        this.setMood(Mood.UNKNOWN);
        this.location = place;
    }

    public void getLose(Weather weather) {
        if(weather.isBadWeather()) {
            this.setMood(Mood.COLD_AND_SAD);
            System.out.print(" who are lost in the " + this.location.toString());
            this.showMood();
        } else {
            System.out.print(".\n");
        }
    }

}
