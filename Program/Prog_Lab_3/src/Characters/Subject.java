package Characters;

import Characters.Interfaces.*;
import Environment.Places.Place;

public abstract class Subject implements Think, Say, Move {

    protected String name;
    protected Place location;
    protected Place destination;

    public Subject() {
        this.name = "Unknown";
        this.location = new Place();
    }

    public Subject(String name) {
        this.name = name;
        this.location = new Place();
    }

    public Subject(String name, Place location) {
        this.name = name;
        this.location = location;
    }

    @Override
    public Void move(Place destination) {
        this.destination = destination;
        System.out.println(this.getName());
        return null;
    }

    @Override
    public Void say(String words) {
        return null;
    }

    @Override
    public Void think(String about) {
        return null;
    }

    public String getName() {
        return this.name;
    }

    public Place getLocation() {
        return this.location;
    }

}
