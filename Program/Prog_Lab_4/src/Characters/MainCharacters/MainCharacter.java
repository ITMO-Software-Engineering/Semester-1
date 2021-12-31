package Characters.MainCharacters;

import Characters.Character;
import Environment.Places.Place;

public class MainCharacter extends Character {

    public MainCharacter() {
        super();
        System.out.println("There is a character we know nothing.");
    }
    public MainCharacter(String name) {
        super(name);
        System.out.println("There is a character called " + this.getName() + ".");
    }
    public MainCharacter(Gender gender) {
        super(gender);
        System.out.println("There is a " + this.gender.toString() + " character.");
    }
    public MainCharacter(String name, Gender gender) {
        super(name, gender);
        System.out.println("There is a " + this.gender.toString() + " character called " + this.getName() + ".");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(Place location) {
        super.setLocation(location);
        this.location.setMember(this);
    }
}
