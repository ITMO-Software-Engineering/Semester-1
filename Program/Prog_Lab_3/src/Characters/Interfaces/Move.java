package Characters.Interfaces;

import Characters.OtherCharacters.Bees;
import Characters.OtherCharacters.People;
import Environment.Places.Place;

public interface Move {
    void move();
    void move(boolean isTimeWasted);
    void move(Place destination);
    void move(Place destination, boolean isTimeWasted);

    void think(String about);

    void say(String words);

    void think(Bees bees);

    void think(People people);
}
