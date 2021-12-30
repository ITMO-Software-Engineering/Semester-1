package Main;//Variant: 52190

import Characters.Gender;
import Characters.MainCharacters.MainCharacter;
import Characters.MainCharacters.Mood;
import Characters.OtherCharacters.Bees;
import Characters.OtherCharacters.People;
import Characters.OtherCharacters.Tiger;
import Environment.Day;
import Environment.Places.HouseRabbit;
import Environment.Weather;

public class Main {

    public static void main(String[] args) {

        {//part1

        }

        {//part 2
            MainCharacter firstCharacter = new MainCharacter(Gender.MALE);

            Day day = new Day(1);
            Weather weather = new Weather(Weather.Status.WARM_AND_SUNNY);
            firstCharacter.move(false);

            day.goNextDay();
            weather.changeStatus(Weather.Status.COLD_AND_FOGGY);
            firstCharacter.setName("Pool");
            firstCharacter.setMood(Mood.NOT_AFRAID);
            firstCharacter.showMood();

            Bees bees = new Bees();
            firstCharacter.think(true, bees, weather);
            firstCharacter.setMood(Mood.SAD);
            firstCharacter.showMood();

            MainCharacter secondCharacter = new MainCharacter("Piglet", Gender.MALE);
            firstCharacter.move(secondCharacter);
            firstCharacter.say(secondCharacter);
            secondCharacter.think(false, new Bees(), weather);
            People people = new People();
            secondCharacter.think(true, people, weather);

            HouseRabbit houseRabbit = new HouseRabbit();
            MainCharacter thirdCharacter = new MainCharacter("Rabbit", Gender.MALE);
            thirdCharacter.setLocation(houseRabbit);
            firstCharacter.move(houseRabbit);
            secondCharacter.move(houseRabbit);
            houseRabbit.arriveMember(firstCharacter);
            houseRabbit.arriveMember(secondCharacter);

            houseRabbit.meetMember();
            Tiger tiger = new Tiger();
            MainCharacter tigger = new MainCharacter("Tiger",Gender.MALE) {
                public String jumpForward(Weather weather) {
                    if(weather.isBadWeather()) {
                        return this.name + " always jump forward.";
                    }
                    return "";
                }
            };

            thirdCharacter.say("Today is the best day for adventure!");
            thirdCharacter.say("Because " + tigger.jumpForward(weather));
            thirdCharacter.say("As soon as he is out of sight, they will all run away and he will never see them again.");
        }

        {//part3

        }
    }
}
