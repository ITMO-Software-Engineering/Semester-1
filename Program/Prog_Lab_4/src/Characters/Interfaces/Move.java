package Characters.Interfaces;

import Characters.MyCharacter;
import Environment.Places.Place;

public interface Move {
    void move();
    void move(boolean isTimeWasted);
    void move(Place destination);
    void move(Place destination, boolean isTimeWasted);
    void move(MyCharacter myCharacter);
    void move(MyCharacter myCharacter, boolean isTimeWasted);
}
