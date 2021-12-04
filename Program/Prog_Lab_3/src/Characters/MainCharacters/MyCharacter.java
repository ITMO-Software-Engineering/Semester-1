package Characters.MainCharacters;

import Characters.*;

public class MyCharacter extends Subject implements Think, Say, Move {
    protected Mood[] mood;
    protected String name;

    public MyCharacter() {
        this.name = "Unknown";
        this.mood = new Mood[]{Mood.UNKNOWN};
    }

    public MyCharacter(String name) {
        this.name = name;
        this.mood = new Mood[]{Mood.UNKNOWN};
    }
    public MyCharacter(String name, Mood[] mood) {
        this.name = name;
        this.mood = mood;
    }

    @Override
    public Void move() {
        return null;
    }

    public void changeMood(Mood[] newMood) {
        this.mood = newMood;
    }

    @Override
    public Void say(String words) {
        return null;
    }

    @Override
    public Void think(String about) {
        return null;
    }
}
