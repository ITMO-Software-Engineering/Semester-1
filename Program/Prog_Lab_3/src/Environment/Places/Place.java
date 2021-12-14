package Environment.Places;

import Characters.MainCharacters.MainCharacter;
import Characters.Subject;

public class Place {
    String placeName;
    Subject[] member = new Subject[5];
    int numMember = 0;

    public Place() {
        this.placeName = "unknown place";
    }

    public Place(String placeName) {
        this.placeName = placeName;
    }

    public void arriveCharacter(MainCharacter character) {
        member[numMember] = character;
        numMember++;
    }

    public String getPlaceName() {
        return this.placeName;
    }

    public Subject[] getMember() {
        return member;
    }
}
