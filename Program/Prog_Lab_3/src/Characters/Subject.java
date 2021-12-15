package Characters;

import Characters.Interfaces.*;
import Environment.Places.HouseRabbit;
import Environment.Places.Place;
import Environment.Places.UnknownPlace;

public abstract class Subject implements Move {

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
    public Void say(String words) {
        System.out.println(this.getName() + " says: " + words);
        return null;
    }

    @Override
    public Void think(String about) {
        return null;
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
