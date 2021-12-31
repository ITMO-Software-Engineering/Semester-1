package Characters.MainCharacters;

import Characters.Interfaces.Move;
import Characters.MyCharacter;
import Environment.Places.Place;

public class MainCharacter extends MyCharacter implements Move {

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
     * Move to the location of other myCharacter
     * @param myCharacter Set the destination
     */
    @Override
    public void move(MyCharacter myCharacter) {
        this.destination = myCharacter.location;
        System.out.println(this.name + " go to place " + myCharacter.getName() + ".");
    }

    /**
     * Move to the location of other myCharacter and check if time was wasted
     * @param myCharacter Set the destination
     * @param isTimeWasted Judge if time was wasted
     */
    @Override
    public void move(MyCharacter myCharacter, boolean isTimeWasted) {
        this.destination = myCharacter.location;
        if(isTimeWasted) {
            System.out.println(this.name + " go to place " + myCharacter.getName() + ".");
        }
        else System.out.println(this.name + " go to place " + myCharacter.getName() + " without wasting any time. ");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(Place location) {
        super.setLocation(location);
        this.location.setMember(this);
    }
}
