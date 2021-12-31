package Object;

import Characters.MyCharacter;

public class Thing {

    MyCharacter[] participants = new MyCharacter[7];
    private int numParticipants = 0;

    public enum State {
        GOOD,
        BAD,
        UNKNOWN
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
