package Main;//Variant: 52190

import Characters.Character;
import Characters.MainCharacters.*;
import Characters.OtherCharacters.*;
import Environment.*;
import Environment.Places.*;

public class Main {

    public static void main(String[] args) {

        {//part1
            Character smallThing = new Character("Small Things") {

            };
            System.out.println(smallThing.getName());

        }

        {//part 2
            MainCharacter firstCharacter = new MainCharacter(Character.Gender.MALE);

            Day day = new Day(1);
            Weather weather = new Weather(Weather.Status.WARM_AND_SUNNY);
            firstCharacter.move(false);

            day.goNextDay();
            weather.changeStatus(Weather.Status.COLD_AND_FOGGY);
            firstCharacter.setName("Pool");
            firstCharacter.setMood(Character.Mood.NOT_AFRAID);
            firstCharacter.showMood();

            Bees bees = new Bees();
            firstCharacter.think(true, bees, weather);
            firstCharacter.setMood(Character.Mood.SAD);
            firstCharacter.showMood();

            MainCharacter secondCharacter = new MainCharacter("Piglet", Character.Gender.MALE);
            firstCharacter.move(secondCharacter);
            firstCharacter.say(secondCharacter);
            secondCharacter.think(false, new Bees(), weather);
            Forest forest = new Forest();
            //Forest.Jungle jungle = forest.new Jungle();
            People people = new People(forest);
            secondCharacter.think(true, people, weather);

            MainCharacter thirdCharacter = new MainCharacter("Rabbit", Character.Gender.MALE);
            House houseRabbit = new House(thirdCharacter);
            thirdCharacter.setLocation(houseRabbit);
            firstCharacter.move(houseRabbit);
            secondCharacter.move(houseRabbit);
            houseRabbit.arriveMember(firstCharacter);
            houseRabbit.arriveMember(secondCharacter);

            houseRabbit.meetMember();
            houseRabbit.showMember();
            Tigger tigger = new Tigger();

            thirdCharacter.say("Today is the best day for adventure!");
            thirdCharacter.say("Because " + tigger.jumpForward(weather));
            thirdCharacter.say("As soon as he is out of sight, they will all run away and he will never see them again.");
        }

        {//part3

        }
    }
}
