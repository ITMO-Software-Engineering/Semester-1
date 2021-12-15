package Characters.Interfaces;

import Environment.Places.Place;

public interface Move {
    void move();
    void move(boolean isTimeWasted);
    void move(Place destination);
    void move(Place destination, boolean isTimeWasted);

    Void think(String about);

    Void say(String words);
}
