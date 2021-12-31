package Characters;

import Characters.Interfaces.Move;
import Characters.Interfaces.Talk;
import Characters.Interfaces.Think;
import Characters.OtherCharacters.Bees;
import Characters.OtherCharacters.People;
import Environment.Places.Place;
import Environment.Places.UnknownPlace;
import Environment.Weather;
import org.jetbrains.annotations.NotNull;

public abstract class Character implements Move, Talk,Think {

    /**
     * All the genders of Characters
     */
    public enum Gender {
        MALE,
        FEMALE,
        UNKNOWN;
        public String toString() {
            return super.toString().toLowerCase();
        }
    }

    /**
     * All the moods of Characters
     */
    public enum Mood {
        VERY_HAPPY,
        NOT_AFRAID,
        SAD,
        COLD_AND_SAD,
        UNKNOWN;
        public String toString() {
            return super.toString().toLowerCase();
        }
    }

    /** Shows the name of Character
     */
    protected String name;
    /** Shows the gender of Character
     */
    protected Gender gender;
    /** Shows the mood of character
     */
    protected Mood mood;
    /** Shows the location of character
     */
    public Place location;
    /** Shows where the character is going to
     */
    public Place destination;

    /**
     * Build an unknown object which name is "Someone", gender is {@link Gender}.UNKNOWN, location is {@link UnknownPlace}
     */
    public Character() {
        this.name = "Someone";
        this.gender = Gender.UNKNOWN;
        this.location = new UnknownPlace();
    }

    /**
     * Build an object which gender is {@link Gender}.UNKNOWN, location is new {@link UnknownPlace} and set its name
     * @param name Set the name of this object
     */
    public Character(String name) {
        this.name = name;
        this.gender = Gender.UNKNOWN;
        this.location = new UnknownPlace();
    }

    /**
     * Build an object which gender is {@link Gender}.UNKNOWN, location is new {@link UnknownPlace} and set its gender
     * @param gender Set the gender of this object
     */
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

    /**
     * Build an object which gender is {@link Gender}.UNKNOWN, location is new {@link UnknownPlace} and set its name and gender
     * @param name Set the name of this object
     * @param gender Set the gender of this object
     */
    public Character(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
        this.location = new UnknownPlace();
    }

    /**
     * Walk around
     */
    @Override
    public void move() {
        System.out.println(this.name + " walk around.");
    }

    /**
     * Walk around and check if time was wasted
     * @param isTimeWasted Judge if the time was wasted
     */
    @Override
    public void move(boolean isTimeWasted) {
        if(isTimeWasted) {
            System.out.println(this.name + " walk around.");
        }
        else System.out.println(this.name + " walk around without wasting any time.");
    }

    /**
     * Move to the destination
     * @param destination Set the destination of this movement
     */
    @Override
    public void move(Place destination) {
        this.destination = destination;
        System.out.println(this.name + " moves to " + this.destination.toString() + ".");
    }

    /**
     * Move to the destination and check if time was wasted
     * @param destination Set the destination of this movement
     * @param isTimeWasted Judge if time was wasted
     */
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

    /**
     * Move to the location of other character
     * @param character Set the destination
     */
    @Override
    public void move(Character character) {
        this.destination = character.location;
        System.out.println(this.name + " go to place " + character.name + ".");
    }

    /**
     * Move to the location of other character and check if time was wasted
     * @param character Set the destination
     * @param isTimeWasted Judge if time was wasted
     */
    @Override
    public void move(Character character, boolean isTimeWasted) {
        this.destination = character.location;
        if(isTimeWasted) {
            System.out.println(this.name + " go to place " + character.name + ".");
        }
        else System.out.println(this.name + " go to place " + character.name + " without wasting any time. ");
    }

    /**
     * Say something
     * @param words The words which was said
     */
    @Override
    public void say(String words) {
        System.out.println(this.getName() + " says: " + '"' + words + '"');
    }

    /**
     * Say to who about something unknown
     * @param character The target of this conversation
     */
    @Override
    public void tell(@org.jetbrains.annotations.NotNull Character character) {
        System.out.println(this.name + " tells " + character.name + " about this." );
    }

    /**
     * Talk something to who
     * @param character The target of this conversation
     * @param words The words which was said
     */
    @Override
    public void say(@NotNull Character character, String words) {
        System.out.println(this.name + " tells " + character.name + ':' + '"' + words + '"');
    }

    /**
     * Ask someone something
     * @param character The target of this question
     * @param words The words which was asked
     */
    @Override
    public void ask(Character character, String words) {
        System.out.println(this.name + " asks " + character.name + ':' + '"' + words + '"');
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

    /**
     * Get the name of this object
     * @return The name of this object
     */
    public String getName() {
        return this.name;
    }

    public Gender getGender() {
        return this.gender;
    }

    public Mood getMood() {
        return this.mood;
    }

    public Place getLocation() {
        return this.location;
    }

    public Place getDestination() {
        return this.destination;
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

    public void setDestination(Place destination) {
        this.destination = destination;
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

    @Override
    public int hashCode() {
        int result = 31;
        result = result * 31 + name.hashCode();
        result = result * 31 + gender.hashCode();

        return  result;
    }
}
