package Environment.Places;

import Characters.Character;
import Characters.MainCharacters.MainCharacter;

public class House extends Place {

    Character owner;

    public House() {
        this.owner = null;
        this.placeName = "Rabbit's House";
        System.out.println("There is a place called " + this.placeName + ".");
    }

    public House(Character owner) {
        this.owner = owner;
        this.placeName = this.owner.getName() + "'s House";
        System.out.println("There is a place called " + this.placeName + ".");
    }

}
