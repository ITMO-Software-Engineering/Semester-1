package Characters.MainCharacters;

import Characters.*;
import Environment.Places.Place;

public class MainCharacter extends Subject {
    protected Mood[] mood;

    public enum Mood {
        UNKNOWN,
        NORMAL,
        AFRAID,
        SAD
    }

    public MainCharacter() {
        super();
        setMood(new Mood[]{Mood.UNKNOWN});
        System.out.println("There is a character we know nothing.");
    }

    public MainCharacter(String name) {
        super(name);
        setMood(new Mood[]{Mood.UNKNOWN});
        System.out.println("There is a character called" + this.getName());
    }
    public MainCharacter(String name, Mood[] mood) {
        super(name);
        this.mood = mood;
        System.out.println("There is a character called " + this.getName() + " Feels ");
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
