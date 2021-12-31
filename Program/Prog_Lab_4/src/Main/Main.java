package Main;//Variant: 52190

import Characters.MyCharacter;
import Characters.MainCharacters.*;
import Characters.OtherCharacters.*;
import Environment.*;
import Environment.Places.*;
import Object.*;

/**<p>Project name: Prog_Lab_4 </p>
 * @author <a href="https://github.com/Tolia-GH">Tolia</a>
 */
public class Main {

    public static void main(String[] args) {


        System.out.println("Introducing characters:\n");
        WinnieThePooh winnieThePooh = new WinnieThePooh();
        Piglet piglet = new Piglet();
        Rabbit rabbit = new Rabbit();
        Tigger tigger = new Tigger();
        Kanga kanga = new Kanga();
        Roo roo = new Roo();
        System.out.println();


        {//Scene 1
            System.out.println("Scene 1:\n");
            piglet.setMood(MyCharacter.Mood.VERY_HAPPY);
            piglet.showMood();

            Thing aGoodThing = new Thing(Thing.State.GOOD);
            piglet.believe(); aGoodThing.didBy(piglet);


            winnieThePooh.willTakePartIn(aGoodThing);
            rabbit.willTakePartIn(aGoodThing);
            aGoodThing.showParticipants();

            if(aGoodThing.checkParticipant(winnieThePooh) && aGoodThing.checkParticipant(rabbit)) {
                MainCharacter littleThings = new MainCharacter("little animals") {
                    @Override
                    public void willTakePartIn(Thing event) {
                        event.getParticipants()[event.getNumParticipants()] = this;
                        event.increaseNumParticipants(1);
                        System.out.println("If " + rabbit.getName() + " and " + winnieThePooh.getName() + " will take part in " + aGoodThing.getName());
                        System.out.println(this.getName() + " can also take part in " + event.getName() + " " + event.getState());
                    }
                };
                littleThings.willTakePartIn(aGoodThing);
            }

            System.out.println();
        }

        {//Scene 2
            System.out.println("Scene 2:\n");
            MainCharacter firstCharacter = new MainCharacter(MyCharacter.Gender.MALE);

            Day day = new Day(1);
            Weather weather = new Weather(Weather.Status.WARM_AND_SUNNY);
            firstCharacter.move(false);

            day.goNextDay();
            weather.changeStatus(Weather.Status.COLD_AND_FOGGY);
            firstCharacter.setName("Pool");
            firstCharacter.setMood(MyCharacter.Mood.NOT_AFRAID);
            firstCharacter.showMood();

            Bees bees = new Bees();
            firstCharacter.think(true, bees, weather);
            firstCharacter.setMood(MyCharacter.Mood.SAD);
            firstCharacter.showMood();

            MainCharacter secondCharacter = new MainCharacter("Piglet", MyCharacter.Gender.MALE);
            firstCharacter.move(secondCharacter);
            firstCharacter.tell(secondCharacter);
            secondCharacter.think(false, new Bees(), weather);
            Forest forest = new Forest();
            //Forest.Jungle jungle = forest.new Jungle();
            People people = new People(forest);
            secondCharacter.think(true, people, weather);

            MainCharacter thirdCharacter = new MainCharacter("Rabbit", MyCharacter.Gender.MALE);
            House houseRabbit = new House(thirdCharacter);
            thirdCharacter.setLocation(houseRabbit);
            firstCharacter.move(houseRabbit);
            secondCharacter.move(houseRabbit);
            houseRabbit.arriveMember(firstCharacter);
            houseRabbit.arriveMember(secondCharacter);

            houseRabbit.meetMember();
            houseRabbit.showMember();

            thirdCharacter.say("Today is the best day for adventure!");
            thirdCharacter.say("Because " + tigger.jumpForward(weather));
            thirdCharacter.say("As soon as he is out of sight, they will all run away and he will never see them again.");
        }

        {//part3

        }
    }
}
