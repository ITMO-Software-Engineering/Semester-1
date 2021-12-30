package Characters.Interfaces;

import Characters.Character;
import Environment.Places.Place;

public interface Move {
    void move();
    void move(boolean isTimeWasted);
    void move(Place destination);
    void move(Place destination, boolean isTimeWasted);
    void move(Character character);
    void move(Character character, boolean isTimeWasted);
}
