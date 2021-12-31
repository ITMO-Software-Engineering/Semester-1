package Characters.MainCharacters;

import Characters.MyCharacter;
import Environment.Weather;

public class Tigger extends MainCharacter {
    public Tigger() {
        super("Tigger");
    }
    public Tigger(String name) {
        super(name);
    }
    public Tigger(Gender gender) {
        super(gender);
    }
    public Tigger(String name, Gender gender) {
        super(name, gender);
    }

    public void showUp() {
        System.out.println(this.getName() + " shows up.");
    }

    public void disappear() {
        System.out.println(this.getName() + " disappeared.");
    }

    public void hit(MyCharacter character) {
        System.out.println(this.getName() + " hits " + character.getName() + '.');
    }

    public String jumpForward(Weather weather) {
        if(weather.isBadWeather()) {
            return this.getName() + " always jump forward.";
        }
        return "";
    }
}
