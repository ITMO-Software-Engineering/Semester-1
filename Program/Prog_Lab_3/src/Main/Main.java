package Main;//Variant: 52190

import Characters.Gender;
import Characters.MainCharacters.MainCharacter;
import Characters.Subject;
import Environment.*;
import Environment.Places.HouseRabbit;

public class Main {
    public static void main(String[] args) {

        MainCharacter firstCharacter = new MainCharacter(Gender.MALE);

        Day day = new Day(1);
        Weather weather = new Weather(Weather.Status.WARM_AND_SUNNY);
        firstCharacter.move(false);

        day.goNextDay();
        weather.changeStatus(Weather.Status.COLD_AND_FOGGY);
        firstCharacter.setMood(new MainCharacter.Mood[]{});
    }
}
