package Characters.OtherCharacters;

import Characters.Subject;
import Environment.Weather;

public class Bees extends Subject {

    public void makeHoney(Weather weather) {
        if(weather.isBadWeather(weather)) {
            System.out.println(this.name + "always jump forward.");
        }
    }
}
