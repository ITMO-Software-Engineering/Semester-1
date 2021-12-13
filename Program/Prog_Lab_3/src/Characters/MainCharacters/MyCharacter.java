package Characters.MainCharacters;

import Characters.*;
import Environment.Places.Place;

public class MyCharacter extends Subject {
    protected Mood[] mood;
    protected String name;
    protected Place place;
    public enum Mood {
        UNKNOWN,
        NORMAL,
        AFRAID,
        SAD;
    }

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

    public void changeMood(Mood[] newMood) {
        this.mood = newMood;
    }

}
