package Main;//Variant: 52190

import Characters.MainCharacters.MainCharacter;
import Environment.*;

public class Main {
    public static void main(String[] args) {
        Day day = new Day(1);
        Weather weather = new Weather(Weather.Status.WARM_AND_SUNNY);
        MainCharacter firstCharacter = new MainCharacter("Pool", new MainCharacter.Mood[]{MainCharacter.Mood.UNKNOWN});
        MainCharacter secondCharacter = new MainCharacter("Piglet");
        MainCharacter thirdCharacter = new MainCharacter("Rabbit");
    }
}
