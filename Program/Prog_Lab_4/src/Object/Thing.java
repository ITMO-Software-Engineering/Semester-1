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
    }
    public Thing(String theThing) {
        this.theThing = theThing;
    }

    public enum State {
        GOOD,
        BAD,
        UNKNOWN
    }

    public void setState(State state) {
        this.state = state;
    }

    public void takePartIn(MyCharacter myCharacter) {
        System.out.println(myCharacter.getName());
    }

    public void getWorse() {

    }

    public MyCharacter[] getParticipants() {
        return this.participants;
    }

    public int getNumParticipants() {
        return numParticipants;
    }
}
