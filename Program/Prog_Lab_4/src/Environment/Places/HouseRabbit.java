package Environment.Places;

import Characters.Character;

public class HouseRabbit extends Place {

    public HouseRabbit() {
        this.placeName = "Rabbit's House";
        System.out.println("There is a place called " + this.placeName + ".");
    }

    public void showMember() {
        for(Character sub : this.member) {
            System.out.print(sub.getName() + " ");
        }
        System.out.print("meet at " + this.placeName + ".\n");
    }

}
