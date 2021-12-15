package Environment.Places;

import Characters.MainCharacters.MainCharacter;
import Characters.Subject;

public abstract class Place {
    public String placeName;
    MainCharacter[] member = new MainCharacter[3];
    int numMember = 0;

    public Place() {
    }

    public Place(String placeName) {
        this.placeName = placeName;
    }

    public void setMember(MainCharacter character) {
        member[numMember] = character;
        numMember++;
    }
    public void arriveMember(MainCharacter character) {
        System.out.println(character.getName() + " arrives at " + character.destination.toString());
        member[numMember] = character;
        numMember++;
        character.location = character.destination;
        character.destination = null;
    }

    public void showMember() {
        System.out.print("In the " + this.placeName + " ");
        for(Subject sub : member) {
            if(sub == null) {
                continue;
            }
            System.out.print(sub.getName() + " ");
        }
        System.out.print(".\n");
    }

    public String getPlaceName() {
        return placeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Place place=(Place)o;
        if(this.hashCode()!=o.hashCode()){
            return false;
        }
        return (this.placeName == place.placeName);
    }

    public String toString() {
        return this.getPlaceName();
    }

}
