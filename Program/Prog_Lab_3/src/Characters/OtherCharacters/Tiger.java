package Characters.OtherCharacters;

import Characters.Subject;
import Environment.Weather;

public class Tiger extends Subject {

    public Tiger() {
        this.name = "tiger";
    }

    public void jumpForward(Weather weather) {
        if(weather.isBadWeather()) {
            System.out.println(this.name + " always jump forward.");
        }
    }
}
