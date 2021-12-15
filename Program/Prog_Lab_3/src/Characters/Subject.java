package Characters;

import Characters.Interfaces.*;
import Characters.OtherCharacters.Bees;
import Characters.OtherCharacters.People;
import Environment.Places.Place;
import Environment.Places.UnknownPlace;

public abstract class Subject implements Move,Say,Think {

    protected String name;
    protected Gender gender;
    public Place location;
    public Place destination;

    public Subject() {
        this.name = "Someone";
        this.gender = Gender.UNKNOWN;
    }

    public Subject(String name) {
        this.name = name;
        this.gender = Gender.UNKNOWN;
    }

    public Subject(Gender gender) {
        if(gender.equals(Gender.FEMALE)) {
            this.name = "She";
        }
        else {
            this.name = "He";
        }
        this.gender = gender;
    }

    public Subject(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    @Override
    public void move() {
        this.destination = new UnknownPlace();
        System.out.println(this.name + " set out.");
    }

    @Override
    public void move(boolean isTimeWasted) {
        this.destination = new UnknownPlace();
        if(isTimeWasted) {
            System.out.println(this.name + " set out.");
        }
        else System.out.println(this.name + " set out without wasting any time.");
    }

    @Override
    public void move(Place destination) {
        this.destination = destination;
        System.out.println(this.name + " moves to " + this.destination.getPlaceName() + ".");
    }

    @Override
    public void move(Place destination, boolean isTimeWasted) {
        this.destination = destination;
        if(isTimeWasted) {
            System.out.println(this.name + " moves to " + this.destination.getPlaceName() + ".");
        }
        else {
            System.out.println(this.name + " moves to " + this.destination.getPlaceName() + "without wasting any time.");
        }
    }

    @Override
    public void say(String words) {
        System.out.println(this.getName() + " says: " + words);

    }

    @Override
    public void think(Bees bees) {
        System.out.print(this.name + " thinks about ");

    }

    @Override
    public void think(People people) {

    }

    public String getName() {
        return this.name;
    }

    public String showGender() {
        return this.gender.toString().toLowerCase();
    }

    public Place getLocation() {
        return this.location;
    }
}
