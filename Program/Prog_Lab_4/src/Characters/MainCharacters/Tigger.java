package Characters.MainCharacters;

import Characters.MyCharacter;
import Environment.Weather;

public class Tigger extends MainCharacter {
    public Tigger() {
        super("Tigger");
        System.out.println("There is a character called " + this.getName() + ".");
    }
    public Tigger(String name) {
        super(name);
        System.out.println("There is a character called " + this.getName() + ".");
    }
    public Tigger(Gender gender) {
        super(gender);
        System.out.println("There is a " + this.getGender().toString() + " character.");
    }
    public Tigger(String name, Gender gender) {
        super(name, gender);
        System.out.println("There is a " + this.getGender().toString() + " character called " + this.getName() + ".");
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
