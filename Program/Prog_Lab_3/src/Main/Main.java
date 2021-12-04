package Main;//Variant: 52190

import Characters.MainCharacters.Mood;
import Characters.MainCharacters.MyCharacter;
import Environment.*;

public class Main {
    public static void main(String[] args) {
        Day day = new Day(1);
        Weather weather = new Weather(new Weather.Status[]{Weather.Status.SUNNY, Weather.Status.WARM});
        MyCharacter firstCharacter = new MyCharacter("Pool", new Mood[]{Mood.UNKNOWN});
        MyCharacter secondCharacter = new MyCharacter("Piglet");
        MyCharacter thirdCharacter = new MyCharacter("Rabbit");
    }
}
