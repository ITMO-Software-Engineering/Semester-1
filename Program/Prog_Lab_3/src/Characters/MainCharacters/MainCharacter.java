package Characters.MainCharacters;

import Characters.*;
import Environment.Places.Place;
import Main.Main;

import java.util.Locale;

public class MainCharacter extends Subject {
    protected Mood[] mood;

    public enum Mood {
        UNKNOWN,
        NORMAL,
        NOT_AFRAID,
        SAD
    }

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
        System.out.println("There is a " + this.showGender() + " character.");
    }
    public MainCharacter(String name, Gender gender) {
        super(name, gender);
        System.out.println("There is a " + this.showGender() + " character called " + this.getName() + ".");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMood(Mood[] mood) {
        this.mood = mood;
        System.out.println(this.name + " feels " + this.showMood());
    }

    public void changeMood(Mood[] newMood) {
        this.mood = newMood;
    }

    public String showMood() {
        String allMood = new String();
        for(Mood mood : this.mood) {
            allMood += mood.toString().toLowerCase();
        }
        return allMood;
    }
}
