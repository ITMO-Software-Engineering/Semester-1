package Environment.Places;

import Characters.MyCharacter;

public class House extends Place {

    MyCharacter owner;

    public House() {
        this.owner = null;
        this.placeName = "Rabbit's House";
        System.out.println("There is a place called " + this.placeName + ".");
    }

    public House(MyCharacter owner) {
        this.owner = owner;
        this.placeName = this.owner.getName() + "'s House";
        System.out.println("There is a place called " + this.placeName + ".");
    }

}
