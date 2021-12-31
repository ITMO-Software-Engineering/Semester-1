package Object;

public class Thing {

    Character[] participants = new Character[7];
    private int numParticipants = 0;

    public enum State {
        GOOD,
        BAD,
        UNKNOWN
    }

    public void takePartIn(Character character) {

    }

    public void getWorse() {

    }

    public Character[] getParticipants() {
        return this.participants;
    }

    public int getNumParticipants() {
        return numParticipants;
    }
}
