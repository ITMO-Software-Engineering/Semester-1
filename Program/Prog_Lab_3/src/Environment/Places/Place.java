package Environment.Places;

import Characters.MainCharacters.MainCharacter;
import Characters.Subject;

public abstract class Place {
    String placeName;
    Subject[] member = new Subject[5];
    int numMember = 0;

    public Place() {
    }

    public Place(String placeName) {
        this.placeName = placeName;
    }

    public void arriveCharacter(MainCharacter character) {
        System.out.println(character.getName() + " arrives at " + character.destination);
        member[numMember] = character;
        numMember++;
        character.location = character.destination;
        character.destination = null;
    }

    public String getPlaceName() {
        return this.placeName;
    }

    public Subject[] getMember() {
        return member;
    }
}
