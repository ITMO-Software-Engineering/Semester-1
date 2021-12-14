package Characters.OtherCharacters;

import Characters.Subject;
import Environment.Weather;

public class Tiger extends Subject {

    public void jumpForward(Weather weather) {
        if(weather.isBadWeather(weather)) {
            System.out.println(this.name + " always jump forward.");
        }
    }
}
