package Characters.MainCharacters;

import Characters.*;
import Environment.Places.Place;

public class MyCharacter extends Subject implements Think, Say, Move {
    protected Mood[] mood;
    protected String name;
    protected Place place;

    public MyCharacter() {
        setName("Unknown");
        setMood(new Mood[]{Mood.UNKNOWN});
    }

    public MyCharacter(String name) {
        setName(name);
        setMood(new Mood[]{Mood.UNKNOWN});
    }
    public MyCharacter(String name, Mood[] mood) {
        setName(name);
        setMood(mood);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMood(Mood[] mood) {
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
