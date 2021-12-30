package Characters;

import Characters.Interfaces.Move;
import Characters.Interfaces.Say;
import Characters.Interfaces.Think;
import Characters.OtherCharacters.Bees;
import Characters.OtherCharacters.People;
import Environment.Places.Place;
import Environment.Places.UnknownPlace;
import Environment.Weather;

public abstract class Character implements Move,Say,Think {

    public enum Gender {
        MALE,
        FEMALE,
        UNKNOWN
    }

    public enum Mood {
        UNKNOWN,
        VERY_HAPPY,
        NOT_AFRAID,
        SAD,
        COLD_AND_SAD
    }

    protected String name;
    protected Gender gender;
    public Mood mood;
    public Place location;
    public Place destination;

    public Character() {
        this.name = "Someone";
        this.gender = Gender.UNKNOWN;
        this.location = new UnknownPlace();
    }

    public Character(String name) {
        this.name = name;
        this.gender = Gender.UNKNOWN;
        this.location = new UnknownPlace();
    }

    public Character(Gender gender) {
        if(gender.equals(Gender.FEMALE)) {
            this.name = "She";
        }
        else {
            this.name = "He";
        }
        this.gender = gender;
        this.location = new UnknownPlace();
    }

    public Character(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
        this.location = new UnknownPlace();
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
        System.out.println(this.name + " moves to " + this.destination.toString() + ".");
    }

    @Override
    public void move(Place destination, boolean isTimeWasted) {
        this.destination = destination;
        if(isTimeWasted) {
            System.out.println(this.name + " moves to " + this.destination.toString() + ".");
        }
        else {
            System.out.println(this.name + " moves to " + this.destination.toString() + "without wasting any time.");
        }
    }

    @Override
    public void move(Character character) {
        this.destination = character.location;
        System.out.println(this.name + " go to place " + character.name + ".");
    }

    @Override
    public void move(Character character, boolean isTimeWasted) {
        this.destination = character.location;
        if(isTimeWasted) {
            System.out.println(this.name + " go to place " + character.name + ".");
        }
        else System.out.println(this.name + " go to place " + character.name + " without wasting any time. ");
    }

    @Override
    public void say() {
        System.out.println(this.name + "talk something to himself");
    }

    @Override
    public void say(String words) {
        System.out.println(this.getName() + " says: " + '"' + words + '"');
    }

    @Override
    public void say(Character character) {
        System.out.println(this.name + " tells " + character.name + " about this." );
    }

    @Override
    public void say(Character character, String words) {
        System.out.println(this.name + " tells " + character.name + ':' + '"' + words + '"');
    }

    @Override
    public void think(boolean is, Bees bees, Weather weather) {
        if(is) {
            System.out.print(this.name + " thinks about " + bees.name);
        } else {
            System.out.print(this.name + " thinks not about " + bees.name);
        }
        bees.makeHoney(weather);
    }

    @Override
    public void think(boolean is, People people, Weather weather) {
        if(is) {
            System.out.print(this.name + " thinks about " + people.name);
        } else {
            System.out.print(this.name + " thinks not about " + people.name);
        }
        people.getLose(weather);
    }

    public String getName() {
        return this.name;
    }

    public String showGender() {
        return this.gender.toString().toLowerCase();
    }

    public void setMood(Mood mood) {
        this.mood = mood;
    }

    public void showMood() {
        System.out.println(this.name + " feels " + this.mood.toString().replace('_', ' ').toLowerCase());
    }

    public void setLocation(Place location) {
        this.location = location;
    }

    public Place getLocation() {
        return this.location;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null) {
            return false;
        }
        if(getClass() != obj.getClass()) {
            return false;
        }

        Character sub = (Character) obj;
        return this.name.equals(sub.name) && this.gender.equals(sub.gender);
    }

    public int hashCode() {
        int result = 31;
        result = result * 31 + name.hashCode();
        result = result * 31 + gender.hashCode();

        return  result;
    }
}
