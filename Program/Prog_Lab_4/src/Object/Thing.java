package Object;

import Characters.MyCharacter;
import Environment.Weather;

public class Thing {

    private MyCharacter[] participants = new MyCharacter[7];
    private int numParticipants = 0;
    private String theThing;
    private State state;

    public Thing() {
        this.theThing = "something";
        this.state = State.UNKNOWN;
    }
    public Thing(State state) {
        this.theThing = "something";
        this.state = state;
    }
    public Thing(String theThing) {
        this.theThing = theThing;
        this.state = State.UNKNOWN;
    }
    public Thing(String theThing, State state) {
        this.theThing = theThing;
        this.state = state;
    }

    public enum State {
        GOOD,
        BAD,
        UNKNOWN;

        public String toString() {
            return super.toString().toLowerCase();
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public void takePartIn(MyCharacter myCharacter) {
        participants[numParticipants] = myCharacter;
        numParticipants++;
        System.out.println(myCharacter.getName() + " takes part in " + this.theThing + " " + this.state);
    }

    public void getWorse() {
        this.state = State.BAD;
        System.out.println(this.theThing + " gets worse.");
    }

    public MyCharacter[] getParticipants() {
        return this.participants;
    }

    public int getNumParticipants() {
        return numParticipants;
    }
}
