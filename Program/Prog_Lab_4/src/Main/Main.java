package Main;//Variant: 52190

import Characters.MyCharacter;
import Characters.MainCharacters.*;
import Characters.OtherCharacters.*;
import Environment.*;
import Environment.Places.*;
import MyExeption.Problem;
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
            piglet.believe(); piglet.doThing(aGoodThing);


            winnieThePooh.willTakePartIn(aGoodThing);
            rabbit.willTakePartIn(aGoodThing);
            aGoodThing.showParticipants();

            if(aGoodThing.checkParticipant(winnieThePooh) && aGoodThing.checkParticipant(rabbit)) {
                MainCharacter littleThings = new MainCharacter("Little animals") {
                    @Override
                    public void willTakePartIn(Thing event) {
                        event.getParticipants()[event.getNumParticipants()] = this;
                        event.increaseNumParticipants(1);
                        System.out.println(this.getName() + " can also take part in " + event.getName() + " " + event.getState());
                    }

                    public void sleep() {
                        System.out.println(this.getName() + " has a good sleep.");
                    }
                };

                System.out.println("If " + rabbit.getName() + " and " + winnieThePooh.getName() + " will take part in " + aGoodThing.getName());
                littleThings.willTakePartIn(aGoodThing);
                System.out.print("Then ");
                littleThings.sleep();
            }

            try {
                tigger.setLost(true);
            } catch (Problem problem) {
                problem.printDescription();
                problem.toBeSolve(piglet);
            }

            NorthPole northPole = new NorthPole();
            winnieThePooh.setMood(MyCharacter.Mood.HAPPY, "he is the first one who finds out " + northPole.placeName);
            winnieThePooh.showMood();

            northPole.arriveMember(winnieThePooh);
            northPole.arriveMember(rabbit);
            northPole.arriveMember(piglet);
            northPole.arriveMember(tigger);

            NorthPole.Inscription inscription = northPole.new Inscription();
            inscription.viewInscription(tigger);

            Thing thingTiggerDonNotKnow = new Thing("something " + tigger.getName() + " don't know now.");
            thingTiggerDonNotKnow.setDescription("which bear is he facing with - the A Yes Bear!");
            thingTiggerDonNotKnow.know(tigger);

            rabbit.getHouse().setNeighbors(new MainCharacter[]{kanga, roo, tigger});

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
