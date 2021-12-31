package Characters.MainCharacters;

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

    public String jumpForward(Weather weather) {
        if(weather.isBadWeather()) {
            return this.getName() + " always jump forward.";
        }
        return "";
    }
}
