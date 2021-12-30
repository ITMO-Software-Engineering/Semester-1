package Characters.MainCharacters;

import Characters.Character;
import Environment.Weather;

public class Tigger extends MainCharacter {
    public Tigger() {
        this.name = "tiger";
    }

    public String jumpForward(Weather weather) {
        if(weather.isBadWeather()) {
            return this.name + " always jump forward.";
        }
        return "";
    }
}
