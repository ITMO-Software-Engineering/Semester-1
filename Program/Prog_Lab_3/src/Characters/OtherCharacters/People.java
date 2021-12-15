package Characters.OtherCharacters;

import Characters.Subject;
import Environment.Weather;

public class People extends Subject {

    public void getLose(Weather weather) {
        if(weather.isBadWeather(weather)) {
            System.out.println(this.name + " get lose.");
        }
    }

    @Override
    public void think(String about) {

    }
}
